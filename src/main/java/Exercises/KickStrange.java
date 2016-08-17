package Exercises;

import Graphics.MyPanel;

public class KickStrange extends Exercise {
    /**
     * Сила удара
     */
    private int ideal = 0;
    private int kolvo = 0;
    private double boards;
    private int needpopal = 0;

    public KickStrange(MyPanel mp) {
        this.mp = mp;
        mp.label.setText("Сколько бортов?");
        mp.textField.setVisible(true);
        mp.buttonNext.setVisible(true);
    }

    public KickStrange(MyPanel mp, double boards) {
        this.boards = boards;
        this.mp = mp;
        if (this.boards == 1.0) {
            mp.label.setText("Сила удара (" + (int) this.boards + " борт)");
        } else {
            mp.label.setText("Сила удара (" + boards + " борта)");
        }
        mp.textField.setVisible(false);
        mp.buttonNext.setVisible(false);

        mp.buttonPopal.setBounds(0,200,640,605);
        mp.buttonPopal.setVisible(true);
        mp.buttonIdeal.setBounds(640,200,640,605);
        mp.buttonIdeal.setVisible(true);
        mp.buttonNePopal.setBounds(1280,200,640,605);
        mp.buttonNePopal.setVisible(true);
    }

    public int getNeedpopal() {
        return needpopal;
    }

    public void setNeedpopal(int needpopal) {
        this.needpopal = needpopal;
    }

    public void setPlusOneIdeal() {
        this.ideal++;
    }

    public int getIdeal() {
        return ideal;
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setPlusOneKolvo() {
        this.kolvo++;
    }

    public void setKolvo(int kolvo) {
        this.kolvo = kolvo;
    }

    public double getBoards() {
        return boards;
    }

    public void setBoards(double boards) {
        this.boards = boards;
    }

}