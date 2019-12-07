package org.company.command;

import org.company.exception.UnknownCommandException;

public class CommandContext {

    public static Command resolveCommand(String s) {

        switch (s) {
            case "A":
                return CommandAdvance.getInstance();
            case "D":
                return CommandTurnRight.getInstance();
            case "G":
                return CommandTurnLeft.getInstance();
        }
        throw new UnknownCommandException("unknown passed command");
    }
}
