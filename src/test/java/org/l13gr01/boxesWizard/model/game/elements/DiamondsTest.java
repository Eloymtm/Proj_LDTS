package org.l13gr01.boxesWizard.model.game.elements;

import org.l13gr01.boxesWizard.model.Position;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiamondsTest {
    @Test
    public void testConstructorAndGetters() {
        int x = 1;
        int y = 9;
        Diamonds diamonds = new Diamonds(x, y);
        assertEquals(x, diamonds.getPosition().getX());
        assertEquals(y, diamonds.getPosition().getY());
    }

    @Test
    public void testSetPosition() {
        int orig_X = 2;
        int orig_Y = 8;
        Diamonds diamonds = new Diamonds(orig_X, orig_Y);

        int newX = 3;
        int newY = 7;
        Position newPosition = new Position(newX, newY);
        diamonds.setPosition(newPosition);

        assertEquals(newX, diamonds.getPosition().getX());
        assertEquals(newY, diamonds.getPosition().getY());
    }
}