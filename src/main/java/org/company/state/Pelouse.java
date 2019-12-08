package org.company.state;

import org.company.exception.ObjectAlreadyCreatedException;

public class Pelouse {

    private static Pelouse pelouse;

    private Pelouse() {
        if (pelouse != null) {
            throw new ObjectAlreadyCreatedException("pelouse already created !!");
        }
    }


    public static Pelouse getInstance() {
        return pelouse;
    }

    public static void createPelouse() {
        if (pelouse == null) {
            pelouse = new Pelouse();
        }
    }
}
