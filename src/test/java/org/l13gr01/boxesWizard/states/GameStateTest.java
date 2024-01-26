package org.l13gr01.boxesWizard.states;

import org.l13gr01.boxesWizard.controller.Controller;
import org.l13gr01.boxesWizard.controller.game.ArenaController;
import org.l13gr01.boxesWizard.model.game.arena.Arena;
import org.l13gr01.boxesWizard.viewer.Viewer;
import org.l13gr01.boxesWizard.viewer.game.GameViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

    public class GameStateTest {
        private Arena arena;
        private GameState gameState;

        @BeforeEach
        public void setUp(){
            arena = Mockito.mock(Arena.class);
            gameState = Mockito.mock(GameState.class);
            when(gameState.getModel()).thenReturn(arena);
        }

        @Test
        public void getViewer(){
            Viewer<Arena> viewer = Mockito.mock(GameViewer.class);
            when(gameState.getViewer()).thenReturn(viewer);
            Viewer<Arena> resViewer = gameState.getViewer();
            verify(gameState).getViewer();
            assertEquals(viewer, resViewer);
        }

        @Test
        public void getController(){
            Controller<Arena> controller = Mockito.mock(ArenaController.class);
            when(gameState.getController()).thenReturn(controller);
            Controller<Arena> resController = gameState.getController();
            verify(gameState).getController();
            assertEquals(controller, resController);
        }
    }
