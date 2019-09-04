package com.magiworld;

public abstract class Joueur {
    protected int niveau;
    protected int vie;
    protected int force;
    protected int agilite;
    protected int intelligence;
    private int numero;

    /**
     * Constructor
     * @param niveau niveau du personnage
     * @param force force du personnage
     * @param agilite agilité du personnage
     * @param intelligence intelligence du personnage
     */
    public Joueur(int niveau, int force, int agilite, int intelligence, int numero) {
        this.niveau = niveau;
        this.vie = this.niveau * 5;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.numero = numero;
    }

    /**
     * Attaquer basique
     * @param adversaire adversaire inflingé par l'attaque
     */
    public abstract void attaquer_basique(Joueur adversaire);

    /**
     * Attaquer spéciale
     * @param adversaire adversaire inflingé par l'attaque
     */
    public abstract void attaquer_speciale(Joueur adversaire);

    /**
     * Imprimer l'information sur le personnage
     */
    public abstract void look();

    /**
     * Vérifier si le personnage est mort
     * @return true si le personnage est mort
     */
    public boolean estMort() {
        return (this.vie <= 0);
    }


    public int getNiveau() {
        return niveau;
    }

    public int getVie() {
        return vie;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getNumero() {
        return numero;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setVie(int vie) {
        this.vie = (vie<=0 ? 0 : vie);
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
