package org.l13gr01.boxesWizard.viewer.game;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.elements.Diamonds;

public class DiamondsViewer implements ElementViewer<Diamonds> {
    @Override
    public void draw(Diamonds diamonds, GUI gui) {
        gui.drawDiamond(diamonds.getPosition());
    }
}
