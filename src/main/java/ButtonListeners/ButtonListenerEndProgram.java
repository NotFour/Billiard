package ButtonListeners;

import ForFiles.FileForStatistic;
import PackageDate.GetFileName;
import PackageDate.GetTimeStartOrEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class ButtonListenerEndProgram implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        try {
            FileForStatistic.update(GetFileName.getFileName(),"Тренировка закончена в "+ GetTimeStartOrEnd.getTime());
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        System.exit(0);
    }
}
