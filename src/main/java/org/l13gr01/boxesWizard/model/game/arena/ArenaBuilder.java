package org.l13gr01.boxesWizard.model.game.arena;

import org.l13gr01.boxesWizard.model.game.elements.Spikes;
import org.l13gr01.boxesWizard.model.game.elements.Wizard;
import org.l13gr01.boxesWizard.model.game.elements.Diamonds;
import org.l13gr01.boxesWizard.model.game.elements.Wall;
import org.l13gr01.boxesWizard.model.game.elements.Boxes;
import org.l13gr01.boxesWizard.model.game.elements.Trophy;

import java.util.List;

public abstract class ArenaBuilder {
    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight());

        arena.setWizard(createWizard());
        arena.setDiamonds(createDiamonds());
        arena.setWalls(createWalls());
        arena.setSpikes(createSpikes());
        arena.setBoxes(createBoxes());
        arena.setTrophy(createTrophy());

        return arena;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Wall> createWalls();

    protected abstract List<Diamonds> createDiamonds();

    protected abstract Wizard createWizard();
    protected abstract List<Spikes> createSpikes();
    protected abstract List<Boxes> createBoxes();
    protected abstract Trophy createTrophy();
}
