package Exercises;

import Graphics.MyPanel;

public class InCentreEight extends Exercise {
    /**
     * слево направо 4, потом справо налево 4 в центральную лузу.
     */
    private final int kolvo = 8;

    public int getKolvo() {
        return kolvo;
    }

    public InCentreEight(MyPanel mp) {
        this.mp = mp;

        mp.label.setText("Забить в центр " + kolvo + " шаров");
        mp.buttonPopal.setVisible(true);
        mp.buttonNePopal.setVisible(true);
    }


}
