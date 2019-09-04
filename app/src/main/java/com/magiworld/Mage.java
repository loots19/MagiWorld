package com.magiworld;

public class Mage extends Joueur {

    /**
     * Constructor
     *
     * @param niveau       niveau du personnage
     * @param force        force du personnage
     * @param agilite      agilité du personnage
     * @param intelligence intelligence du personnage
     * @param numero
     */
    public Mage(int niveau, int force, int agilite, int intelligence, int numero) {
        super(niveau, force, agilite, intelligence, numero);
    }

    @Override
    public void attaquer_basique(Joueur adversaire) {
        int dommages = this.getIntelligence();
        adversaire.setVie(adversaire.getVie()-dommages);
        System.out.println(" Joueur " + this.getNumero() + " utilise Boule de feu et inflinge " + dommages + " dommages ");
        System.out.println(" Joueur " + adversaire.getNumero() + " perd " + dommages + " points de vie ");

    }

    @Override
    public void attaquer_speciale(Joueur adversaire) {
        int gagne = 2*this.getIntelligence();
        this.setVie(this.getVie() + gagne);
        System.out.println(" Joueur " + this.getNumero() + " utilise Soin " );
        System.out.println(" Joueur " + this.getNumero() + " gagne" + gagne + " points de vie ");

    }

    @Override
    public void look() {
        System.out.println(" Abracadabra je suis le Mage joueur " + getNumero() + " niveau " + niveau + " je possède " + vie + " de vitalité " + force + " de force "
                + agilite + " d'agilité " + intelligence + " et d 'intelligence ");

    }

    @Override
    public void setVie(int vie) {
        if (vie>5*this.getNiveau()){
            this.vie = 5 * this.getNiveau();
        }
            else
                this.vie = vie;
        }

    }

