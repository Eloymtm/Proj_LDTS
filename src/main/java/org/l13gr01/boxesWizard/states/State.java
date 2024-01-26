package org.l13gr01.boxesWizard.states;

import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.controller.Controller;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.viewer.Viewer;

import java.io.IOException;

public abstract class State<T> {
    private final T model;
    private  Controller<T> controller;
    private  Viewer<T> viewer;

    public State(T model) {
        this.model = model;
        this.viewer = getViewer();
        this.controller = getController();
    }

    protected abstract Viewer<T> getViewer();

    protected abstract Controller<T> getController();

    public void setViewer(Viewer<T> viewer) {this.viewer = viewer;}

    public void setController(Controller<T> controller) { this.controller = controller;}

    public T getModel() {
        return model;
    }

    public void step(Game game, GUI gui, long time) throws IOException {
        GUI.ACTION action = gui.getNextAction();
        controller.step(game, action, time);
        viewer.draw(gui);
    }
}
