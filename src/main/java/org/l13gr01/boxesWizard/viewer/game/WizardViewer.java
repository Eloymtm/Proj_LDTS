package org.l13gr01.boxesWizard.viewer.game;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.elements.Wizard;

public class WizardViewer implements ElementViewer<Wizard> {
    @Override
    public void draw(Wizard wizard, GUI gui) {

        gui.drawWizard(wizard.getPosition());
    }
}
