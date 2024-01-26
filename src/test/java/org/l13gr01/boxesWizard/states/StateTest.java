package org.l13gr01.boxesWizard.states;

import org.junit.jupiter.api.BeforeEach;
import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.controller.menu.MenuController;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.viewer.menu.MenuViewer;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class StateTest {

    private MenuState MenuState;
    private MenuController MenuController;
    private MenuViewer MenuViewer;
    private GUI gui;
    @BeforeEach
    void setUp() throws IOException {
        MenuState = new MenuState(new Menu());
        MenuController = mock(MenuController.class);
        MenuViewer = mock(MenuViewer.class);
        gui = mock(GUI.class);
        MenuState.setController(MenuController);
        MenuState.setViewer(MenuViewer);
    }
    @Test
    void step() throws IOException {
        MenuState.step(null,gui,0);
        Mockito.verify(MenuViewer, Mockito.times(1)).draw(gui);
        Mockito.verify(MenuController, Mockito.times(1)).step(null,null,0);
    }
}
