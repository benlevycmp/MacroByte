package com.macrobyte.macrobyte.actions;

public record MoveCursor(Integer x, Integer y) implements Action {
    @Override
    public java.lang.String getName() {
        return getClass().getSimpleName();
    }
}
