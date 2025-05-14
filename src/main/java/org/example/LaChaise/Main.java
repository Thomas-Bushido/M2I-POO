package org.example.LaChaise;

public class Main {
    public static void main(String[] args) {

        Chaise chaise1 = new Chaise();
        chaise1.setNombrePieds(4);
        chaise1.setMateriaux("bois");
        chaise1.setCouleur("rouge");
        Chaise chaise2 = new Chaise();
        chaise1.setNombrePieds(4);
        chaise1.setMateriaux("bois");
        chaise1.setCouleur("rouge");
        Chaise chaise3 = new Chaise();
        chaise1.setNombrePieds(4);
        chaise1.setMateriaux("bois");
        chaise1.setCouleur("rouge");
        System.out.println(chaise1.toString() + chaise2.toString() + chaise3.toString());




    }
}