package org.company.command;

import org.company.state.Mower;

public class CommandTurnLeft implements Command {

    private static final CommandTurnLeft commandTurnLeft = new CommandTurnLeft();

    private CommandTurnLeft() {
    }

    public static CommandTurnLeft getInstance() {
        return commandTurnLeft;
    }

    @Override
    public void execute(Mower mower) {
        mower.turnLeft();
    }
}
