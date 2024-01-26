package org.l13gr01.boxesWizard.controller.game;

import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.arena.Arena;
import org.l13gr01.boxesWizard.model.game.arena.LoaderArenaBuilder;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.states.GameState;
import org.l13gr01.boxesWizard.states.MenuGameOverState;
import org.l13gr01.boxesWizard.states.MenuState;
import org.l13gr01.boxesWizard.controller.Controller;

import java.io.IOException;

public class ArenaController extends GameController {
    private final WizardController wizardcontroller;
    public ArenaController(Arena arena) {
        super(arena);

        this.wizardcontroller = new WizardController(arena);
    }
    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT || getModel().getWizard().getLife() <= 0){
            game.setState(new MenuState(new Menu()));
            Controller.level = 1;
        }
        else if((getModel().getWizard().getPosition().equals(getModel().getTrophy().getPosition()) && Controller.level == 3)){
            game.setState(new MenuGameOverState(new Menu()));
            Controller.level = 1;
        }

        else if((getModel().getWizard().getPosition().getY() == getModel().getTrophy().getPosition().getY() && getModel().getWizard().getPosition().getX() == getModel().getTrophy().getPosition().getX())){
            Controller.level++;
            game.setState(new GameState(new LoaderArenaBuilder(Controller.level).createArena()));
        }


        else {
            wizardcontroller.step(game, action, time);
        }
    }
}
