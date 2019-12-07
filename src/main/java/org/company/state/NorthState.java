package org.company.state;

public class NorthState extends State {

    private static final NorthState northState = new NorthState();

    private NorthState() {
    }

    public static NorthState getInstance() {
        return northState;
    }

    @Override
    public void turnRight() {
        mower.getPosition().setOrientation(Orientation.EAST);
        EastState eastState = EastState.getInstance();
        eastState.setMower(mower);
        mower.setState(eastState);
    }

    @Override
    public void turnLeft() {
        mower.getPosition().setOrientation(Orientation.WEST);
        WestState westState = WestState.getInstance();
        westState.setMower(mower);
        mower.setState(westState);
    }

    @Override
    public void advance() {
        mower.getPosition().setOrdinate(mower.getPosition().getOrdinate() + 1);
    }
}
