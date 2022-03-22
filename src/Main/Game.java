package Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Game {

    private Snake player;
    private Apple apple;
    private JFrame window;
    private Graphics graphics;

    public static final int HEIGHT = 600;
    public static final int WIDTH = 800;
    public static final int DIMENSION = 50;


    public Game() throws IOException {
        setWindow();
    }

    private void setWindow() throws IOException {
        window = new JFrame();
        window.setTitle("Snake");
        window.setSize(WIDTH, HEIGHT);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setIconImage(ImageIO.read(new File("images/snake.png")));
    }


}
