import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
        // divide the canvas into 4 parts
        // and repeat this pattern in each quarter:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

        graphics.drawLine(WIDTH/2, 0, WIDTH/2 , HEIGHT);
        graphics.drawLine(0, HEIGHT/2, WIDTH, HEIGHT/2);

        for (int i = 0; i < WIDTH/2 ; i += 4) {
            graphics.setColor(Color.PINK);
            graphics.drawLine(i, 0, WIDTH/2, i);
            graphics.drawLine(WIDTH/2 + i, 0, WIDTH, i);
            graphics.drawLine(i, HEIGHT/2, WIDTH/2, HEIGHT/2 + i);
            graphics.drawLine(WIDTH/2 + i, HEIGHT/2, WIDTH, HEIGHT/2 + i);

            graphics.setColor(Color.GRAY);
            graphics.drawLine(0, i, i, HEIGHT/2);
            graphics.drawLine(WIDTH/2, i, WIDTH/2 + i, HEIGHT/2);
            graphics.drawLine(0, HEIGHT/2 + i, i, HEIGHT);
            graphics.drawLine(WIDTH/2, HEIGHT/2 + i, WIDTH/2 + i, HEIGHT);
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
