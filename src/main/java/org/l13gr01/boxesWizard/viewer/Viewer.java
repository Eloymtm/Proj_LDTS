package org.l13gr01.boxesWizard.viewer;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.Position;

import java.io.IOException;

public abstract class Viewer<T> {
    private final T model;

    public static int menulevel = 0;
    public Viewer(T model) {
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public void draw(GUI gui) throws IOException {
        gui.clear();
        drawElements(gui);
        gui.refresh();
    }

    protected abstract void drawElements(GUI gui);

    protected void drawFrame(GUI gui){
        for (int x = 0; x < 58; x++) {
            gui.drawF(new Position(x,-1));
            gui.drawF(new Position(x,27));
        }

        for (int y = 0; y < 28; y++) {
            gui.drawF(new Position(0,y));
            gui.drawF(new Position(56,y));
        }
    }
}
