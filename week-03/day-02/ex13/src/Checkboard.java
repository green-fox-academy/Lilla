import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkboard {

    public static void mainDraw(Graphics graphics){
        // fill the canvas with a checkerboard pattern.
        int squareSize = 20;
        for (int i = 0; i < 300; i += 2 * squareSize) {
            for (int j = 0; j < 300 ; j += 2 * squareSize) {
                graphics.setColor(Color.PINK);
                graphics.fillRect( j  , i, squareSize , squareSize );
                graphics.fillRect( squareSize + j, i + squareSize, squareSize, squareSize);
            }

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
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}