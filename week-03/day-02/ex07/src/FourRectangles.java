import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        graphics.setColor(Color.PINK);
        graphics.fillRect(20, 20, 100, 40);
        graphics.setColor(Color.ORANGE);
        graphics.fillRect(30, 70, 70, 40);
        graphics.setColor(Color.CYAN);
        graphics.fillRect(40, 100, 40, 40);
        graphics.setColor(Color.GRAY);
        graphics.fillRect(50, 120, 20, 40);


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
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
