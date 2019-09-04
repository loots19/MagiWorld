package com.magiworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class RodeurTest {
    Joueur joueur1 = new Rodeur(10,10,0,0,1);
    Joueur joueur2 = new Rodeur(10,10,0,0,2);

    @Test
    public void Given_RodeurAgilite_When_Attaquer_BasiqueSelected_Then_RemoveGoodAmountOfLifeToJoueur2WithoutChangeLifeOfJoueur1() {
        joueur1.attaquer_basique(joueur2);
        assertEquals(50, joueur2.getVie());
        assertEquals(50, joueur1.getVie());
    }

    @Test
    public void Given_rodeurNiveau_When_attaquer_Speciale_Then_Joueur1WinAlfAmountOfNiveauInAgilite() {
        joueur1.attaquer_speciale(joueur2);
        assertEquals(5,joueur1.getAgilite());

    }



}