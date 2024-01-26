package org.l13gr01.boxesWizard.controller.game;

import org.l13gr01.boxesWizard.Game;
import org.l13gr01.boxesWizard.gui.GUI;
import org.l13gr01.boxesWizard.model.Position;
import org.l13gr01.boxesWizard.model.game.arena.Arena;
import org.l13gr01.boxesWizard.model.game.elements.Diamonds;

public class WizardController extends GameController {
    public WizardController(Arena arena) {
        super(arena);
    }

    public void moveWizardLeft() {
        moveWizard(getModel().getWizard().getPosition().getLeft());
    }

    public void moveWizardRight() {
        moveWizard(getModel().getWizard().getPosition().getRight());
    }

    public void moveWizardUp() {
        moveWizard(getModel().getWizard().getPosition().getUp());
    }

    public void moveWizardDown() {
        moveWizard(getModel().getWizard().getPosition().getDown());
    }

    private void moveWizard(Position position) {
        if (getModel().isEmpty(position)) {
            getModel().getWizard().setPosition(position);
            if (getModel().isDiamonds(position)) {
                for(Diamonds i : getModel().getDiamonds()) {

                    if(i.getPosition().getY() ==position.getY() && i.getPosition().getX() == position.getX()) {
                        getModel().getDiamonds().remove(i);
                        break;
                    }
                }
            }
            else if(getModel().getDiamonds().isEmpty()) {
                if(level == 1){
                getModel().getTrophy().setPosition(getModel().getTrophy().finalposition1);
                }
                else if(level == 2){
                    getModel().getTrophy().setPosition(getModel().getTrophy().finalposition2);
                }
                else if(level == 3){
                    getModel().getTrophy().setPosition(getModel().getTrophy().finalposition3);
                }
            }
        }
        if (getModel().isEmpty(position)) {
            getModel().getWizard().setPosition(position);
            if (getModel().isSpikes(position)) getModel().getWizard().decreaseLife();
        }
    }
    private void swapbox1(){
        Position positionaux = getModel().getBoxes().get(0).getPosition();
        getModel().getBoxes().get(0).setPosition(getModel().getWizard().getPosition());
        getModel().getWizard().setPosition(positionaux);
    }
    private void swapbox2(){
        Position positionaux = getModel().getBoxes().get(1).getPosition();
        getModel().getBoxes().get(1).setPosition(getModel().getWizard().getPosition());
        getModel().getWizard().setPosition(positionaux);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        moveWizard(getModel().getWizard().getPosition().applyGravity());
        if (action == GUI.ACTION.UP) moveWizardUp();
        if (action == GUI.ACTION.RIGHT) moveWizardRight();
        if (action == GUI.ACTION.DOWN) moveWizardDown();
        if (action == GUI.ACTION.LEFT) moveWizardLeft();
        if (action == GUI.ACTION.CHARACTER1) swapbox1();
        if (action == GUI.ACTION.CHARACTER2) swapbox2();
    }
}