package org.company.state;

import java.util.Arrays;

public enum Orientation {
    NORTH("N"), EAST("E"), WEST("W"), SOUTH("S");

    private String acrony;

    Orientation(String s) {
        this.acrony = s;
    }


    public static Orientation fromValue(String s) {
        return Arrays.stream(Orientation.values()).filter(v -> v.acrony.equals(s)).findFirst().get();
    }
}
