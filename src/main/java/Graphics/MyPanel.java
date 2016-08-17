package Graphics;

import ButtonListeners.*;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    /**
     * Класс панельки
     */
    public JButton buttonStartTraining;
    public JButton buttonInCentreEight;
    public JButton buttonInNearCorner;
    public JButton buttonInFarCorner;
    public JButton buttonKickStrange;
    public JButton buttonInCentreScrew;
    public JButton buttonEndExercise;
    public JButton buttonEndProgram;

    public JButton buttonPopal;
    public JButton buttonNePopal;
    public JButton buttonPopalNeTotVint;
    public JButton buttonNePopalTotVint;
    public JButton buttonIdeal;
    public JButton buttonNext;
    public JTextField textField;

    public JLabel label;

    public Font font;

    public MyPanel() {
        /**Размер окна 1110 1920*/
        setLayout(null);

        textField = new JTextField();

        label = new JLabel();

        font = new Font("Arial", Font.PLAIN, 70);

        buttonNext=new JButton("Далее");
        buttonNext.setFont(font);
        buttonNext.setBounds(600,200,550,100);
        buttonNext.addActionListener(new ButtonListenerNext(this));
        buttonNext.setVisible(false);
        add(buttonNext);

        buttonStartTraining = new JButton("Начать тренировку!");
        buttonInCentreEight = new JButton("В центр 8");
        buttonInNearCorner = new JButton("В ближний угол");
        buttonInFarCorner = new JButton("В дальний угол");
        buttonKickStrange = new JButton("Сила удара");
        buttonInCentreScrew = new JButton("В центр винт");
        buttonEndExercise = new JButton("Закончить упражнение");
        buttonEndProgram = new JButton("Выход");

        buttonStartTraining.setBounds(480, 270, 960, 540);
        buttonStartTraining.setFont(font);
        buttonStartTraining.addActionListener(new ButtonListenerStartTraining(this));
        buttonStartTraining.setVisible(true);
        add(buttonStartTraining);

        buttonEndProgram.setBounds(1520, 1010, 400, 100);
        buttonEndProgram.setFont(font);
        buttonEndProgram.addActionListener(new ButtonListenerEndProgram());
        buttonEndProgram.setVisible(true);
        add(buttonEndProgram);

        textField.setFont(font);

        label.setFont(font);
        label.setBounds(600, 0, 960, 100);
        label.setText("Выберите упражнение");
        label.setVisible(false);
        add(label);

        textField.setBounds(600,100,550,100);
        textField.setVisible(false);
        add(textField);

        buttonInCentreEight.setBounds(0, 200, 640, 405);
        buttonInCentreEight.setFont(font);
        buttonInCentreEight.addActionListener(new ButtonListenerExercises(this));
        buttonInCentreEight.setVisible(false);
        add(buttonInCentreEight);

        buttonInNearCorner.setBounds(640, 200, 640, 405);
        buttonInNearCorner.setFont(font);
        buttonInNearCorner.addActionListener(new ButtonListenerExercises(this));
        buttonInNearCorner.setVisible(false);
        add(buttonInNearCorner);

        buttonInFarCorner.setBounds(1280, 200, 640, 405);
        buttonInFarCorner.setFont(font);
        buttonInFarCorner.addActionListener(new ButtonListenerExercises(this));
        buttonInFarCorner.setVisible(false);
        add(buttonInFarCorner);

        buttonKickStrange.setBounds(0, 605, 960, 405);
        buttonKickStrange.setFont(font);
        buttonKickStrange.addActionListener(new ButtonListenerExercises(this));
        buttonKickStrange.setVisible(false);
        add(buttonKickStrange);

        buttonInCentreScrew.setBounds(960, 605, 960, 405);
        buttonInCentreScrew.setFont(font);
        buttonInCentreScrew.addActionListener(new ButtonListenerExercises(this));
        buttonInCentreScrew.setVisible(false);
        add(buttonInCentreScrew);

        buttonPopal = new JButton("Попал");
        buttonPopal.setFont(font);
        buttonPopal.setBounds(0, 200, 960, 605);
        buttonPopal.addActionListener(new ButtonListenerPopal());
        add(buttonPopal);
        buttonPopal.setVisible(false);

        buttonNePopal = new JButton("Не попал");
        buttonNePopal.setFont(font);
        buttonNePopal.setBounds(960, 200, 960, 605);
        buttonNePopal.addActionListener(new ButtonListenerNePopal());
        add(buttonNePopal);
        buttonNePopal.setVisible(false);

        buttonPopalNeTotVint = new JButton("Попал без винта");
        buttonPopalNeTotVint.setFont(font);
        buttonPopalNeTotVint.setBounds(480, 200, 480, 605);
        buttonPopalNeTotVint.addActionListener(new ButtonListenerPopalNeTotVint());
        add(buttonPopalNeTotVint);
        buttonPopalNeTotVint.setVisible(false);


        buttonNePopalTotVint = new JButton("Не попал с винтом");
        buttonNePopalTotVint.setFont(font);
        buttonNePopalTotVint.setBounds(960, 200, 480, 605);
        buttonNePopalTotVint.addActionListener(new ButtonListenerNePopalTotVint());
        add(buttonNePopalTotVint);
        buttonNePopalTotVint.setVisible(false);

        buttonIdeal = new JButton("Идеально");
        buttonIdeal.setFont(font);
        buttonIdeal.setBounds(640,200,640,605);
        buttonIdeal.addActionListener(new ButtonListenerIdeal());
        add(buttonIdeal);
        buttonIdeal.setVisible(false);

    }
}
