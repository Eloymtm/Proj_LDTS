package org.l13gr01.boxesWizard.controller.menu;

import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.controller.Controller;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.states.MenuState;

import java.io.IOException;

public class MenuGameOverController extends Controller<Menu> {
    public MenuGameOverController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case SELECT: game.setState(new MenuState(new Menu()));
                break;
            default:
                break;
        }
    }
}
