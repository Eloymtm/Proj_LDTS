package org.l13gr01.boxesWizard.viewer.game;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.elements.Spikes;

public class SpikesViewer  implements ElementViewer<Spikes> {
    @Override
    public void draw(Spikes spikes, GUI gui) {
        gui.drawSpikes(spikes.getPosition());
    }
}
