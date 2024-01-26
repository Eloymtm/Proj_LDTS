package org.l13gr01.boxesWizard.model.game.elements;

import org.l13gr01.boxesWizard.model.Position;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WallTest {
    @Test
    public void testConstructorAndGetters() {
        int x = 1;
        int y = 9;
        Wall wall = new Wall(x, y);
        assertEquals(x, wall.getPosition().getX());
        assertEquals(y, wall.getPosition().getY());
    }

    @Test
    public void testSetPosition() {
        int orig_X = 2;
        int orig_Y = 8;
        Wall wall = new Wall(orig_X, orig_Y);

        int newX = 3;
        int newY = 7;
        Position newPosition = new Position(newX, newY);
        wall.setPosition(newPosition);

        assertEquals(newX, wall.getPosition().getX());
        assertEquals(newY, wall.getPosition().getY());
    }
}