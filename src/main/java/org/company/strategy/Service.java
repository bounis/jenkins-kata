package org.company.strategy;

import java.util.Arrays;
import java.util.List;

public class Service {


    public void start(Mower mower) {
        StrategyContext strategyContext = new StrategyContext();
        MowerStrategy mowerStrategy = strategyContext.resolveStrategy(mower);

        List<String> commands = Arrays.asList("D", "G", "A");

        mowerStrategy.turnRight(mower);
    }
}
