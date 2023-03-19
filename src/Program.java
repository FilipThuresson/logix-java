import javax.swing.*;
import java.awt.*;

public class Program extends JFrame {
    private Board board;
    private SideBar sideBar;
    public Program() {
        this.setTitle("Logix - Java");
        this.sideBar = new SideBar();
        this.board = new Board();
        this.setLayout(new BorderLayout());
        this.add(sideBar, BorderLayout.WEST);
        this.add(board, BorderLayout.EAST);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        board.start();
    }

    public static void main(String[] args) {
        Program Program = new Program();
    }
}
