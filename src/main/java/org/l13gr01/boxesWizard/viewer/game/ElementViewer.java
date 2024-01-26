package org.l13gr01.boxesWizard.viewer.game;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.elements.Element;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}
