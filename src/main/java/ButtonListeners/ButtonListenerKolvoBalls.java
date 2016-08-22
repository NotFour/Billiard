package ButtonListeners;

import Exercises.InCentreScrew;
import Exercises.KickStrange;
import Graphics.MyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerKolvoBalls implements ActionListener {
    MyPanel mp;

    public ButtonListenerKolvoBalls(MyPanel mp) {
        this.mp = mp;
    }

    public void actionPerformed(ActionEvent e) {
        mp.oneTen.setVisible(false);
        mp.twoTen.setVisible(false);
        mp.threeTen.setVisible(false);
        mp.fourTen.setVisible(false);
        mp.fiveTen.setVisible(false);
        mp.sixTen.setVisible(false);
        mp.sevenTen.setVisible(false);
        mp.eightTen.setVisible(false);
        mp.nineTen.setVisible(false);
        mp.tenTen.setVisible(false);
        if ("Сколько шаров".equals(mp.label.getText())) {
            if (e.getSource().equals(mp.oneTen)) {
                new KickStrange(mp, 10);
            }
            if (e.getSource().equals(mp.twoTen)) {
                new KickStrange(mp, 20);
            }
            if (e.getSource().equals(mp.threeTen)) {
                new KickStrange(mp, 30);
            }
            if (e.getSource().equals(mp.fourTen)) {
                new KickStrange(mp, 40);
            }
            if (e.getSource().equals(mp.fiveTen)) {
                new KickStrange(mp, 50);
            }
            if (e.getSource().equals(mp.sixTen)) {
                new KickStrange(mp, 60);
            }
            if (e.getSource().equals(mp.sevenTen)) {
                new KickStrange(mp, 70);
            }
            if (e.getSource().equals(mp.eightTen)) {
                new KickStrange(mp, 80);
            }
            if (e.getSource().equals(mp.nineTen)) {
                new KickStrange(mp, 90);
            }
            if (e.getSource().equals(mp.tenTen)) {
                new KickStrange(mp, 100);
            }
        } else {
            if (e.getSource().equals(mp.oneTen)) {
                new InCentreScrew(mp, 10);
            }
            if (e.getSource().equals(mp.twoTen)) {
                new InCentreScrew(mp, 20);
            }
            if (e.getSource().equals(mp.threeTen)) {
                new InCentreScrew(mp, 30);
            }
            if (e.getSource().equals(mp.fourTen)) {
                new InCentreScrew(mp, 40);
            }
            if (e.getSource().equals(mp.fiveTen)) {
                new InCentreScrew(mp, 50);
            }
            if (e.getSource().equals(mp.sixTen)) {
                new InCentreScrew(mp, 60);
            }
            if (e.getSource().equals(mp.sevenTen)) {
                new InCentreScrew(mp, 70);
            }
            if (e.getSource().equals(mp.eightTen)) {
                new InCentreScrew(mp, 80);
            }
            if (e.getSource().equals(mp.nineTen)) {
                new InCentreScrew(mp, 90);
            }
            if (e.getSource().equals(mp.tenTen)) {
                new InCentreScrew(mp, 100);
            }
        }
    }
}
