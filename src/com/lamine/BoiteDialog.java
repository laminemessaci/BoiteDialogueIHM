package com.lamine;

import javax.swing.*;
import java.awt.*;

public class BoiteDialog extends JDialog {

    public BoiteDialog(JFrame parent, String title, boolean modal) {
        //On appelle le constructeur de JDialog correspondant
        super(parent, title, modal);
        //On specifie une taille
        this.setSize(200, 90);
        //La position
        this.setLocationRelativeTo(null);
        //La boite ne devra pas être redimensionnable
        this.setResizable(false);


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
