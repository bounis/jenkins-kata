package org.company.command;

import java.util.List;

public class CommandContext {

    public static Command resolveCommand(String s) {
        Command command = null;
        switch (s) {
            case "A":
                command = CommandAdvance.getInstance();
                break;
            case "D":
                command = CommandTurnRight.getInstance();
                break;
            case "G":
                command = CommandTurnLeft.getInstance();
                break;
        }
        return command;
    }
}
