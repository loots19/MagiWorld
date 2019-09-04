package com.magiworld;

import java.util.Scanner;

public class Partie {


    public static Joueur creation(int numero) {

        Scanner scanner = new Scanner(System.in);
        int role, niveau, force, agilite, intelligence;
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage,)");
            role = scanner.nextInt();
        } while (role < 1 || role > 3);
        do {
            do {
                System.out.println("Niveau du personnage");
                niveau = scanner.nextInt();
            } while (niveau < 1 || niveau > 100);
            do {
                System.out.println("Force du personnage");
                force = scanner.nextInt();
            } while (force < 0 || force > 100);

            do {
                System.out.println("Agilité du personnage");
                agilite = scanner.nextInt();
            } while (agilite < 0 || agilite > 100);

            do {
                System.out.println("Intelligence du personnage");
                intelligence = scanner.nextInt();
            } while (intelligence < 0 || intelligence > 100);

            if ((force + agilite + intelligence) > niveau)
                System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");

        } while((force + agilite + intelligence) > niveau);








        switch (role) {
            case 1:
                return new Guerrier(niveau, force, agilite, intelligence, numero);
            case 2:
                return new Rodeur(niveau, force, agilite, intelligence, numero);
            default:
                return new Mage(niveau, force, agilite, intelligence, numero);
        }

    }


    public void debut() {
        Joueur joueur1;
        Joueur joueur2;
        Action action;

        Scanner scanner1 = new Scanner(System.in);

        /**
         * Création personnage joueur 1
         */
        System.out.println("Création du personnage du joueur 1");
        joueur1 = creation(1);
        joueur1.look();

        /**
         * Création personnage joueur 2
         */
        System.out.println("Création du personnage du joueur 2");
        joueur2 = creation(2);
        joueur2.look();

        action = new Action(joueur1, joueur2);
        action.debut();
    }


}