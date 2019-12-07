package org.company.command;

import org.company.state.Mower;

@FunctionalInterface
public interface Command {

    void execute(Mower mower);
}
