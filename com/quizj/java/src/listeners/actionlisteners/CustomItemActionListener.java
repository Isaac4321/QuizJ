package listeners.actionlisteners;

import items.CustomJMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomItemActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof CustomJMenuItem) {
            System.out.println("test");
            ((CustomJMenuItem) e.getSource()).onClick();
        }
    }
}
