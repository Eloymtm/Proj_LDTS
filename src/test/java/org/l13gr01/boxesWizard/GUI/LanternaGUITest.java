package org.l13gr01.boxesWizard.GUI;

import org.l13gr01.boxesWizard.gui.LanternaGUI;
import org.l13gr01. boxesWizard.model.Position;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
public class LanternaGUITest {
    private Screen screen;
    private LanternaGUI gui;
    private TextGraphics tg;

    @BeforeEach
    void setUp(){
        screen = Mockito.mock(Screen.class);
        tg = Mockito.mock(TextGraphics.class);
        Mockito.when(screen.newTextGraphics()).thenReturn(tg);
        gui = new LanternaGUI(screen);
    }

    @Test
    void drawWizard(){
        gui.drawWizard(new Position(1,1));
        Mockito.verify(tg, Mockito.times(1)).setForegroundColor((new TextColor.RGB(153,102,204)));
        Mockito.verify(tg, Mockito.times(1)).putString(1,2,"W");
    }

    @Test
    void drawWall(){
        gui.drawWall(new Position(1,1));
        Mockito.verify(tg, Mockito.times(1)).setForegroundColor((new TextColor.RGB(255,255,255)));
        Mockito.verify(tg, Mockito.times(1)).putString(1,2,"█");
    }

    @Test
    void drawDiamond(){
        gui.drawDiamond(new Position(1,1));
        Mockito.verify(tg, Mockito.times(1)).setForegroundColor((new TextColor.RGB(173,216,230)));
        Mockito.verify(tg, Mockito.times(1)).putString(1,2,"D");
    }
    @Test
    void drawText(){
        gui.drawText(new Position(1,1), "Hello World!","#9966CC");
        Mockito.verify(tg, Mockito.times(1)).setForegroundColor((new TextColor.RGB(153,102,204)));
        Mockito.verify(tg, Mockito.times(1)).putString(1,1,"Hello World!");
    }
}
