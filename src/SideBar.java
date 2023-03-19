import javax.swing.*;
import java.awt.*;

public class SideBar extends JComponent {

    public SideBar() {

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300, 960);
    }

    @Override
    protected void paintComponent(Graphics arg0) {
        super.paintComponent(arg0);
        Graphics2D graphics = (Graphics2D)arg0;
        graphics.setColor(new Color(30,30,30));
        graphics.fillRect(0, 0, getWidth(), getHeight());
    }
}
