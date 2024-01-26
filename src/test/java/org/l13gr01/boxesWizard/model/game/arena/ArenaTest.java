package org.l13gr01.boxesWizard.model.game.arena;

import org.l13gr01.boxesWizard.model.Position;
import org.l13gr01.boxesWizard.model.game.elements.Wizard;
import org.l13gr01.boxesWizard.model.game.elements.Diamonds;
import org.l13gr01.boxesWizard.model.game.elements.Wall;
import org.l13gr01.boxesWizard.model.game.elements.Spikes;
import org.l13gr01.boxesWizard.model.game.elements.Boxes;
import org.l13gr01.boxesWizard.model.game.elements.Trophy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {
    private Arena arena;

    @BeforeEach
    public void setUp() {
        arena = new Arena(10, 10);
    }

    @Test
    public void testGettersAndSetters() {
        Wizard wizard = new Wizard(2, 3);
        List<Diamonds> diamonds = List.of(new Diamonds(4, 5), new Diamonds(6, 7));
        List<Wall> walls = List.of(new Wall(8, 9));
        List<Spikes> spikes = List.of(new Spikes(1, 1));
        List<Boxes> boxes = List.of(new Boxes(2, 2));
        Trophy trophy = new Trophy(3, 3);

        arena.setWizard(wizard);
        arena.setDiamonds(diamonds);
        arena.setWalls(walls);
        arena.setSpikes(spikes);
        arena.setBoxes(boxes);
        arena.setTrophy(trophy);

        assertEquals(wizard, arena.getWizard());
        assertEquals(diamonds, arena.getDiamonds());
        assertEquals(walls, arena.getWalls());
        assertEquals(spikes, arena.getSpikes());
        assertEquals(boxes, arena.getBoxes());
        assertEquals(trophy, arena.getTrophy());
    }

    @Test
    public void testIsEmpty() {
        Wall wall = new Wall(3, 3);
        arena.setWalls(List.of(wall));

        assertTrue(arena.isEmpty(new Position(1, 1)));
        assertFalse(arena.isEmpty(new Position(3, 3)));
    }

    @Test
    public void testIsSpikes() {
        Spikes spikes = new Spikes(2, 2);
        arena.setSpikes(List.of(spikes));

        assertTrue(arena.isSpikes(new Position(2, 2)));
        assertFalse(arena.isSpikes(new Position(1, 1)));
    }

    @Test
    public void testIsDiamonds() {
        Diamonds diamond = new Diamonds(4, 4);
        arena.setDiamonds(List.of(diamond));

        assertTrue(arena.isDiamonds(new Position(4, 4)));
        assertFalse(arena.isDiamonds(new Position(1, 1)));
    }

}
