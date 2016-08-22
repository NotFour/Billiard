package ButtonListeners;

import Exercises.InCentreEight;
import ForFiles.FileForStatistic;
import Graphics.MyPanel;
import PackageDate.GetFileName;
import PackageDate.GetTimeStartOrEnd;
import PlaceForMassive.MassivNePopal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class ButtonListenerPopal implements ActionListener {
    MyPanel mp;
    public ButtonListenerPopal(MyPanel mp){
        this.mp=mp;
    }
    public void actionPerformed(ActionEvent e) {
        if(mp.label.getText().startsWith("Забить в центр ")){
            if (InCentreEight.getPopal()+1>=InCentreEight.getKolvo()){
                mp.statistic.setText("Вы закончили упражнение");
                try {
                    FileForStatistic.update(GetFileName.getFileName(),"\n"+"Закончил упражнение(ы центр 8) в "+ GetTimeStartOrEnd.getTime()+"."+"\n"+"Промахов "+InCentreEight.getNePopal()+"(");
                    for(int i=0;i<MassivNePopal.getMassive().length;i++){
                        FileForStatistic.update(GetFileName.getFileName(),String.valueOf(MassivNePopal.getMassive()[i])+",");
                    }

                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            } else{
                InCentreEight.setPlusOnePopal();
                mp.statistic.setText("Попал "+String.valueOf(InCentreEight.getPopal())+" из "+String.valueOf(InCentreEight.getKolvo()));
            }

        }
    }
}
