package org.company.state;

public class NorthState extends State {
    @Override
    public void turnRight() {
        mower.setOrientation(Orientation.EAST);
        mower.changeState(new EastState());
    }

    @Override
    public void turnLeft() {
        mower.
        mower.changeState(new WestState());
    }

    @Override
    public void advance() {
        mower.setOrdinate(mower.getOrdinate() + 1);
    }
}
