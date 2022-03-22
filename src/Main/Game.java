package Main;

import javax.swing.*;

public class Game {

    private Snake player;
    private Apple apple;
    private JFrame window;

    public static final int HEIGHT = 600;
    public static final int WIDTH = 800;
    public static final int DIMENSION = 50;


    public Game(){
        setWindow();
    }

    private void setWindow() {
        window = new JFrame();
        window.setTitle("Snake");
        window.setSize(WIDTH, HEIGHT);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
