package org.company.command;

import org.company.state.Mower;

public class CommandTurnRight implements Command {

    private static final CommandTurnRight commandTurnRight = new CommandTurnRight();

    private CommandTurnRight() {
    }

    public static Command getInstance() {
        return commandTurnRight;
    }

    @Override
    public void execute(Mower mower) {
        mower.turnRight();
    }
}
