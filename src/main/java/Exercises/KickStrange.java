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
    private boolean norK=true;

    public KickStrange(MyPanel mp) {
        this.mp = mp;
        mp.label.setText("Выберите как считать");
        mp.nFromK.setVisible(true);
        mp.kFromN.setVisible(true);
    }
    public KickStrange(MyPanel mp, boolean norK){
        this.mp=mp;
        this.norK=norK;
        mp.label.setText("Сколько шаров");
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
    public KickStrange(MyPanel mp, int kolvoOrNeedpopal){
        this.mp=mp;
        if(norK){
            this.needpopal=kolvoOrNeedpopal;
        }else{
            this.kolvo=kolvoOrNeedpopal;
        }
        mp.label.setText("Выберите кол-во бортов");
        mp.oneBort.setVisible(true);
        mp.oneWithHalfBort.setVisible(true);
        mp.twoBort.setVisible(true);
        mp.twoWithHalfBort.setVisible(true);
        mp.threeBort.setVisible(true);
        mp.threeWithHalfBort.setVisible(true);
        mp.fourBort.setVisible(true);
        mp.fourWithHalfBort.setVisible(true);
    }


    public KickStrange(MyPanel mp, double boards) {
        this.boards = boards;
        this.mp = mp;
        if (this.boards == 1.0) {
            mp.label.setText("Сила удара (" + (int) this.boards + " борт)");
        } else {
            mp.label.setText("Сила удара (" + boards + " борта)");
        }
        mp.buttonPopal.setBounds(0, 200, 640, 605);
        mp.buttonPopal.setVisible(true);
        mp.buttonIdeal.setBounds(640, 200, 640, 605);
        mp.buttonIdeal.setVisible(true);
        mp.buttonNePopal.setBounds(1280, 200, 640, 605);
        mp.buttonNePopal.setVisible(true);
    }

    public int getNeedpopal() {
        return needpopal;
    }
    public boolean getnorK(){
        return norK;
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