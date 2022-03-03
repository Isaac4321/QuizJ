package format;

import items.CustomJMenuItem;
import listeners.actionlisteners.CustomItemActionListener;
import listeners.mouselisteners.ComponentHoverListener;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar {

    private final MenuBar menuBar = this;

    private JMenu quiz;

    private CustomJMenuItem play;
    private CustomJMenuItem create;
    private CustomJMenuItem edit;

    public MenuBar() {
        quiz = new JMenu("Quiz");

        play = new CustomJMenuItem("Play Quiz") {
            @Override
            public void onClick() {
                System.out.println("test");
            }

        };
        play.setToolTipText("Play a Quiz");

        quiz.add(play);

        menuBar.add(quiz);


        for (Component menu : menuBar.getComponents()) {
            if (menu instanceof JMenu) {
                menu.addMouseListener(new ComponentHoverListener());
            }
        }

        for (Component playMenuItem : play.getComponents()) {
            if (playMenuItem instanceof CustomJMenuItem) {
                ((CustomJMenuItem) playMenuItem).onClick();
            }
        }
    }

    public JMenuBar showMenu() {
        return menuBar;
    }


}
