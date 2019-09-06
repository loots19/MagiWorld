package com.magiworld;

import java.util.Scanner;

public class Action {
    private Joueur joueur1;
    private Joueur joueur2;


    public Action(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    public void debut() {
        int j;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println(" Joueur 1 (" + joueur1.getVie() + " Vitalité) veuillez choisir votre action (1: Attaque basique, 2: Attaque spéciale)");
                j = scanner.nextInt();
            } while (j != 1 && j != 2);
            if (j == 1) joueur1.attaquerBasique(joueur2);
            if (j == 2) joueur1.attaquerSpeciale(joueur2);

            if (joueur1.estMort()) {
                System.out.println(" Joueur 1 est mort ");
                break;
            }
            if (joueur2.estMort()) {
                System.out.println(" Joueur 2 est mort ");
                break;
            }

            scanner = new Scanner(System.in);
            do {
                System.out.println(" Joueur 2 (" + joueur2.getVie() + " Vitalité) veuillez choisir votre action (1: Attaque basique, 2: Attaque spéciale)");
                j = scanner.nextInt();
            } while (j != 1 && j != 2);
            if (j == 1) joueur2.attaquerBasique(joueur1);
            if (j == 2) joueur2.attaquerSpeciale(joueur1);

            if (joueur1.estMort()) {
                System.out.println(" Joueur 1 est mort ");
                break;
            }
            if (joueur2.estMort()) {
                System.out.println(" Joueur 2 est mort ");
                break;
            }
        }
    }

    public void fin() {
        if (joueur1.estMort())
            System.out.println(" Joueur 1 à perdu ");
        else
            System.out.println(" Joueur 2 à perdu ");
        }
    }
