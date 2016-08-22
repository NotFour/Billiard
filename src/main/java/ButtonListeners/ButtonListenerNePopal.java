package ButtonListeners;

import Exercises.InCentreEight;
import Graphics.MyPanel;
import PlaceForMassive.MassivNePopal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerNePopal implements ActionListener {

    MyPanel mp;
    public ButtonListenerNePopal(MyPanel mp){
        this.mp=mp;
    }
    public void actionPerformed(ActionEvent e) {
        MassivNePopal.setNePopal(InCentreEight.getPopal());
        if(mp.label.getText().startsWith("Забить в центр ")){

            InCentreEight.setPlusOneNePopal();
        }
    }
}
