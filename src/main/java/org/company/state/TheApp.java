package org.company.state;

public class TheApp {

    public static void main(String[] args) {
        BusinessService businessService = new BusinessService();
        Mower mower = new Mower(1, 2, new NorthState());
        businessService.start(mower);
    }
}
