package com.lamine;

public class ObjetDialogInfo {

    private String nom, sexe, age, cheveux, taille;

    //Constructeurs
    public ObjetDialogInfo() { }

    public ObjetDialogInfo(String nom, String sexe, String age, String cheveux, String taille) {
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        this.cheveux = cheveux;
        this.taille = taille;
    }

    @Override
    public String toString() {
        String str;
        if(this.nom != null && this.sexe != null && this.taille != null && this.age != null && this.cheveux != null){
            str = "Description de l'objet InfoZDialog";
            str += "Nom : " + this.nom + "\n";
            str += "Sexe : " + this.sexe + "\n";
            str += "Age : " + this.age + "\n";
            str += "Cheveux : " + this.cheveux + "\n";
            str += "Taille : " + this.taille + "\n";
        }
        else{
            str = "Aucune information !";
        }
        return str;
    }
}
