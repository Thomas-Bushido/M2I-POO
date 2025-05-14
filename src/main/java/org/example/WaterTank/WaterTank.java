package org.example.WaterTank;

public class WaterTank {
    /*Exercice : WaterTank
1. Créer une classe WaterTank
2. Ajouter les attributs suivants: poids à vide, capacité maximale, niveau de
remplissage
3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne
4. Créer une méthode vider() qui enlèvera un volume d'eau à la citerne
5. Créer un attribut de classe qui contiendra la totalité des volumes d'eau de la
citerne
6. /!\ le volume d'eau d'une citerne ne peut pas être négatif ou dépasser le
volume maximum*/
    private double poidsAVide;
    private double capaciteMax;
    private double niveauDeRemplissage;
    private double volume;

    public WaterTank(double poidsAVide, double niveauDeRemplissage, double capaciteMax) {
        this.poidsAVide = poidsAVide;
        this.niveauDeRemplissage = niveauDeRemplissage;
        this.capaciteMax = capaciteMax;
    }

    public double getPoidsAVide() {
        return poidsAVide;
    }

    public void setPoidsAVide(double poidsAVide) {
        this.poidsAVide = poidsAVide;
    }

    public double getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(double capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public double getNiveauDeRemplissage() {
        return niveauDeRemplissage;
    }

    public void setNiveauDeRemplissage(double niveauDeRemplissage) {
        this.niveauDeRemplissage = niveauDeRemplissage;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void remplir(int volume){
      for(double i =this.niveauDeRemplissage; i< this.capaciteMax; i+=this.volume) {
          if(this.niveauDeRemplissage <= this.capaciteMax) {

              this.niveauDeRemplissage += volume;
              System.out.println("le volume ajouté est de +"+ volume+ "\n"+ "Niveau de remplissage actuel: "+ this.niveauDeRemplissage);
          } else {

              System.out.println("volume max atteint");
              return;
          }


      }
    }
    public void vider(int volume){
        for(double i =this.niveauDeRemplissage; i> 0; i-=this.volume) {
            if(this.niveauDeRemplissage > 0) {

                this.niveauDeRemplissage -= volume;
                System.out.println("le volume retiré est de +"+ volume+ "\n"+ "Niveau de remplissage actuel: "+ this.niveauDeRemplissage);
            } else {

                System.out.println("volume minimum atteint");
                return;
            }


        }
    }
/*
    public void vider(int volume) {
        for(double i =this.niveauDeRemplissage; i> 0; i--) {
            if(this.niveauDeRemplissage >= this.capaciteMax) {
                System.out.println("volume max atteint");
                return;
            } else {
                this.niveauDeRemplissage += volume;
            }


        }
    }
    */
/*
    @Override
    public String toString() {
        return "Citerne: "+
                "poids à vide=" + poidsAVide  + "\n" +
                " capacite Max=" + capaciteMax  + "\n" +
                " niveau de remplissage=" + niveauDeRemplissage + "\n";
    }
    */


}
