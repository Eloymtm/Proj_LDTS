package org.l13gr01.boxesWizard.viewer.game;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.elements.Trophy;


public class TrophyViewer implements ElementViewer<Trophy> {
    @Override
    public void draw(Trophy trophy, GUI gui) {gui.drawTrophy(trophy.getPosition());}
}
