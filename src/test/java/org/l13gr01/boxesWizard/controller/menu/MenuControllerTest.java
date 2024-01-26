package org.l13gr01.boxesWizard.controller.menu;

import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.controller.menu.MenuController;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.states.GameState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class MenuControllerTest {
    private Menu menu;
    private Game game;
    private MenuController menuController;

    @BeforeEach
    void setUp(){
        menu = mock(Menu.class);
        game = mock(Game.class);
        menuController = new MenuController(menu);
    }

    @Test
    void selectExit() throws IOException{
        when(menu.isSelectedExit()).thenReturn(true);
        menuController.step(game, GUI.ACTION.SELECT,0);
        verify(game).setState(null);
    }

    @Test
    void selectStart() throws IOException{
        when(menu.isSelectedStart()).thenReturn(true);
        menuController.step(game,GUI.ACTION.SELECT,0);
        verify(game).setState(any(GameState.class));
    }

    @Test
    void up() throws IOException{
        menuController.step(game,GUI.ACTION.UP,0);
        verify(menu).previousEntry();
    }

    @Test
    void down() throws IOException{
        menuController.step(game,GUI.ACTION.DOWN,0);
        verify(menu).nextEntry();
    }
}