package Exercises;

import Graphics.MyPanel;

public class InNearCorner extends Exercise{
    /**
     * Слева направо 8 шаров в ближний угол.
     */
    private final int kolvo = 8;

    public int getKolvo() {
        return kolvo;
    }
    public InNearCorner(MyPanel mp){
        this.mp=mp;

        mp.label.setText("Забить в ближний угол 8");
        mp.buttonPopal.setVisible(true);
        mp.buttonNePopal.setVisible(true);
    }
}
