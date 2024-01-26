package org.l13gr01.boxesWizard.model.game.elements;
import org.junit.jupiter.api.Test;
import org.l13gr01.boxesWizard.model.Position;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WizardTest {
    @Test
    public void testConstructorAndGetters() {
        int x = 5;
        int y = 9;

        Wizard wizard = new Wizard(x, y);

        assertEquals(x, wizard.getPosition().getX());
        assertEquals(y, wizard.getPosition().getY());
        assertEquals(1, wizard.getLife());
    }
    @Test
    public void testSetPosition() {
        int orig_X = 2;
        int orig_Y = 8;
        Wizard wizard = new Wizard(orig_X, orig_Y);

        int newX = 3;
        int newY = 7;
        Position newPosition = new Position(newX, newY);
        wizard.setPosition(newPosition);

        assertEquals(newX, wizard.getPosition().getX());
        assertEquals(newY, wizard.getPosition().getY());
    }

    @Test
    public void testDecreaseLife() {
        Wizard wizard = new Wizard(3, 6);
        wizard.decreaseLife();
        assertEquals(0, wizard.getLife());
    }

    @Test
    public void testGetLife() {
        Wizard wizard = new Wizard(0, 0);
        int life = wizard.getLife();
        assertEquals(1, life);
    }
}