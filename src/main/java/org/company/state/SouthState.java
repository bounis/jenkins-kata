package org.company.state;

public class SouthState extends State {

    private static final SouthState southState = new SouthState();

    private SouthState() {
    }

    public static SouthState getInstance() {
        return southState;
    }

    @Override
    public void turnRight() {
        mower.getPosition().setOrientation(Orientation.WEST);
        WestState westState = WestState.getInstance();
        westState.setMower(mower);
        mower.setState(westState);

    }

    @Override
    public void turnLeft() {
        mower.getPosition().setOrientation(Orientation.EAST);
        EastState eastState = EastState.getInstance();
        eastState.setMower(mower);
        mower.setState(eastState);
    }

    @Override
    public void advance() {
        mower.getPosition().setOrdinate(mower.getPosition().getOrdinate() - 1);
    }
}
