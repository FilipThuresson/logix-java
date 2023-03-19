import javax.swing.*;
import java.awt.*;

public class Board extends JComponent {
    public Board() {

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1300, 960);
    }

    @Override
    protected void paintComponent(Graphics arg0) {
        super.paintComponent(arg0);
        Graphics2D graphics = (Graphics2D)arg0;
        graphics.setColor(new Color(50,50,50));
        graphics.fillRect(0, 0, getWidth(), getHeight());
    }

}
