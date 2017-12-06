import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    static  Graphics g;

    public static void mainDraw(Graphics graphics){
        //int startpoint = 0;
        int squareSize = 15;
        int sum = 0;
        for (int i = 0 ; i < 10; i ++) {
            g.setColor(new Color(151, 0, 151));
            g.fillRect(sum * squareSize, sum * squareSize,
                        i * squareSize, i * squareSize);
            //sorrendiség! ha ez a négyzetrajzolása előtt van, teljesen más lesz a kép
            sum = sum + i;
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
