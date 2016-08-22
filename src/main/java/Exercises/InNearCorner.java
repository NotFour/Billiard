package Exercises;

import Graphics.MyPanel;
import PlaceForMassive.MassivNePopal;

public class InNearCorner extends Exercise {
    /**
     * Слева направо 8 шаров в ближний угол.
     */
    private final int kolvo = 8;

    public int getKolvo() {
        return kolvo;
    }

    public InNearCorner(MyPanel mp) {
        this.mp = mp;
        MassivNePopal.setLengthMassive(getKolvo());
        mp.label.setText("Забить в ближний угол " + kolvo);
        mp.buttonPopal.setVisible(true);
        mp.buttonNePopal.setVisible(true);
    }
}
