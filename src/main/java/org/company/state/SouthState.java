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

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void advance() {

    }
}
