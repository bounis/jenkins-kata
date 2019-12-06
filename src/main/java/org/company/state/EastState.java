package org.company.state;

public class EastState extends State {


    private EastState() {
    }

    @Override
    public void turnRight() {
        this.mower.getPosition().setOrientation(Orientation.SOUTH);
        this.mower;
        new SouthState().
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void advance() {

    }
}
