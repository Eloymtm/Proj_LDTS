package org.l13gr01.boxesWizard.states;

import org.l13gr01.boxesWizard.controller.menu.MenuController;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.states.MenuState;
import org.l13gr01.boxesWizard.viewer.menu.MenuViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuStateTest {
    private MenuState menuState;
    private MenuViewer menuViewer;
    private MenuController menuController;
    private Menu menu;

    @BeforeEach
    void setUp(){
        menu = new Menu();
        menuState = new MenuState(menu);
        menuViewer = mock(MenuViewer.class);
        menuController = mock(MenuController.class);
        menuState = mock(MenuState.class);

        when(menuState.getViewer()).thenReturn(menuViewer);
        when(menuState.getController()).thenReturn(menuController);
        when(menuState.getModel()).thenReturn(menu);
    }

    @Test
    void getViewer(){
        assertEquals(menuViewer,menuState.getViewer());
    }

    @Test
    void getController(){
        assertEquals(menuController,menuState.getController());
    }
}