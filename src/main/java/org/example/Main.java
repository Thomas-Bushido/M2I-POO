package org.example;

import java.util.Scanner;
import org.example.Annuaire.Entreprise;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Créez votre entreprise:"+ '\n' + "1/ Saisir le nom: ");
        String company = scanner.nextLine();
        System.out.println("2/ Saisir le siret: ");
        int siret = scanner.nextInt();
        scanner.nextLine();
        System.out.println("3/ Saisir l'url du site web: ");
        String url = scanner.nextLine();
        System.out.println("4/ Saisir l'adresse: ");
        String address = scanner.nextLine();


        Entreprise Entreprise1 = new Entreprise(company, siret, url, address);
        System.out.println(Entreprise1);
    }
}
