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

    //Cas où notre BoiteDialog renverra le contenu
    //D'un JTextField nommé jtf
    public String showBoiteDialogue(){
        this.sendData = false;

        //Début du dialog
        this.setVisible(true);

        //Le dialogue prend fin
        //Si on a cliqué sur OK, on envoie, sinon on envoie une chaîne vide !
        return (this.sendData)? jtf.getText() : "";

    }
}
