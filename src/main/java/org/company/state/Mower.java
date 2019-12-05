package org.company.state;

public class Mower {

    private int absciss;
    private int ordinate;
    private State state;

    public Mower() {
    }


    public Mower(int absciss, int ordinate, State state) {
        this.absciss = absciss;
        this.ordinate = ordinate;
        this.state = state;
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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
