package org.company.state;

public abstract class State {

    protected Mower mower;

    public abstract void turnRight();
    public abstract void turnLeft();
    public abstract void advance();
}
