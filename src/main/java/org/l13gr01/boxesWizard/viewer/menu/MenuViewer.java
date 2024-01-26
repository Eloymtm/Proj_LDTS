package org.l13gr01.boxesWizard.viewer.menu;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.Position;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.viewer.Viewer;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(14, 5),  "███    ███   █   █  ████   ███", "#FFFFFF");
        gui.drawText(new Position(14, 6),  "█  █  █   █   █ █   █     █ ", "#FFFFFF");
        gui.drawText(new Position(14, 7),  "███   █   █    █    ███    ███ ", "#FFFFFF");
        gui.drawText(new Position(14, 8),  "█  █  █   █   █ █   █         █", "#FFFFFF");
        gui.drawText(new Position(14, 9),  "████   ███   █   █  ████  ████  ", "#FFFFFF");
        //gui.drawText(new Position(19, 7), "\\\\", "#00FFEF");

        gui.drawText(new Position(11, 11),   "█     █  ███  ███    █    ███   ███", "#FFFFFF");
        gui.drawText(new Position(11, 12),   "█     █   █     █   █ █   █  █  █  █", "#FFFFFF");
        gui.drawText(new Position(11, 13),   " █ █ █    █    █   █   █  ███   █  █", "#FFFFFF");
        gui.drawText(new Position(11, 14),   " █ █ █    █   █    █████  █  █  █  █", "#FFFFFF");
        gui.drawText(new Position(11, 15),   "  █ █    ███  ███  █   █  █  █  ███", "#FFFFFF");

        drawFrame(gui);

        gui.drawText(new Position(26, 20), "MENU", "#9F5F9F");
        //(5,5)
        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(26, 22 + i),//new Position(26, 22 + i)
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFFFFF" : "#42426F");//Azul Corn Flower -#42426F,AZUL-#3333DD

        gui.drawText(new Position(5, 18),  " _______________        ", "#5F4A61");
        gui.drawText(new Position(5, 19),  "|  -       -    | ", "#5F4A61");
        gui.drawText(new Position(5, 20),  "| |1|     |2|   | ", "#5F4A61");
        gui.drawText(new Position(5, 21),  "|  -       -    | ", "#5F4A61");
        gui.drawText(new Position(5, 22),  "|Change  Change | ", "#5F4A61");
        gui.drawText(new Position(5, 23),  "|pos. w/ pos. w/| ", "#5F4A61");
        gui.drawText(new Position(5, 24),  "| Box1    Box2  |", "#5F4A61");
        gui.drawText(new Position(5, 25),  " _______________", "#5F4A61");

    }
}
