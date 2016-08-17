package ButtonListeners;

import Exercises.InCentreScrew;
import Exercises.KickStrange;
import Graphics.MyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerNext implements ActionListener {
    MyPanel mp;

    public ButtonListenerNext(MyPanel mp) {
        this.mp = mp;
    }

    public void actionPerformed(ActionEvent e) {
        if ("Сколько бортов?".equals(mp.label.getText())) {
            new KickStrange(mp, Double.parseDouble(mp.textField.getText()));
        } else {
            new InCentreScrew(mp, mp.textField.getText());
        }
    }
}
