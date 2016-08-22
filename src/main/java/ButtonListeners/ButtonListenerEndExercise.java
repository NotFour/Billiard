package ButtonListeners;

import Graphics.MyPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerEndExercise implements ActionListener {
    MyPanel mp;
    public ButtonListenerEndExercise(MyPanel mp){
        this.mp=mp;
    }
    public void actionPerformed(ActionEvent e) {
        mp.setVisible();
    }
}
