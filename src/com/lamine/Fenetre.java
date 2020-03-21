package com.lamine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre  extends JFrame {
    private JButton button = new JButton("Appelà la BoiteDialogue");

    public Fenetre() {

        this.setTitle("Ma JFrame");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BoiteDialog bd = new BoiteDialog(null, "Coucou", true);
            }
        });

    }


}
