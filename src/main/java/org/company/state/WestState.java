package org.company.state;

public class WestState extends State {

    @Override
    public void turnRight() {
        this.orientation = Orientation.NORTH;
        this.mower.setState(new NorthState());
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void advance() {

    }
}
