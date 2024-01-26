package org.l13gr01.boxesWizard.model.game.elements;

public class Wizard extends Element {
    private int life;

    public Wizard(int x, int y) {
        super(x, y);
        this.life = 1;
    }

    public void decreaseLife() {
        this.life--;
    }

    public int getLife() {
        return life;
    }

}
