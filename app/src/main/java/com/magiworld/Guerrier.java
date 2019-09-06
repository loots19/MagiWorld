package com.magiworld;

public class Guerrier extends Joueur {


    /**
     * Constructor
     *
     * @param niveau       niveau du personnage
     * @param force        force du personnage
     * @param agilite      agilité du personnage
     * @param intelligence intelligence du personnage
     * @param numero
     */
    public Guerrier(int niveau, int force, int agilite, int intelligence, int numero) {
        super(niveau, force, agilite, intelligence, numero);
    }

    /**
     *Attaque basique
     * @param adversaire adversaire inflingé par l'attaque
     */
    @Override
    public void attaquerBasique(Joueur adversaire) {
        int dommages = this.getForce();
        adversaire.setVie(adversaire.getVie()-dommages);
        System.out.println(" Joueur " + this.getNumero() + " utilise Coup d'Épée et inflinge " + dommages);
        System.out.println(" Joueur " + adversaire.getNumero() + " perd " + dommages + " points de vie ");


    }

    /**
     *Attaque spéciale
     * @param adversaire adversaire inflingé par l'attaque
     */
    @Override
    public void attaquerSpeciale(Joueur adversaire) {
        int dommages = 2*this.getForce();
        adversaire.setVie(adversaire.getVie()-dommages);
        System.out.println(" Joueur " + this.getNumero() + " utilise Coup de rage et inflige " + dommages);
        System.out.println(" Joueur " + adversaire.getNumero() + " perd " + dommages + " points de vie ");

    }

    /**
     * description du personnage
     */
    @Override
    public void look() {
        System.out.println(" Woarg je suis le Guerrier joueur "  +  getNumero() +  " niveau "  +  getNiveau()  +  " je possède "  +  vie  +  " de vitalité "  +  force  +  " de force "
        + agilite + " d'agilité " + intelligence + " et d 'intelligence ");



    }
}

