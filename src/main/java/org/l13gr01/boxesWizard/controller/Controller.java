package org.l13gr01.boxesWizard.controller;

import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.gui.GUI;

import java.io.IOException;

public abstract class Controller<T> {
    private final T model;
    public static int level = 1;

    public Controller(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public abstract void step(Game game, GUI.ACTION action, long time) throws IOException;
}

