package org.l13gr01.boxesWizard.model.game.elements;

import org.l13gr01.boxesWizard.model.Position;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxesTest {

    @Test
    public void testConstructorAndGetters() {
        int x = 1;
        int y = 9;
        Boxes boxes = new Boxes(x, y);
        assertEquals(x, boxes.getPosition().getX());
        assertEquals(y, boxes.getPosition().getY());
    }

    @Test
    public void testSetPosition() {
        int orig_X = 2;
        int orig_Y = 8;
        Boxes boxes = new Boxes(orig_X, orig_Y);

        int newX = 3;
        int newY = 7;
        Position newPosition = new Position(newX, newY);
        boxes.setPosition(newPosition);

        assertEquals(newX, boxes.getPosition().getX());
        assertEquals(newY, boxes.getPosition().getY());
    }
}