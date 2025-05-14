package org.example.LaChaise;

public class Chaise {
    /*1. Créer une classe Chaise possédant comme variables d’instance le nombre de pieds, le
matériaux et la couleur de l’objet
2. Afficher ses informations en surchargeant une méthode de la classe Object
3. La classe Chaise pourra être instanciée avec ou sans paramètres (Constructeur par
défaut)
4. Afficher toutes les chaises (Possibilité de simplifier avec une méthode ToString)
*/
private int nombrePieds = 5;
private String materiaux = "bois";
private String couleur= "rouge";

    public Chaise() {

    }

    public int getNombrePieds() {
        return nombrePieds;
    }

    public void setNombrePieds(int nombrePieds) {
        this.nombrePieds = nombrePieds;
    }

    public String getMateriaux() {
        return materiaux;
    }

    public void setMateriaux(String materiaux) {
        this.materiaux = materiaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String toString() {
        return "Chaise: " +
                "nombrePieds=" + nombrePieds +
                ", materiaux='" + materiaux + '\'' +
                ", couleur='" + couleur + '\'';
    }
}
