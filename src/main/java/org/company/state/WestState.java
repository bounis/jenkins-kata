package org.company.state;

public class WestState extends State {

    private static final WestState westState = new WestState();
    @Override
    public void turnRight() {
        this.mower.getPosition().setOrientation(Orientation.NORTH);
        this.mower.setState(new NorthState());
    }

    @Override
    public void turnLeft() {
        this.mower.getPosition().setOrientation(Orientation.SOUTH);
        this.mower.setState(new SouthState());
    }

    @Override
    public void advance() {
        this.mower.getPosition().setAbsciss(this.mower.getPosition().getAbsciss() - 1);
    }
}
