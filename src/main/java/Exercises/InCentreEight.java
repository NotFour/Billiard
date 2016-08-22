package Exercises;

import Graphics.MyPanel;
import PlaceForMassive.MassivNePopal;

public class InCentreEight extends Exercise {
    /**
     * слево направо 4, потом справо налево 4 в центральную лузу.
     */
    private static final int kolvo = 8;

    public static int getKolvo() {
        return kolvo;
    }

    public InCentreEight(MyPanel mp) {
        MassivNePopal.setLengthMassive(getKolvo());
        this.mp = mp;
        this.setPopal(0);
        this.setNepopal(0);
        mp.statistic.setText("Попал "+String.valueOf(getPopal())+" из "+String.valueOf(getKolvo()));
        mp.label.setText("Забить в центр " + kolvo + " шаров");
        mp.statistic.setVisible(true);
        mp.buttonPopal.setVisible(true);
        mp.buttonNePopal.setVisible(true);
    }


}
