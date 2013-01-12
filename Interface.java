import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @author FichteFoll
  */

public class Interface extends JFrame {
    // Anfang Attribute
    // Ende Attribute

    private int width  = 800;
    private int height = 600;

    private Point ballPosition[] = new Point(0, 0);

    public Interface(String title) {
        super(title);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(width, height);

        // center the window
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width  - getSize().width ) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);

        setResizable(false);
        setLayout(null);
    }

    public void repaint(Graphics2D g) {
        // do some painting here
    }

    public Bounds getFieldBounds() {
        // returns the actiual bounds of the playable field without borders
    }

    public void setBallPosition(int x, int y) {
        ballPosition.setLocation(x, y); // identical with .move
    }

    public void setBallPosition(Point p) {
        ballPosition.setLocation(p);
    }

    /*public static void main(String[] args) {
        new Interface("Interface");
    }*/
}
