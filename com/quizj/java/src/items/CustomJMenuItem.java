package items;

import javax.swing.*;

public abstract class CustomJMenuItem extends JMenuItem {

    public CustomJMenuItem(String s) {
        super(s);
    }

    public abstract void onClick();

}
