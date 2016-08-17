package Graphics;

import javax.swing.*;

public class MainForm {
    public static void main(String[] args) {
        /**Главный класс.
         * Форма и панелька.*/
        JFrame frame = new JFrame();
        MyPanel panel = new MyPanel();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.add(panel);
        frame.setVisible(true);
    }
}
