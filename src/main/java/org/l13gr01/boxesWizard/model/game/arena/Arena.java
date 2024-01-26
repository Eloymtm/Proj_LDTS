package org.l13gr01.boxesWizard.model.game.arena;

import org.l13gr01.boxesWizard.model.Position;
import org.l13gr01.boxesWizard.model.game.elements.Wizard;
import org.l13gr01.boxesWizard.model.game.elements.Diamonds;
import org.l13gr01.boxesWizard.model.game.elements.Wall;
import org.l13gr01.boxesWizard.model.game.elements.Spikes;
import org.l13gr01.boxesWizard.model.game.elements.Boxes;
import org.l13gr01.boxesWizard.model.game.elements.Trophy;

import java.util.List;

public class Arena {
    private final int width;
    private final int height;

    private Wizard wizard;

    private List<Diamonds> diamonds = List.of();
    private List<Wall> walls = List.of();

    private List<Spikes> spikes = List.of();
    private List<Boxes> boxes = List.of();

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
    }
    private Trophy trophy=new Trophy(0,0);

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Wizard getWizard() {
        return wizard;
    }

    public void setWizard(Wizard wizard) {
        this.wizard = wizard;
    }

    public List<Diamonds> getDiamonds() {
        return diamonds;
    }

    public void setDiamonds(List<Diamonds> diamonds) {
        this.diamonds = diamonds;
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public List<Spikes> getSpikes() {
        return spikes;
    }
    public void setSpikes(List<Spikes> spikes) {
        this.spikes = spikes;
    }

    public List<Boxes> getBoxes() {
        return boxes;
    }
    public void setBoxes(List<Boxes> boxes) {
        this.boxes = boxes;
    }
    public Trophy getTrophy() {
        return trophy;
    }

    public void setTrophy(Trophy trophy) {
        this.trophy = trophy;
    }


    public boolean isEmpty(Position position) {
        for (Wall wall : walls)
            if (wall.getPosition().equals(position))
                return false;
        return true;
    }


    public boolean isSpikes(Position position) {
        for (Spikes spikes : spikes)
            if (spikes.getPosition().equals(position))
                return true;
        return false;
    }

    public boolean isDiamonds(Position position) {
        for (Diamonds diamond : diamonds)
            if (diamond.getPosition().equals(position))
                return true;
        return false;
    }

}
