package SnakeGames;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("snake_game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameFild());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
