package org.l13gr01.boxesWizard.model.game.elements;

import org.l13gr01.boxesWizard.model.Position;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpikesTest {
    @Test
    public void testConstructorAndGetters() {
        int x = 1;
        int y = 9;
        Spikes spikes = new Spikes(x, y);
        assertEquals(x, spikes.getPosition().getX());
        assertEquals(y, spikes.getPosition().getY());
    }

    @Test
    public void testSetPosition() {
        int orig_X = 2;
        int orig_Y = 8;
        Spikes spikes = new Spikes(orig_X, orig_Y);

        int newX = 3;
        int newY = 7;
        Position newPosition = new Position(newX, newY);
        spikes.setPosition(newPosition);

        assertEquals(newX, spikes.getPosition().getX());
        assertEquals(newY, spikes.getPosition().getY());
    }
}