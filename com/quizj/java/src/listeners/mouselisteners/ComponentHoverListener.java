package listeners.mouselisteners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ComponentHoverListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() instanceof JMenu) {
            ((JMenu) e.getSource()).doClick();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
