package org.l13gr01.boxesWizard.states;

import org.l13gr01.boxesWizard.controller.Controller;
import org.l13gr01.boxesWizard.controller.menu.MenuGameOverController;
import org.l13gr01.boxesWizard.model.menu.Menu;
import org.l13gr01.boxesWizard.viewer.Viewer;
import org.l13gr01.boxesWizard.viewer.menu.MenuGameOverViewer;

public class MenuGameOverState extends State<Menu>{

    public MenuGameOverState(Menu model) {
        super(model);
    }
    @Override
    protected Viewer<Menu> getViewer() {
        return new MenuGameOverViewer(getModel());
    }
    @Override
    protected Controller<Menu> getController() {
        return new MenuGameOverController(getModel());
    }
}
