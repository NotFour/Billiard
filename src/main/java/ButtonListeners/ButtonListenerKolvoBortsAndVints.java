package ButtonListeners;

import Exercises.InCentreScrew;
import Exercises.KickStrange;
import Graphics.MyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerKolvoBortsAndVints implements ActionListener {
    MyPanel mp;
    public ButtonListenerKolvoBortsAndVints(MyPanel mp){
        this.mp=mp;
    }
    public void actionPerformed(ActionEvent e) {
        mp.oneBort.setVisible(false);
        mp.oneWithHalfBort.setVisible(false);
        mp.twoBort.setVisible(false);
        mp.twoWithHalfBort.setVisible(false);
        mp.threeBort.setVisible(false);
        mp.threeWithHalfBort.setVisible(false);
        mp.fourBort.setVisible(false);
        mp.fourWithHalfBort.setVisible(false);
        mp.prokat.setVisible(false);
        mp.nakat.setVisible(false);
        mp.clapshtos.setVisible(false);
        mp.ottajka.setVisible(false);
        if(e.getSource().equals(mp.oneBort)){
            new KickStrange(mp,1.0);
        }
        if(e.getSource().equals(mp.oneWithHalfBort)){
            new KickStrange(mp,1.5);
        }
        if(e.getSource().equals(mp.twoBort)){
            new KickStrange(mp,2.0);
        }
        if(e.getSource().equals(mp.twoWithHalfBort)){
            new KickStrange(mp,2.5);
        }
        if(e.getSource().equals(mp.threeBort)){
            new KickStrange(mp,3);
        }
        if(e.getSource().equals(mp.threeWithHalfBort)){
            new KickStrange(mp,3.5);
        }
        if(e.getSource().equals(mp.fourBort)){
            new KickStrange(mp,4);
        }
        if(e.getSource().equals(mp.fourWithHalfBort)){
            new KickStrange(mp,4.5);
        }
        if(e.getSource().equals(mp.prokat)){
            new InCentreScrew(mp,"Прокат");
        }
        if(e.getSource().equals(mp.nakat)){
            new InCentreScrew(mp,"Накат");
        }
        if(e.getSource().equals(mp.clapshtos)){
            new InCentreScrew(mp,"Клапштос");
        }
        if(e.getSource().equals(mp.ottajka)){
            new InCentreScrew(mp,"Оттяжка");
        }
    }
}
