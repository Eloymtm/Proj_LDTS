package org.l13gr01.boxesWizard.viewer.game;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.Position;
import org.l13gr01.boxesWizard.model.game.arena.Arena;
import org.l13gr01.boxesWizard.model.game.elements.Element;
import org.l13gr01.boxesWizard.viewer.Viewer;

import java.util.List;

public class GameViewer extends Viewer<Arena> {
    public GameViewer(Arena arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        drawElements(gui, getModel().getWalls(), new WallViewer());
        drawElements(gui, getModel().getDiamonds(), new DiamondsViewer());
        drawElement(gui, getModel().getWizard(), new WizardViewer());
        drawElements(gui, getModel().getSpikes(), new SpikesViewer());
        drawElements(gui, getModel().getBoxes(), new BoxesViewer());
        drawElement(gui, getModel().getTrophy(), new TrophyViewer());


        gui.drawText(new Position(0, 0), "Life: " + getModel().getWizard().getLife(), "#CA3433");//#fee8b3 ,ORIGINAL-#FFD700

    }


    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }
    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}
