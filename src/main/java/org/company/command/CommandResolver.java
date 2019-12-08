package org.company.command;

import org.company.exception.UnknownCommandException;

public class CommandResolver {

    public static Command resolve(int i) {

        char c = (char) i;
        switch (c) {
            case 'A':
                return CommandAdvance.getInstance();
            case 'D':
                return CommandTurnRight.getInstance();
            case 'G':
                return CommandTurnLeft.getInstance();
        }
        throw new UnknownCommandException("unknown passed command");
    }
}
