import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight extends JPanel {

    public static void mainDraw(Graphics graphics){
        // draw the night sky:
        // - The background should be black
        // - The stars can be small squares
        // - The stars should have random positions on the canvas
        // - The stars should have random color (some shade of grey)



        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0 , WIDTH, HEIGHT);
        int X = (int)(Math.random() * 300);
        int Y = (int)(Math.random() * 300);
        int color = (int)(Math.random() * 255);
        graphics.setColor(new Color(color,color,color));
        graphics.fillRect(X,Y, 5,5);
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