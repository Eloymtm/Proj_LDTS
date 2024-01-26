package org.l13gr01.boxesWizard.model.game.arena;

import org.junit.jupiter.api.Test;
import org.l13gr01.boxesWizard.model.game.elements.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoaderArenaBuilderTest {

    @Test
    public void testCreateArenaLevel1() throws Exception {
        LoaderArenaBuilder builder = new LoaderArenaBuilder(1);
        Arena arena = builder.createArena();

        assertNotNull(arena);
        assertEquals(60, arena.getWidth());
        assertEquals(28, arena.getHeight());

        Wizard wizard = arena.getWizard();
        assertNotNull(wizard);
        assertEquals(8, wizard.getPosition().getX());
        assertEquals(23, wizard.getPosition().getY());

        List<Diamonds> diamonds = arena.getDiamonds();
        assertEquals(3, diamonds.size());

        List<Boxes> boxes = arena.getBoxes();
        assertEquals(2, boxes.size());

        Trophy trophy = arena.getTrophy();
        assertNotNull(trophy);

    }

    @Test
    public void testCreateArenaLevel2() throws Exception {
        LoaderArenaBuilder builder = new LoaderArenaBuilder(2);
        Arena arena = builder.createArena();

        assertNotNull(arena);
        assertEquals(59, arena.getWidth());
        assertEquals(29, arena.getHeight());

        Wizard wizard = arena.getWizard();
        assertNotNull(wizard);
        assertEquals(3, wizard.getPosition().getX());
        assertEquals(24, wizard.getPosition().getY());

        List<Diamonds> diamonds = arena.getDiamonds();
        assertEquals(3, diamonds.size());

        List<Boxes> boxes = arena.getBoxes();
        assertEquals(2, boxes.size());

        Trophy trophy = arena.getTrophy();
        assertNotNull(trophy);
    }

    @Test
    public void testCreateArenaLevel3() throws Exception {
        LoaderArenaBuilder builder = new LoaderArenaBuilder(3);
        Arena arena = builder.createArena();

        assertNotNull(arena);
        assertEquals(60, arena.getWidth());
        assertEquals(29, arena.getHeight());

        Wizard wizard = arena.getWizard();
        assertNotNull(wizard);
        assertEquals(4, wizard.getPosition().getX());
        assertEquals(11, wizard.getPosition().getY());

        List<Diamonds> diamonds = arena.getDiamonds();
        assertEquals(3, diamonds.size());

        List<Boxes> boxes = arena.getBoxes();
        assertEquals(2, boxes.size());

        List<Spikes> spikes = arena.getSpikes();
        assertEquals(37, spikes.size());

        Trophy trophy = arena.getTrophy();
        assertNotNull(trophy);
    }
}
