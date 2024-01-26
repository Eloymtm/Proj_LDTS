package org.l13gr01.boxesWizard.controller.game;

import org.l13gr01.boxesWizard.controller.game.WizardController;
import org.l13gr01.boxesWizard.model.Position;
import org.l13gr01.boxesWizard.model.game.arena.Arena;
import org.l13gr01.boxesWizard.model.game.elements.Wizard;
import org.l13gr01.boxesWizard.model.game.elements.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WizardControllerTest {
    private WizardController controller;
    private Wizard wizard;
    private Arena arena;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10);

        wizard = new Wizard(5, 5);
        arena.setWizard(wizard);

        arena.setWalls(Arrays.asList());
        arena.setDiamonds(Arrays.asList());

        controller = new WizardController(arena);
    }

    @Test
    void moveWizardRightEmpty() {
        controller.moveWizardRight();
        assertEquals(new Position(6, 5), wizard.getPosition());
    }

    @Test
    void moveWizardRightNotEmpty() {
        arena.setWalls(Arrays.asList(new Wall(6, 5)));
        controller.moveWizardRight();
        assertEquals(new Position(5, 5), wizard.getPosition());
    }

    @Test
    void moveWizardLeftEmpty() {
        controller.moveWizardLeft();
        assertEquals(new Position(4, 5), wizard.getPosition());
    }

    @Test
    void moveWizardLeftNotEmpty() {
        arena.setWalls(Arrays.asList(new Wall(4, 5)));
        controller.moveWizardLeft();
        assertEquals(new Position(5, 5), wizard.getPosition());
    }

    @Test
    void moveWizardUpEmpty() {
        controller.moveWizardUp();
        assertEquals(new Position(5, 3), wizard.getPosition());
    }

    @Test
    void moveWizardUpNotEmpty() {
        arena.setWalls(Arrays.asList(new Wall(5, 3)));
        controller.moveWizardUp();
        assertEquals(new Position(5, 5), wizard.getPosition());
    }

    @Test
    void moveWizardDownEmpty() {
        controller.moveWizardDown();
        assertEquals(new Position(5, 6), wizard.getPosition());
    }

    @Test
    void moveWizardDownNotEmpty() {
        arena.setWalls(Arrays.asList(new Wall(5, 6)));
        controller.moveWizardDown();
        assertEquals(new Position(5, 5), wizard.getPosition());
    }

    @Test
    void moveWizardRightAndUpEmpty() {
        controller.moveWizardRight();
        controller.moveWizardUp();
        assertEquals(new Position(6, 3), wizard.getPosition());
    }
}