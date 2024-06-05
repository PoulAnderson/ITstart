package Tic_tac;

import javax.swing.*;
import java.awt.*;

public class Tic_tac_toe {
    public static void main(String[] args) {
        System.out.println("Launch the game...");
        JFrame window = new JFrame("Tic Tac Toe");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 400);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        TicTakToe game = new TicTakToe();
        window.add(game);
        System.out.println("End...");
    }
}
