package com.magiworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class MageTest {
    Joueur joueur1 = new Mage(10,10,0,0,1);
    Joueur joueur2 = new Mage(10,10,0,0,2);

    @Test
    public void Given_Mageintelligence_When_Attaquer_BasiqueSelected_Then_RemoveGoodAmountOfLifeToJoueur2WithoutChangeLifeOfJoueur1() {
        joueur1.attaquerBasique(joueur2);
        assertEquals(50, joueur2.getVie());
        assertEquals(50, joueur1.getVie());
    }

    @Test
    public void Given_Mage_When_attaquer_speciale_joueur1HealHisLife_Then_winTimesTwoAmountOfIntelligenceInLife() {
        joueur1.attaquerSpeciale(joueur2);
        assertEquals(50,joueur1.getVie());
    }


}