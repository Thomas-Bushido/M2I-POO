package org.example.Annuaire;

public class Entreprise {
    private String nom;
    private int siret;
    private String webSite;
    private String adresse;

    public Entreprise(String nom, int siret, String webSite, String adresse) {
        this.nom = nom;
        this.siret = siret;
        this.webSite = webSite;
        this.adresse = adresse;
    }
    @Override
    public String toString() {
        return "Entreprise: " + '\'' +
                "nom='" + nom + '\'' +
                ", siret=" + siret +
                ", adresse='" + adresse + '\'' +
                ", webSite='" + webSite + '\'';
    }
}