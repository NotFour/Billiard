package Exercises;

import Graphics.MyPanel;

public class Exercise {
    /**
     * Родительский класс для всех упражнений.
     */
    public MyPanel mp;

    public static void setPopal(int popal) {
        Exercise.popal = popal;
    }

    public static void setNepopal(int nepopal) {
        Exercise.nepopal = nepopal;
    }

    private static int popal = 0;
    private static int nepopal = 0;

    public static int getPopal() {
        return popal;
    }

    public static int getNePopal() {
        return nepopal;
    }

    public static void setPlusOnePopal() {
        popal++;
    }

    public static void setPlusOneNePopal() {
        nepopal++;
    }
}
