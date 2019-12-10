package org.company.state;

import org.company.command.CommandResolver;
import org.company.dto.PositionCommandsLine;
import org.company.io.IOHelper;
import org.company.io.MowerBufferdReader;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.IntStream;

public class BusinessService {

    private static final BusinessService businessService = new BusinessService();

    private BusinessService() {
    }

    public static BusinessService getInstance() {
        return businessService;
    }

    public void startMowers(Path path) {

        try (MowerBufferdReader br = IOHelper.createMowerBufferedReader(path)) {
            Pelouse.createPelouse(br.readLine());
            br.readLines().forEach(this::runMower);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void runMower(PositionCommandsLine positionCommandsLine) {

        Position position = Position.createPosition(positionCommandsLine.getPositonLine());
        State state = StateResolver.resolve(position.getOrientation());
        Mower mower = new Mower(position, state);
        state.setMower(mower);
        Pelouse.getInstance().addMower(mower);
        IntStream chars = positionCommandsLine.getCommandsLine().chars();
        chars.mapToObj(CommandResolver::resolve).forEach(cmd -> cmd.execute(mower));
        System.out.println(mower.getPosition());
    }
}
