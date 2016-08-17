package Exercises;

import Graphics.MyPanel;

public class InCentreScrew extends Exercise {
    /**
     * В середину винты
     */
    private int popalnetotvint = 0;
    private int nepopaltotvint = 0;
    private int nepopalnetotvint = 0;
    private int kolvo = 0;
    private int needpopal = 0;
    private String typeVint;

    public InCentreScrew(MyPanel mp) {
        this.mp = mp;
        mp.label.setText("Какой винт?");
        mp.textField.setVisible(true);
        mp.buttonNext.setVisible(true);
    }

    public InCentreScrew(MyPanel mp, String typeVint) {
        this.typeVint = typeVint;
        this.mp = mp;

        mp.label.setText("В середину " + typeVint);
        mp.textField.setVisible(false);
        mp.buttonNext.setVisible(false);

        mp.buttonPopal.setBounds(0, 200, 480, 605);
        mp.buttonPopal.setVisible(true);
        mp.buttonPopalNeTotVint.setBounds(480,200,480,605);
        mp.buttonPopalNeTotVint.setVisible(true);
        mp.buttonNePopalTotVint.setBounds(960,200,480,605);
        mp.buttonNePopalTotVint.setVisible(true);
        mp.buttonNePopal.setBounds(1440, 200, 480, 605);
        mp.buttonNePopal.setVisible(true);
    }


    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public void setPlusOneKolvo() {
        this.kolvo++;
    }

    public int getNeedpopal() {
        return needpopal;
    }

    public void setNeedpopal(int needpopal) {
        this.needpopal = needpopal;
    }

    public int getPopalnetotvint() {
        return popalnetotvint;
    }

    public void setPlusOnePopalnetotvint() {
        this.popalnetotvint++;
    }

    public int getNepopaltotvint() {
        return nepopaltotvint;
    }

    public void setPlusOneNepopaltotvint() {
        this.nepopaltotvint++;
    }

    public int getNepopalnetotvint() {
        return nepopalnetotvint;
    }

    public void setPlusOneNepopalnetotvint() {
        this.nepopalnetotvint++;
    }

    public String getTypeVint() {
        return typeVint;
    }

    public void setTypeVint(String typeVint) {
        this.typeVint = typeVint;
    }
}
