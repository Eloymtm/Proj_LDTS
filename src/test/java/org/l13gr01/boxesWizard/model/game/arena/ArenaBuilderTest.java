package org.l13gr01.boxesWizard.model.game.arena;

import org.junit.jupiter.api.Test;
import org.l13gr01.boxesWizard.model.game.elements.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaBuilderTest {

    private static class TestArenaBuilder extends ArenaBuilder {
        @Override
        protected int getWidth() {
            return 10;
        }

        @Override
        protected int getHeight() {
            return 8;
        }

        @Override
        protected List<Wall> createWalls() {
            return List.of(new Wall(1, 1), new Wall(2, 2));
        }

        @Override
        protected List<Diamonds> createDiamonds() {
            return List.of(new Diamonds(3, 3), new Diamonds(4, 4));
        }

        @Override
        protected Wizard createWizard() {
            return new Wizard(5, 5);
        }

        @Override
        protected List<Spikes> createSpikes() {
            return List.of(new Spikes(6, 6), new Spikes(7, 7));
        }

        @Override
        protected List<Boxes> createBoxes() {
            return List.of(new Boxes(8, 8), new Boxes(9, 9));
        }

        @Override
        protected Trophy createTrophy() {
            return new Trophy(10, 10);
        }
    }

    @Test
    public void testCreateArena() {
        ArenaBuilder arbuilder = new TestArenaBuilder();

        Arena arena = arbuilder.createArena();

        assertEquals(10, arena.getWidth());
        assertEquals(8, arena.getHeight());
        assertNotNull(arena.getWizard());
        assertEquals(2, arena.getWalls().size());
        assertEquals(2, arena.getDiamonds().size());
        assertNotNull(arena.getTrophy());
    }
}

