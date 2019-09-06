package com.magiworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuerrierTest {
    Joueur joueur1 = new Guerrier(10, 10, 0, 0, 1);
    Joueur joueur2 = new Mage(10, 10, 0, 0, 2);


    @Test
    public void Given_GuerrierForce_When_Attaquer_BasiqueSelected_Then_RemoveGoodAmountOfLifeToJoueur2WithoutChangeLifeOfJoueur1() {
        joueur1.attaquerBasique(joueur2);
        assertEquals(40, joueur2.getVie());
        assertEquals(50, joueur1.getVie());
    }


    @Test
    public void Given_GuerrierForce_When_attaquer_speciale_Then_Joueur2looseLifeAmountGuerrierAndJoueur1_RemoveAlfAmountOfLife() {
        joueur1.attaquerSpeciale(joueur2);
        assertEquals(50,joueur2.getVie());
        assertEquals(25,joueur1.getVie());


    }

}