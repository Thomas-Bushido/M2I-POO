package org.example.Joueur;

public class Joueur {
    /*Exercice : Joueur
1. Créer une classe Joueur
2. Ajouter les attributs suivants : nom, niveau et points d'expérience
3. Ajouter un constructeur, des getters et des setters pour ces attributs
4. Créer une méthode effectuerUneQuete() qui ajoute 10 points d'expérience
au joueur
5. Créer qu'une méthode qui augmente le niveau du joueur de +1 si son
expérience dépasse 100 points et réinitialise son expérience
6. Tester le programme*/

    private String nom;
    private int niveau;
    private int points;
    public static int xp;

    public Joueur(String nom, int niveau, int points) {
        this.nom = nom;
        this.niveau = niveau;
        this.points = points;
    }

    public static int getXp() {
        return xp;
    }

    public static void setXp(int xp) {
        Joueur.xp = xp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void effectuerUneQuete() {
        this.points = points + 10;
        if(this.points>=100){
            this.levelUp();
            this.points = 0;
        }

    }

    public void levelUp() {

        this.niveau++;

    }


    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", points=" + points +
                '}';
    }
}
