package org.company.state;

public class WestState extends State {

    private static final WestState westState = new WestState();

    private WestState() {
    }

    public static WestState getInstance() {
        return westState;
    }
    @Override
    public void turnRight() {
        this.mower.getPosition().setOrientation(Orientation.NORTH);
        NorthState northState = NorthState.getInstance();
        northState.setMower(mower);
        mower.setState(northState);
    }

    @Override
    public void turnLeft() {
        mower.getPosition().setOrientation(Orientation.SOUTH);
        SouthState southState = SouthState.getInstance();
        southState.setMower(mower);
        mower.setState(southState);
    }

    @Override
    public void advance() {
        mower.getPosition().setAbsciss(mower.getPosition().getAbsciss() - 1);
    }
}
