package org.company.state;

public class TheApp {

    public static void main(String[] args) {
        BusinessService businessService = new BusinessService();
        Position position = new Position(1, 2, Orientation.NORTH);
        Mower mower = new Mower(position, new NorthState());
        businessService.start(mower);
    }
}
