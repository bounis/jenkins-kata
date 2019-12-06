package org.company.state;

import java.util.Arrays;
import java.util.List;

import org.company.command.Command;
import org.company.command.CommandContext;

public class BusinessService {


    public void start(Mower mower) {
        List<String> characters = Arrays.asList("G", "A", "G", "A", "G", "A", "G", "A", "A");
        characters.stream().map(CommandContext::resolveCommand).forEach(cmd -> cmd.execute(mower));
        System.out.println(mower.getPosition().toString());
    }
}
