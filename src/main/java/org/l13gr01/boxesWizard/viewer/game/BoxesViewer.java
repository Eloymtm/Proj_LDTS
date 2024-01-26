package org.l13gr01.boxesWizard.viewer.game;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.elements.Boxes;

public class BoxesViewer implements ElementViewer<Boxes> {
    @Override
    public void draw(Boxes boxes, GUI gui) {
        gui.drawBoxes(boxes.getPosition());
    }
}
