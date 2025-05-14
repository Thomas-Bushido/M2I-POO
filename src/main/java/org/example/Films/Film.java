package org.example.Films;

public class Film {
    /*
    1. Créer une classe "Film"
            2. Ajouter les attributs suivants : titre, réalisateur, année de sortie et genre
3. Ajouter un constructeur, des getters et des setters pour ces attributs, ainsi
    qu'une méthode pour afficher les informations sur le film
    Film{titre='La Haine', realisateur='Mathieu Kassovitz', dateSortie=1995-05-31, genre='Drame'}
    Film{titre='Avatar 2', realisateur='James Cameron', dateSortie=2022-12-14, genre='Action'}
*/
    private String titre;
    private String realisateur;
    private String datePublication;
    private String genre;

    public Film(String titre, String realisateur, String datePublication, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.datePublication = datePublication;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", datePublication='" + datePublication + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
