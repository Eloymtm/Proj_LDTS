package org.l13gr01.boxesWizard.model.game.arena;

import org.l13gr01.boxesWizard.model.game.elements.Spikes;
import org.l13gr01.boxesWizard.model.game.elements.Wizard;
import org.l13gr01.boxesWizard.model.game.elements.Diamonds;
import org.l13gr01.boxesWizard.model.game.elements.Wall;
import org.l13gr01.boxesWizard.model.game.elements.Boxes;
import org.l13gr01.boxesWizard.model.game.elements.Trophy;

import java.util.ArrayList;
import java.util.List;

public class ConstructorArenaBuilder extends ArenaBuilder {

    private final int width;
    private final int height;

public ConstructorArenaBuilder(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected int getWidth() {
        return width;
    }

    @Override
    protected int getHeight() {
        return height;
    }

    @Override
    protected List<Wall> createWalls() {
            List<Wall> walls = new ArrayList<>();

            // Create boundary walls
            for (int x = 0; x < width; x++) {
                walls.add(new Wall(x, 0));
                walls.add(new Wall(x, height - 1));
            }

            for (int y = 1; y < height - 1; y++) {
                walls.add(new Wall(0, y));
                walls.add(new Wall(width - 1, y));
            }

            // Create internal walls to form platforms and obstacles
            for (int x = 3; x < width - 3; x++) {
                walls.add(new Wall(x, height / 2));
            }

            return walls;
    }

    @Override
    protected List<Diamonds> createDiamonds() {
        List<Diamonds> diamonds = new ArrayList<>();
        return diamonds;
    }

    @Override
    protected Wizard createWizard() {
        return new Wizard(width / 2, height / 2);
    }

    @Override
    protected List<Spikes> createSpikes() {
        List<Spikes> spikes = new ArrayList<>();
        return spikes;
    }
    @Override
    protected List<Boxes> createBoxes() {
        List<Boxes> boxes = new ArrayList<>();
        return boxes;
    }

    @Override
    protected Trophy createTrophy() {
        return new Trophy(width / 2+1, height / 2+1);
    }

}
