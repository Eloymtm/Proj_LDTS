package org.l13gr01.boxesWizard.controller.game;

import org.l13gr01.boxesWizard.controller.Controller;
import org.l13gr01.boxesWizard.model.game.arena.Arena;

public abstract class GameController extends Controller<Arena> {
    public GameController(Arena arena) {
        super(arena);
    }
}
