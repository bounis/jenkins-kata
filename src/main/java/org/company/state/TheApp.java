package org.company.state;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TheApp {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/bounis/JAVA/jenkins-kata/file.txt");
        new BusinessService().start(path);




 /*       BusinessService businessService = new BusinessService();
        Position position = new Position(3, 3, Orientation.EAST);
        Mower mower = new Mower();
        mower.setPosition(position);
        NorthState northState = NorthState.getInstance();
        northState.setMower(mower);
        mower.setState(northState);
        businessService.start(mower);*/
    }
}
