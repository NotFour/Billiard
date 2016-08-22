package ButtonListeners;

import Exercises.InCentreEight;
import Graphics.MyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerPopal implements ActionListener {
    MyPanel mp;
    public ButtonListenerPopal(MyPanel mp){
        this.mp=mp;
    }
    public void actionPerformed(ActionEvent e) {
        if(mp.label.getText().startsWith("Забить в центр ")){
            InCentreEight.setPlusOnePopal();
            mp.statistic.setText("Попал "+String.valueOf(InCentreEight.getPopal())+" из "+String.valueOf(InCentreEight.getKolvo()));


        }
    }
}
