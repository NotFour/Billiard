package ButtonListeners;

import Exercises.*;
import Graphics.MyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerExercises implements ActionListener {
    MyPanel mp;

    public ButtonListenerExercises(MyPanel mp) {
        this.mp = mp;
    }

    public void actionPerformed(ActionEvent e) {

        mp.buttonEndProgram.setVisible(false);
        mp.buttonInCentreEight.setVisible(false);
        mp.buttonInNearCorner.setVisible(false);
        mp.buttonInFarCorner.setVisible(false);
        mp.buttonKickStrange.setVisible(false);
        mp.buttonInCentreScrew.setVisible(false);

        if (e.getSource().equals(mp.buttonInCentreEight)) {
            new InCentreEight(this.mp);
        }
        if (e.getSource().equals(mp.buttonInNearCorner)) {
            new InNearCorner(this.mp);
        }
        if (e.getSource().equals(mp.buttonInFarCorner)) {
            new InFarCorner(this.mp);
        }
        if (e.getSource().equals(mp.buttonKickStrange)) {
            new KickStrange(this.mp);
        }
        if (e.getSource().equals(mp.buttonInCentreScrew)) {
            new InCentreScrew(this.mp);
        }

    }
}
