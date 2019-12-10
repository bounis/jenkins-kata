package org.company.state;

public class EastState extends State {

    private static final EastState eastState = new EastState();
    private EastState() {
    }

    public static EastState getInstance() {
        return eastState;
    }

    @Override
    public void turnRight() {
        mower.getPosition().setOrientation(Orientation.SOUTH);
        SouthState southState = SouthState.getInstance();
        southState.setMower(mower);
        mower.setState(southState);
    }

    @Override
    public void turnLeft() {
        this.mower.getPosition().setOrientation(Orientation.NORTH);
        NorthState northState = NorthState.getInstance();
        northState.setMower(mower);
        mower.setState(northState);
    }

    @Override
    public void advance() {

        int previousAbsciss = mower.getPosition().getCoordinate().getAbsciss();
        int newAbsciss = previousAbsciss + 1;
        if (newAbsciss <= Pelouse.getInstance().getUpperCornerCoordinate().getAbsciss()) {
            mower.getPosition().getCoordinate().setAbsciss(newAbsciss);
        }
    }
}
