import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class squareFractal {
    static Graphics g;

    public static void mainDraw(Graphics graphics) {
        g.setColor(Color.ORANGE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        /**g.setColor(Color.BLACK);
         g.drawLine(0, HEIGHT/3, WIDTH, HEIGHT/3);
         g.drawLine(0, 2 * HEIGHT/3, WIDTH,  2 * HEIGHT/3);
         g.drawLine(WIDTH/3, 0, WIDTH/3, HEIGHT);
         g.drawLine(2 * WIDTH/3, 0, 2 * WIDTH/3, HEIGHT);
         fractal(WIDTH, HEIGHT); **/
        fractal(WIDTH/2, WIDTH/2, WIDTH);
    }

    public static void fractal(int X, int Y, int size) {

        if ( size > 5) {
            g.setColor(Color.BLACK);

            int startXHorizontal = X - size / 2;
            int endXHorizontal = X + size / 2;

            int leftXVertical = X - size / 6;
            int rightXVertical = X + size / 6;

            int upperYHorizontal = Y - size / 6;
            int lowerYHorizontal = Y + size / 6;

            int startYVertical = Y - size / 2;
            int endYVertical = Y + size / 2;

            g.drawLine(startXHorizontal, upperYHorizontal, endXHorizontal, upperYHorizontal);
            g.drawLine(startXHorizontal, lowerYHorizontal, endXHorizontal, lowerYHorizontal);
            g.drawLine(leftXVertical, startYVertical, leftXVertical, endYVertical);
            g.drawLine(rightXVertical,startYVertical, rightXVertical, endYVertical);

            fractal(X , Y - 2 * size / 6,  size / 3);
            fractal(X + 2 * size / 6,  Y ,  size / 3);
            fractal(X , Y +  2 * size / 6,  size/ 3);
            fractal(X - 2 * size / 6, Y ,  size/ 3);



            //Draw the web only in the top left corner

            /**g.drawLine(0, size / 3, size, size / 3);
            g.drawLine(0, 2 * size / 3, size, 2 * size / 3);
            g.drawLine(size / 3, 0, size / 3, size);
            g.drawLine(2 * size / 3, 0, 2 * size / 3, size);
            fractal(X + size / 3, Y,  size / 3);
            fractal(X,  Y + size /3,  size / 3);
            fractal(X + 2 * size / 3, Y + size /3,  size/ 3);
            fractal(X + 2 * size / 3, Y + size / 3,  size/ 3); **/
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