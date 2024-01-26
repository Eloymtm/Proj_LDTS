package org.l13gr01.boxesWizard.controller.menu;

import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.controller.Controller;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.arena.LoaderArenaBuilder;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.states.GameState;

import java.io.IOException;

public class MenuController extends Controller<Menu> {
    public MenuController(Menu menu) {
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                System.out.println("SELECT");
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedStart()) game.setState(new GameState(new LoaderArenaBuilder(level).createArena()));
                break;
            default:
                break;
        }
    }
}
