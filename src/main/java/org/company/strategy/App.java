package org.company.strategy;

public class App {

    public static void main(String[] args) {
        Mower mower = new Mower();
        Service service = new Service();
        service.start(mower);
    }
}
