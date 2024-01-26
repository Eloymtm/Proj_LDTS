package org.l13gr01.boxesWizard.model.menu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MenuTest {

    @Test
    public void testNextEntry() {
        Menu menu = new Menu();

        assertEquals(0, menu.currentEntry); //'current entry' is initially 0

        menu.nextEntry();
        assertEquals(1, menu.currentEntry); //Increment ->1


        menu.nextEntry();
        assertEquals(0, menu.currentEntry);//Increment ->0
    }

    @Test
    public void testPreviousEntry() {
        Menu menu = new Menu();

        assertEquals(0, menu.currentEntry);//'current entry' is initially 0

        menu.previousEntry();
        assertEquals(1, menu.currentEntry);//decrement ->1

        menu.previousEntry();
        assertEquals(0, menu.currentEntry);//decrement->0
    }

    @Test
    public void testGetEntry() {
        Menu menu = new Menu();

        assertEquals("Start", menu.getEntry(0));
        assertEquals("Exit", menu.getEntry(1));
    }

    @Test
    public void testIsSelected() {
        Menu menu = new Menu();

        assertTrue(menu.isSelected(0));
        assertFalse(menu.isSelected(1));

        menu.nextEntry();
        assertFalse(menu.isSelected(0));
        assertTrue(menu.isSelected(1));
    }

    @Test
    public void testIsSelectedExit() {
        Menu menu = new Menu();

        assertFalse(menu.isSelectedExit());

        menu.nextEntry();
        assertTrue(menu.isSelectedExit());
    }

    @Test
    public void testIsSelectedStart() {
        Menu menu = new Menu();

        assertTrue(menu.isSelectedStart());

        menu.nextEntry();
        assertFalse(menu.isSelectedStart());
    }

    @Test
    public void testGetNumberEntries() {
        Menu menu = new Menu();

        assertEquals(2, menu.getNumberEntries());
    }
}
