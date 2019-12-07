package org.company.state;

public class TheApp {

    public static void main(String[] args) {
        BusinessService businessService = new BusinessService();
        Position position = new Position(3, 3, Orientation.EAST);
        Mower mower = new Mower();
        mower.setPosition(position);
        NorthState northState = NorthState.getInstance();
        northState.setMower(mower);
        mower.setState(northState);
        businessService.start(mower);
    }
}
