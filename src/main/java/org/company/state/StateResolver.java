package org.company.state;

import org.company.exception.UnknownOrientationException;

public class StateResolver {

    public static State resolve(Orientation orientation) {
        switch (orientation) {
            case EAST:
                return EastState.getInstance();
            case WEST:
                return WestState.getInstance();
            case NORTH:
                return NorthState.getInstance();
            case SOUTH:
                return SouthState.getInstance();
        }
        throw new UnknownOrientationException("unknown orientation passed");
    }
}
