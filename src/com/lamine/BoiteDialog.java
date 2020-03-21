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
        // On l'affiche
        this.setVisible(true);


    }
}
