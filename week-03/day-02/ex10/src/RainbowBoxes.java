import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {
    static Graphics g;

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // create a loop that fills the canvas with rainbow colored squares.
        for (int i = 0; i < 255; i += 20) {
            squareDraw(300 - i, 0 + i);
        }

    }

    private static void squareDraw(int squareSize, int fillColor) {
        g.setColor( new Color(fillColor,0,fillColor));
        g.fillRect(WIDTH/2 - squareSize/2, HEIGHT/2 - squareSize/2 -31, squareSize, squareSize);
        return;
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