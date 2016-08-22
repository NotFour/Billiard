package Graphics;

import ButtonListeners.*;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    /*
      Класс панельки
     */
    /**
     * кнопки для старта, выхода, конца и выбора упражнения
     */
    public JButton buttonStartTraining;
    public JButton buttonInCentreEight;
    public JButton buttonInNearCorner;
    public JButton buttonInFarCorner;
    public JButton buttonKickStrange;
    public JButton buttonInCentreScrew;
    public JButton buttonEndExercise;
    public JButton buttonEndProgram;
    /**
     * кнопки для выбора попал или нет и кнопка далее
     */
    public JButton buttonPopal;
    public JButton buttonNePopal;
    public JButton buttonPopalNeTotVint;
    public JButton buttonNePopalTotVint;
    public JButton buttonIdeal;
    public JButton buttonNext;
    /**
     * выбор количества шаров
     */
    public JButton oneTen;
    public JButton twoTen;
    public JButton threeTen;
    public JButton fourTen;
    public JButton fiveTen;
    public JButton sixTen;
    public JButton sevenTen;
    public JButton eightTen;
    public JButton nineTen;
    public JButton tenTen;
    /**
     * выбор метода подсчета
     */
    public JButton nFromK;
    public JButton kFromN;
    /**
     * выбор бортов
     */
    public JButton oneBort;
    public JButton oneWithHalfBort;
    public JButton twoBort;
    public JButton twoWithHalfBort;
    public JButton threeBort;
    public JButton threeWithHalfBort;
    public JButton fourBort;
    public JButton fourWithHalfBort;
    /**
     * выбор винтов
     */
    public JButton prokat;
    public JButton nakat;
    public JButton ottajka;
    public JButton clapshtos;


    public JTextField textField;

    public JLabel label;
    public JLabel statistic;

    public Font font;

    public MyPanel() {
        /*Размер окна 1920 1110*/
        setLayout(null);
//40
        textField = new JTextField();
        label = new JLabel();
        statistic = new JLabel();
        font = new Font("Arial", Font.PLAIN, 70);
        nakat = new JButton("Накат");
        prokat = new JButton("Прокат");
        ottajka = new JButton("Оттяжка");
        clapshtos = new JButton("Клапштос");
        oneTen = new JButton("10");
        twoTen = new JButton("20");
        threeTen = new JButton("30");
        fourTen = new JButton("40");
        fiveTen = new JButton("50");
        sixTen = new JButton("60");
        sevenTen = new JButton("70");
        eightTen = new JButton("80");
        nineTen = new JButton("90");
        tenTen = new JButton("100");
        nFromK = new JButton("Сколько забить");
        kFromN = new JButton("Из скольки забить");
        oneBort = new JButton("1");
        oneWithHalfBort = new JButton("1.5");
        twoBort = new JButton("2");
        twoWithHalfBort = new JButton("2.5");
        threeBort = new JButton("3");
        threeWithHalfBort = new JButton("3.5");
        fourBort = new JButton("4");
        fourWithHalfBort = new JButton("4.5");
        buttonNext = new JButton("Далее");
        buttonStartTraining = new JButton("Начать тренировку!");
        buttonInCentreEight = new JButton("В центр 8");
        buttonInNearCorner = new JButton("В ближний угол");
        buttonInFarCorner = new JButton("В дальний угол");
        buttonKickStrange = new JButton("Сила удара");
        buttonInCentreScrew = new JButton("В центр винт");
        buttonEndExercise = new JButton("Закончить упражнение");
        buttonEndProgram = new JButton("Выход");
        buttonPopal = new JButton("Попал");
        buttonNePopal = new JButton("Не попал");
        buttonPopalNeTotVint = new JButton("Попал без винта");
        buttonNePopalTotVint = new JButton("Не попал с винтом");
        buttonIdeal = new JButton("Идеально");

//35
        oneTen.setFont(font);
        twoTen.setFont(font);
        threeTen.setFont(font);
        fourTen.setFont(font);
        fiveTen.setFont(font);
        sixTen.setFont(font);
        sevenTen.setFont(font);
        eightTen.setFont(font);
        nineTen.setFont(font);
        tenTen.setFont(font);
        nFromK.setFont(font);
        kFromN.setFont(font);
        oneBort.setFont(font);
        oneWithHalfBort.setFont(font);
        twoBort.setFont(font);
        twoWithHalfBort.setFont(font);
        threeBort.setFont(font);
        threeWithHalfBort.setFont(font);
        fourBort.setFont(font);
        fourWithHalfBort.setFont(font);
        buttonNext.setFont(font);
        buttonStartTraining.setFont(font);
        buttonEndProgram.setFont(font);
        label.setFont(font);
        statistic.setFont(font);
        buttonInCentreEight.setFont(font);
        buttonInNearCorner.setFont(font);
        buttonInFarCorner.setFont(font);
        buttonKickStrange.setFont(font);
        buttonInCentreScrew.setFont(font);
        buttonPopal.setFont(font);
        buttonNePopal.setFont(font);
        buttonPopalNeTotVint.setFont(font);
        buttonNePopalTotVint.setFont(font);
        buttonIdeal.setFont(font);
        nakat.setFont(font);
        prokat.setFont(font);
        ottajka.setFont(font);
        clapshtos.setFont(font);
        buttonEndExercise.setFont(font);


//35
        oneTen.setBounds(0, 200, 384, 405);
        twoTen.setBounds(384, 200, 384, 405);
        threeTen.setBounds(768, 200, 384, 405);
        fourTen.setBounds(1152, 200, 384, 405);
        fiveTen.setBounds(1536, 200, 384, 405);
        sixTen.setBounds(0, 605, 384, 405);
        sevenTen.setBounds(384, 605, 384, 405);
        eightTen.setBounds(768, 605, 384, 405);
        nineTen.setBounds(1152, 605, 384, 405);
        tenTen.setBounds(1536, 605, 384, 405);
        nFromK.setBounds(0, 200, 960, 405);
        kFromN.setBounds(960, 200, 960, 405);
        oneBort.setBounds(0, 200, 480, 405);
        oneWithHalfBort.setBounds(480, 200, 480, 405);
        twoBort.setBounds(960, 200, 480, 405);
        twoWithHalfBort.setBounds(1440, 200, 480, 405);
        threeBort.setBounds(0, 605, 480, 405);
        threeWithHalfBort.setBounds(480, 605, 480, 405);
        fourBort.setBounds(960, 605, 480, 405);
        fourWithHalfBort.setBounds(1440, 605, 480, 405);
        buttonNext.setBounds(600, 200, 550, 100);
        buttonStartTraining.setBounds(480, 270, 960, 540);
        buttonEndProgram.setBounds(1520, 1010, 400, 100);
        label.setBounds(600, 0, 960, 100);
        statistic.setBounds(600,100,960,100);
        textField.setBounds(600, 100, 550, 100);
        buttonInCentreEight.setBounds(0, 200, 640, 405);
        buttonInNearCorner.setBounds(640, 200, 640, 405);
        buttonInFarCorner.setBounds(1280, 200, 640, 405);
        buttonKickStrange.setBounds(0, 605, 960, 405);
        buttonInCentreScrew.setBounds(960, 605, 960, 405);
        buttonPopal.setBounds(0, 200, 960, 605);
        buttonNePopal.setBounds(960, 200, 960, 605);
        buttonPopalNeTotVint.setBounds(480, 200, 480, 605);
        buttonNePopalTotVint.setBounds(960, 200, 480, 605);
        buttonIdeal.setBounds(640, 200, 640, 605);
        prokat.setBounds(0, 200, 960, 405);
        nakat.setBounds(960, 200, 960, 405);
        clapshtos.setBounds(0, 605, 960, 405);
        ottajka.setBounds(960, 605, 960, 405);
        /*Размер окна 1920 1110*/
        buttonEndExercise.setBounds(1020,1010,900,100);


//34
        oneTen.addActionListener(new ButtonListenerKolvoBalls(this));
        twoTen.addActionListener(new ButtonListenerKolvoBalls(this));
        threeTen.addActionListener(new ButtonListenerKolvoBalls(this));
        fourTen.addActionListener(new ButtonListenerKolvoBalls(this));
        fiveTen.addActionListener(new ButtonListenerKolvoBalls(this));
        sixTen.addActionListener(new ButtonListenerKolvoBalls(this));
        sevenTen.addActionListener(new ButtonListenerKolvoBalls(this));
        eightTen.addActionListener(new ButtonListenerKolvoBalls(this));
        nineTen.addActionListener(new ButtonListenerKolvoBalls(this));
        tenTen.addActionListener(new ButtonListenerKolvoBalls(this));
        nFromK.addActionListener(new ButtonListenerNorK(this));
        kFromN.addActionListener(new ButtonListenerNorK(this));
        oneBort.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        oneWithHalfBort.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        twoBort.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        twoWithHalfBort.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        threeBort.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        threeWithHalfBort.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        fourBort.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        fourWithHalfBort.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        prokat.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        nakat.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        clapshtos.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        ottajka.addActionListener(new ButtonListenerKolvoBortsAndVints(this));
        buttonNext.addActionListener(new ButtonListenerNext(this));
        buttonStartTraining.addActionListener(new ButtonListenerStartTraining(this));
        buttonEndProgram.addActionListener(new ButtonListenerEndProgram());
        buttonInCentreEight.addActionListener(new ButtonListenerExercises(this));
        buttonInNearCorner.addActionListener(new ButtonListenerExercises(this));
        buttonInFarCorner.addActionListener(new ButtonListenerExercises(this));
        buttonKickStrange.addActionListener(new ButtonListenerExercises(this));
        buttonInCentreScrew.addActionListener(new ButtonListenerExercises(this));
        buttonPopal.addActionListener(new ButtonListenerPopal(this));
        buttonNePopal.addActionListener(new ButtonListenerNePopal(/*this*/));
        buttonPopalNeTotVint.addActionListener(new ButtonListenerPopalNeTotVint(/*this*/));
        buttonNePopalTotVint.addActionListener(new ButtonListenerNePopalTotVint(/*this*/));
        buttonIdeal.addActionListener(new ButtonListenerIdeal(/*this*/));
        buttonEndExercise.addActionListener(new ButtonListenerEndExercise(this));
        //35

        setVisible();

        add(oneTen);
        add(twoTen);
        add(threeTen);
        add(fourTen);
        add(fiveTen);
        add(sixTen);
        add(sevenTen);
        add(eightTen);
        add(nineTen);
        add(tenTen);
        add(nFromK);
        add(kFromN);
        add(oneBort);
        add(oneWithHalfBort);
        add(twoBort);
        add(twoWithHalfBort);
        add(threeBort);
        add(threeWithHalfBort);
        add(fourBort);
        add(fourWithHalfBort);
        add(prokat);
        add(nakat);
        add(clapshtos);
        add(ottajka);
        add(buttonNext);
        add(buttonStartTraining);
        add(buttonEndProgram);
        add(label);
        add(statistic);
        add(textField);
        add(buttonInCentreEight);
        add(buttonInNearCorner);
        add(buttonInFarCorner);
        add(buttonKickStrange);
        add(buttonInCentreScrew);
        add(buttonPopal);
        add(buttonNePopal);
        add(buttonPopalNeTotVint);
        add(buttonNePopalTotVint);
        add(buttonIdeal);
        add(buttonEndExercise);



    }
    public void setVisible() {
        oneTen.setVisible(false);
        twoTen.setVisible(false);
        threeTen.setVisible(false);
        fourTen.setVisible(false);
        fiveTen.setVisible(false);
        sixTen.setVisible(false);
        sevenTen.setVisible(false);
        eightTen.setVisible(false);
        nineTen.setVisible(false);
        tenTen.setVisible(false);
        nFromK.setVisible(false);
        kFromN.setVisible(false);
        oneBort.setVisible(false);
        oneWithHalfBort.setVisible(false);
        twoBort.setVisible(false);
        twoWithHalfBort.setVisible(false);
        threeBort.setVisible(false);
        threeWithHalfBort.setVisible(false);
        fourBort.setVisible(false);
        fourWithHalfBort.setVisible(false);
        prokat.setVisible(false);
        nakat.setVisible(false);
        clapshtos.setVisible(false);
        ottajka.setVisible(false);
        buttonNext.setVisible(false);
        buttonStartTraining.setVisible(true);
        buttonEndProgram.setVisible(true);
        textField.setVisible(false);
        buttonInCentreEight.setVisible(false);
        buttonInNearCorner.setVisible(false);
        buttonInFarCorner.setVisible(false);
        buttonKickStrange.setVisible(false);
        buttonInCentreScrew.setVisible(false);
        buttonPopal.setVisible(false);
        buttonNePopal.setVisible(false);
        buttonPopalNeTotVint.setVisible(false);
        buttonNePopalTotVint.setVisible(false);
        buttonIdeal.setVisible(false);
        label.setVisible(false);
        statistic.setVisible(false);
        buttonEndExercise.setVisible(false);
        label.setText("Выберите упражнение");
    }
}
