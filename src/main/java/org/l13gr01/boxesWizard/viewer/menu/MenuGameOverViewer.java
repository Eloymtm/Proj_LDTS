package org.l13gr01.boxesWizard.viewer.menu;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.Position;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.viewer.Viewer;

public class MenuGameOverViewer extends Viewer<Menu> {
    public MenuGameOverViewer(Menu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(2, 7),  "  ███    ██   ██ ██ █████    ███  █    █ █████ █████ ", "#FFFFFF");
        gui.drawText(new Position(2, 8),  " █      █  █  ██ ██ █       █   █ █    █ █     █   █ ", "#FFFFFF");
        gui.drawText(new Position(2, 9),  " █ ███ █    █ █ █ █ ████    █   █ █    █ ████  ████", "#FFFFFF");
        gui.drawText(new Position(2, 10), " █  █  ██████ █   █ █       █   █  █  █  █     █   █", "#FFFFFF");
        gui.drawText(new Position(2, 11), "  ███  █    █ █   █ █████    ███    ██   █████ █   █ ", "#FFFFFF");
        gui.drawText(new Position(2, 15), "                      !YOU WON! ", "#B48395");

        drawFrame(gui);

        gui.drawText(new Position(16, 24), "|Press <ENTER> to continue|", "#FFFFFF");

    }
}