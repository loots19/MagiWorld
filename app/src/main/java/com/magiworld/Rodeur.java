package com.magiworld;

public class Rodeur extends Joueur {

    /**
     * Constructor
     *
     * @param niveau       niveau du personnage
     * @param force        force du personnage
     * @param agilite      agilité du personnage
     * @param intelligence intelligence du personnage
     * @param numero
     */
    public Rodeur(int niveau, int force, int agilite, int intelligence, int numero) {
        super(niveau, force, agilite, intelligence, numero);
    }

    /**
     *Attaque basique
     * @param adversaire adversaire inflingé par l'attaque
     */
    @Override
    public void attaquerBasique(Joueur adversaire) {
        int dommages = this.getAgilite();
        adversaire.setVie(adversaire.getVie()-dommages);
        System.out.println("Joueur " + this.getNumero() + " utilise Tir à l'Arc et inflinge " + dommages + " dommages");
        System.out.println("Joueur " + this.getNumero() + " perd " + dommages + " points de vie");

    }

    /**
     *Attaque spéciale
     * @param adversaire adversaire inflingé par l'attaque
     */
    @Override
    public void attaquerSpeciale(Joueur adversaire) {
        int gagne = this.getNiveau()/2;
        this.setAgilite(this.getAgilite()+ gagne);
        System.out.println(" Joueur " + this.getNumero() + " concentration " + gagne);
        System.out.println(" Joueur " + this.getNumero() + " gagne " + gagne + " points d'agilité ");

    }

    /**
     * description du personnage
     */
    @Override
    public void look() {
        System.out.println("coucou je suis le Rôdeur joueur " + getNumero() + " niveau " + niveau + " je possède " + vie + " de vitalité " + force + " de force "
                + agilite + " d'agilité " + intelligence + " et d 'intelligence ");

    }
}
