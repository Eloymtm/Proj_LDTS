package org.l13gr01.boxesWizard.viewer;

import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.Position;
import org.l13gr01.boxesWizard.model.game.arena.Arena;
import org.l13gr01.boxesWizard.model.game.elements.*;
import org.l13gr01.boxesWizard.viewer.Viewer;
import org.l13gr01.boxesWizard.viewer.game.GameViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
public class ArenaViewerTesting {
    private GUI gui;
    private GameViewer viewer;
    private Arena arena;

    @BeforeEach
    void setUp(){
        arena = new Arena(15,15);
        gui = Mockito.mock(GUI.class);
        viewer = new GameViewer(arena);

        arena.setWalls(Arrays.asList(new Wall(1,2), new Wall(2,3), new Wall(3,4)));
        arena.setDiamonds(Arrays.asList(new Diamonds(4,5), new Diamonds(5,6), new Diamonds(6,7)));
        arena.setWizard(new Wizard(5,8));
        arena.setSpikes(Arrays.asList(new Spikes(8,9),new Spikes(9,10)));
        arena.setBoxes(Arrays.asList(new Boxes(10,11), new Boxes(12,13)));
        arena.setTrophy(new Trophy(13,15));
    }

    @Test
    void drawWalls() throws IOException{
        viewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(1,2));
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(2,3));
        Mockito.verify(gui, Mockito.times(1)).drawWall(new Position(3,4));
        Mockito.verify(gui, Mockito.times(3)).drawWall(Mockito.any(Position.class));
    }

    @Test
    void drawDiamonds() throws IOException{
        viewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).drawDiamond(new Position(4,5));
        Mockito.verify(gui, Mockito.times(1)).drawDiamond(new Position(5,6));
        Mockito.verify(gui, Mockito.times(1)).drawDiamond(new Position(6,7));
        Mockito.verify(gui, Mockito.times(3)).drawDiamond(Mockito.any(Position.class));
    }

    @Test
    void drawWizard() throws IOException{
        viewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).drawWizard(new Position(5,8));
        Mockito.verify(gui, Mockito.times(1)).drawWizard(Mockito.any(Position.class));
    }

    @Test
    void drawSpikes() throws IOException{
        viewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).drawSpikes(new Position(8,9));
        Mockito.verify(gui, Mockito.times(1)).drawSpikes(new Position(9,10));
        Mockito.verify(gui, Mockito.times(2)).drawSpikes(Mockito.any(Position.class));
    }

    @Test
    void drawBoxes() throws IOException{
        viewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).drawBoxes(new Position(10,11));
        Mockito.verify(gui, Mockito.times(1)).drawBoxes(new Position(12,13));
        Mockito.verify(gui, Mockito.times(2)).drawBoxes(Mockito.any(Position.class));
    }

    @Test
    void drawTrophy() throws IOException{
        viewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).drawTrophy(new Position(13,15));
        Mockito.verify(gui, Mockito.times(1)).drawTrophy(Mockito.any(Position.class));
    }

    @Test
    void refreshAndClear() throws IOException{
        viewer.draw(gui);
        Mockito.verify(gui, Mockito.times(1)).clear();
        Mockito.verify(gui, Mockito.times(1)).refresh();
    }
}
