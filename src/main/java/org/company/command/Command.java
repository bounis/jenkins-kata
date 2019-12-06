package org.company.command;

import org.company.state.Mower;

public interface Command {

    void execute(Mower mower);
}
