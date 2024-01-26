package org.l13gr01.boxesWizard.gui;

import org.l13gr01.boxesWizard.model.Position;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawWizard(Position position);

    void drawWall(Position position);

    void drawDiamond(Position position);
    void drawSpikes(Position position);

    void drawBoxes(Position position);
    void drawTrophy(Position position);
    void drawF(Position position);

    void drawText(Position position, String text, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;


    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT, CHARACTER1, CHARACTER2, CHARACTER}

}

