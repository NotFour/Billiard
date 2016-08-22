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
    private boolean norK = true;

    public InCentreScrew(MyPanel mp) {
        this.mp = mp;
        mp.label.setText("Выберите как считать ");
        mp.nFromK.setVisible(true);
        mp.kFromN.setVisible(true);
    }

    public InCentreScrew(MyPanel mp, boolean norK) {
        this.mp = mp;
        this.norK = norK;
        mp.label.setText("Сколько шаров ");
        mp.oneTen.setVisible(true);
        mp.twoTen.setVisible(true);
        mp.threeTen.setVisible(true);
        mp.fourTen.setVisible(true);
        mp.fiveTen.setVisible(true);
        mp.sixTen.setVisible(true);
        mp.sevenTen.setVisible(true);
        mp.eightTen.setVisible(true);
        mp.nineTen.setVisible(true);
        mp.tenTen.setVisible(true);
    }

    public InCentreScrew(MyPanel mp, int kolvoOrNeedpopal) {
        this.mp = mp;
        if (norK) {
            this.needpopal = kolvoOrNeedpopal;
        } else {
            this.kolvo = kolvoOrNeedpopal;
        }
        mp.label.setText("Выберите винт");
        mp.prokat.setVisible(true);
        mp.nakat.setVisible(true);
        mp.clapshtos.setVisible(true);
        mp.ottajka.setVisible(true);
    }

    public InCentreScrew(MyPanel mp, String typeVint) {
        this.typeVint = typeVint;
        this.mp = mp;

        mp.label.setText("В середину " + typeVint);
        mp.buttonPopal.setBounds(0, 200, 960, 405);
        mp.buttonPopalNeTotVint.setBounds(960, 200, 960, 405);
        mp.buttonNePopalTotVint.setBounds(0, 605, 960, 405);
        mp.buttonNePopal.setBounds(960, 605, 960, 405);
        mp.buttonPopal.setVisible(true);
        mp.buttonPopalNeTotVint.setVisible(true);
        mp.buttonNePopalTotVint.setVisible(true);
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
