package Exercises;

import Graphics.MyPanel;

public class Exercise {
    /**
     * Родительский класс для всех упражнений.
     */
    public MyPanel mp;
    private int popal = 0;
    private int nepopal = 0;

    public int getPopal() {
        return popal;
    }

    public int getNePopal() {
        return nepopal;
    }

    public void setPlusOnePopal() {
        this.popal++;
    }

    public void setPlusOneNePopal() {
        this.nepopal++;
    }
}
