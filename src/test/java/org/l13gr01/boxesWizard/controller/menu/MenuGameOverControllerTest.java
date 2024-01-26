package org.l13gr01.boxesWizard.controller.menu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.states.MenuState;
import org.mockito.ArgumentCaptor;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MenuGameOverControllerTest{
    private Menu menu;
    private MenuGameOverController controller;
    private Game game;

    @BeforeEach
    void setUp(){
        menu = mock(Menu.class);
        controller = new MenuGameOverController(menu);
        game = mock(Game.class);
    }

    @Test
    void selectAction() throws IOException{
        GUI.ACTION action = GUI.ACTION.SELECT;
        MenuState mockedMenuState = mock(MenuState.class);
        when(mockedMenuState.getModel()).thenReturn(menu);
        ArgumentCaptor<MenuState> menuStateCaptor = ArgumentCaptor.forClass(MenuState.class);
        doNothing().when(game).setState(menuStateCaptor.capture());
        controller.step(game,action,100L);
        assertEquals(menu,mockedMenuState.getModel());
    }

    @Test
    void noAction() throws IOException{
        GUI.ACTION action = GUI.ACTION.UP;
        controller.step(game,action,100L);
        verify(game, never()).setState(any(MenuState.class));
    }
}