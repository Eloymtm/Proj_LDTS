package org.l13gr01.boxesWizard.states;

import org.l13gr01.boxesWizard.controller.Controller;
import org.l13gr01.boxesWizard.controller.game.ArenaController;
import org.l13gr01.boxesWizard.model.game.arena.Arena;
import org.l13gr01.boxesWizard.viewer.Viewer;
import org.l13gr01.boxesWizard.viewer.game.GameViewer;

public class GameState extends State<Arena> {
    public GameState(Arena arena) {
        super(arena);
    }

    @Override
    protected Viewer<Arena> getViewer() {
        return new GameViewer(getModel());
    }

    @Override
    protected Controller<Arena> getController() {
        return new ArenaController(getModel());
    }
}
