import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class FileMenu {

    private ArrayList<String> listItems = new ArrayList<String>();
    private int startPos;
    public FileMenu(int startPos) {
        this.startPos = startPos;
        listItems.add("File");
        listItems.add("File");
        listItems.add("File");
    }

    public void draw(Graphics2D graphics) {
        graphics.setColor(Color.lightGray);
        for (int i = 0; i < listItems.size(); i++) {
            graphics.drawString(listItems.get(i), 20, startPos);
            //graphics.drawLine(20, startPos + 20, 280, startPos + 25);
            startPos += 50;
        }
    }

}
