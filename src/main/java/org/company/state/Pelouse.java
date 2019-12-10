package org.company.state;

import java.util.HashSet;
import java.util.Set;


public class Pelouse {

    private static Pelouse pelouse;

    private Point upperCornerCoordinate;
    private Point lowerCornerCoordinate;
    private Set<Mower> mowers = new HashSet<>();

    private Pelouse() {
    }


    public static Pelouse getInstance() {
        return pelouse;
    }

    public static void createPelouse(String pelouseCoordinateLine) {
        if (pelouse == null) {
            String regex = " ";
            String[] upperCr = pelouseCoordinateLine.split(regex);
            pelouse = new Pelouse(new Point(Integer.parseInt(upperCr[0]), Integer.parseInt(upperCr[1])));
        }
    }


    public Pelouse(Point upperCornerCoordinate) {
        this.upperCornerCoordinate = upperCornerCoordinate;
        this.lowerCornerCoordinate = new Point(0,0);
    }

    public Point getUpperCornerCoordinate() {
        return upperCornerCoordinate;
    }

    public Point getLowerCornerCoordinate() {
        return lowerCornerCoordinate;
    }

    public void addMower(Mower mower) {
        mowers.add(mower);
    }
}
