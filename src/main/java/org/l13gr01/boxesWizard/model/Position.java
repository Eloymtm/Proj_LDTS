package org.l13gr01.boxesWizard.model;

import java.util.Objects;

public class Position {
    public static final float GRAVITY = 1;
    protected float verticalVelocity = 0;
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position getLeft() {
        return new Position(x - 1, y);
    }

    public Position getRight() {
        return new Position(x + 1, y);
    }

    public Position getUp() {
        return new Position(x, y - 2);
    }

    public Position getDown() {
        return new Position(x, y + 1);
    }
    public Position applyGravity() {
        verticalVelocity = Position.GRAVITY;
        return new Position(x, y+(int)verticalVelocity);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}