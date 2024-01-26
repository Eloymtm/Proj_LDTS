package org.l13gr01.boxesWizard.model.game.elements;

import org.l13gr01.boxesWizard.model.Position;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrophyTest {
    @Test
    public void testConstructorAndGetters() {
        int x = 1;
        int y = 9;
        Trophy trophy = new Trophy(x, y);
        assertEquals(x, trophy.getPosition().getX());
        assertEquals(y, trophy.getPosition().getY());
    }

    @Test
    public void testSetPosition() {
        int orig_X = 2;
        int orig_Y = 8;
        Trophy trophy = new Trophy(orig_X, orig_Y);

        int newX = 3;
        int newY = 7;
        Position newPosition = new Position(newX, newY);
        trophy.setPosition(newPosition);

        assertEquals(newX, trophy.getPosition().getX());
        assertEquals(newY, trophy.getPosition().getY());
    }
}