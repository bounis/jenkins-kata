package org.company.state;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.IntStream;

import org.company.command.Command;
import org.company.command.CommandResolver;
import org.company.dto.PositionCommandsLine;
import org.company.io.IOHelper;
import org.company.io.MowerBufferdReader;

public class BusinessService {


    public void start(Path path) {

        try (MowerBufferdReader br = IOHelper.createMowerBufferedReader(path)) {
            String s = br.readLine();
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
        IntStream chars = positionCommandsLine.getCommandsLine().chars();
        chars.mapToObj(CommandResolver::resolve).forEach(cmd -> cmd.execute(mower));
        System.out.println(mower.getPosition());
    }
}
