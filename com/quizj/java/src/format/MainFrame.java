package format;

import javax.swing.*;

public class MainFrame extends JFrame {

    private final JFrame frame = this;

    public MainFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setName("QuizJ");
    }

    public void init() {
        frame.setJMenuBar(new MenuBar().showMenu());

        frame.setVisible(true);
    }


}
