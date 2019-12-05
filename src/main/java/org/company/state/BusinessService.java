package org.company.state;

import java.util.Arrays;
import java.util.List;

public class BusinessService {


    public void start(Mower mower) {
        List<Character> characters = Arrays.asList('G', 'A', 'G', 'A', 'G', 'A', 'G', 'A', 'A');
        mower.getState().turnLeft();
    }
}
