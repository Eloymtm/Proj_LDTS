package org.l13gr01.boxesWizard.states;

import org.l13gr01.boxesWizard.controller.Controller;
import org.l13gr01.boxesWizard.controller.menu.MenuController;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.viewer.Viewer;
import org.l13gr01.boxesWizard.viewer.menu.MenuViewer;

public class MenuState extends State<Menu> {
    public MenuState(Menu model) {
        super(model);
    }

    @Override
    protected Viewer<Menu> getViewer() {
            return new MenuViewer(getModel());
    }
    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}
