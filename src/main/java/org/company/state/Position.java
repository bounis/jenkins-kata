package org.company.state;

public class Position {

    private int absciss;
    private int ordinate;
    private Orientation orientation;


    public Position() {
    }

    public Position(int absciss, int ordinate, Orientation orientation) {
        this.absciss = absciss;
        this.ordinate = ordinate;
        this.orientation = orientation;
    }

    public int getAbsciss() {
        return absciss;
    }

    public void setAbsciss(int absciss) {
        this.absciss = absciss;
    }

    public int getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(int ordinate) {
        this.ordinate = ordinate;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
