package org.company.strategy;

public class StrategyContext {

    MowerStrategy resolveStrategy(Mower mower) {
        MowerStrategy mowerStrategy = null;

        switch (mower.getOrientation()) {
            case EAST:
                mowerStrategy = new EastStrategy();
            case WEST:
                mowerStrategy = new WestStartegy();
            case NORTH:
                mowerStrategy = new NorthStrategy();
            case SOUTH:
                mowerStrategy = new SouthStrategy();
        }
        return mowerStrategy;
    }
}
