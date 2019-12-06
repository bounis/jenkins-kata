package org.company.state;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mower {

    private Position position;
    private State state;

    public void turnRight() {
        this.state.turnRight();
    }

    public void turnLeft() {
        this.state.turnLeft();
    }

    public void advance() {
        this.state.advance();
    }

}
