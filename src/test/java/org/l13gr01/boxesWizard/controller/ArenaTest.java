/*package org.l13gr01.boxesWizard.controller;

import org.junit.jupiter.api.Assertions;
import org.l13gr01.boxesWizard.controller.game.WizardController;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.game.arena.Arena;
import org.l13gr01.boxesWizard.model.game.arena.ConstructorArenaBuilder;
import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;

import java.util.List;

public class ArenaTest {
    @Property
    void allArenasAreClosed(@ForAll @IntRange(min = 3, max = 50) int width, @ForAll @IntRange(min = 3, max = 50) int height, @ForAll List<GUI.@From("moveActions") ACTION> actions) {
        ConstructorArenaBuilder rab = new ConstructorArenaBuilder(width, height);
        Arena arena = rab.createArena();
        WizardController controller = new WizardController(arena);

        for (GUI.ACTION action : actions) {
            controller.step(null, action, 100);
            assert (controller.getModel().getWizard().getPosition().getX() > 0);
            assert (controller.getModel().getWizard().getPosition().getY() > 0);
            assert (controller.getModel().getWizard().getPosition().getX() < width - 1);
            assert (controller.getModel().getWizard().getPosition().getY() < height - 1);
        }
    }

    @Provide
    Arbitrary<GUI.ACTION> moveActions() {
        return Arbitraries.of(GUI.ACTION.UP, GUI.ACTION.RIGHT, GUI.ACTION.DOWN, GUI.ACTION.LEFT);
    }
}*/