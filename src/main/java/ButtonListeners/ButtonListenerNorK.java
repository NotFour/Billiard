package ButtonListeners;

import Exercises.InCentreScrew;
import Exercises.KickStrange;
import Graphics.MyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerNorK implements ActionListener {
    MyPanel mp;

    public ButtonListenerNorK(MyPanel mp) {
        this.mp = mp;
    }

    public void actionPerformed(ActionEvent e) {
        mp.nFromK.setVisible(false);
        mp.kFromN.setVisible(false);
        if ("Выберите как считать".equals(mp.label.getText())) {
            if (e.getSource().equals(mp.nFromK)) {
                new KickStrange(mp,true);
            }
            if (e.getSource().equals(mp.kFromN)) {
                new KickStrange(mp,false);
            }
        }else{
            if (e.getSource().equals(mp.nFromK)) {
                new InCentreScrew(mp,true);
            }
            if (e.getSource().equals(mp.kFromN)) {
                new InCentreScrew(mp,false);
            }
        }
    }
}
