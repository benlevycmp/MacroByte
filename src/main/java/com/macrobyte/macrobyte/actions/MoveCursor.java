package com.macrobyte.macrobyte.actions;

public record MoveCursor(Integer x, Integer y) implements Action {
    @Override
    public java.lang.String getName() {
        return getClass().getSimpleName();
    }

    public MoveCursor(int[] coordinates){
        this(coordinates[0], coordinates[1]);
    }

    public String getPrintName(){
        return  "Move Cursor\n    [x:" + x + ", y:" + y + "]";
    }
}
