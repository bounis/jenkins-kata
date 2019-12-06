package org.company.state;

public class Mower {

    private Position position;
    private State state;

    public Mower() {
    }


    public void changeState(State state) {
        this.state = state;
    }

    public void turnRight() {
        this.state.turnRight();
    }

    public void turnLeft() {
        this.state.turnLeft();
    }

    public void advance() {
        this.state.advance();
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
