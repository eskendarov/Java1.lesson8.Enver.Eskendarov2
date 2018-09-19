package ru.eskendarov.ea.homework_8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Dz_8 {
    public Dz_8() {
        JFrame frame = new JFrame("Random Color");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        JButton button = new JButton(" >> Run >>");
        frame.add(button);
        Random rnd = new Random(System.currentTimeMillis());
        button.addActionListener(e -> {
                frame.getContentPane().setBackground(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Dz_8 dz_8 = new Dz_8();
    }
}