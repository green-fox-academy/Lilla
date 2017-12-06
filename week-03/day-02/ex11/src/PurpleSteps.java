import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    static  Graphics g;

    public static void mainDraw(Graphics graphics){
        int startpoint = 0;
        int squareSize = 30;
        for (int i = 0 ; i < 6; i ++) {
            g.setColor(new Color(151, 0, 151));
            g.fillRect(startpoint + i * squareSize, startpoint + i * squareSize, squareSize, squareSize);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            g = graphics;
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}