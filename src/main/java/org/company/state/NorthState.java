package org.company.state;

public class NorthState extends State {
    @Override
    public void turnRight() {
        mower.getPosition().setOrientation(Orientation.EAST);
        mower.setState(new EastState());
    }

    @Override
    public void turnLeft() {
        mower.getPosition().setOrientation(Orientation.WEST);
        mower.setState(new WestState());
    }

    @Override
    public void advance() {
        mower.getPosition().setOrdinate(mower.getPosition().getOrdinate() + 1);
    }
}
