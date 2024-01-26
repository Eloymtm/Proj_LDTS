package org.l13gr01.boxesWizard.model.game.arena;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConstructorArenaBuilderTest {

    @Test
    public void testCreateArena() {
        int width = 10;
        int height = 8;
        ConstructorArenaBuilder builder = new ConstructorArenaBuilder(width, height);

        Arena arena = builder.createArena();

        assertEquals(width, arena.getWidth());
        assertEquals(height, arena.getHeight());
        assertNotNull(arena.getWizard());
        assertNotNull(arena.getTrophy());
        assertFalse(arena.getWalls().isEmpty());
    }

}
