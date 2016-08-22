package Exercises;

import Graphics.MyPanel;

public class InFarCorner extends Exercise {
    /**
     * С середины влево 8(в правый дальний угол),
     * С середины вправо 8(в левый дальний угол).
     */
    private final int kolvo = 16;

    public int getKolvo() {
        return kolvo;
    }

    public InFarCorner(MyPanel mp) {
        this.mp = mp;

        mp.label.setText("Забить в дальний угол " + kolvo);
        mp.buttonPopal.setVisible(true);
        mp.buttonNePopal.setVisible(true);
    }
}
