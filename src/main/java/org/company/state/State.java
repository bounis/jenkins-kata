package org.company.state;

public abstract class State {

    protected Orientation orientation;

    protected Mower mower;

    abstract void turnRight();

    abstract void turnLeft();

    abstract void advance();
}
