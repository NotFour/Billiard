package ButtonListeners;

import ForFiles.FileForStatistic;
import Graphics.MyPanel;
import PackageDate.GetFileName;
import PackageDate.GetTimeStartOrEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerStartTraining implements ActionListener {
    MyPanel mp;


    public ButtonListenerStartTraining(MyPanel mp) {
        this.mp = mp;
    }

    public void actionPerformed(ActionEvent e) {
        FileForStatistic.write(GetFileName.getFileName(), "Тренировка начата в " + GetTimeStartOrEnd.getTime());

        mp.label.setVisible(true);
        mp.buttonStartTraining.setVisible(false);
        mp.buttonInCentreEight.setVisible(true);
        mp.buttonInNearCorner.setVisible(true);
        mp.buttonInFarCorner.setVisible(true);
        mp.buttonKickStrange.setVisible(true);
        mp.buttonInCentreScrew.setVisible(true);
    }

}
