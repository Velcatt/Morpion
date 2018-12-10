/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

/**
 *
 * @author rousstan
 */
public class Joueur {
    //attributs
    private String nomjoueur="";
    private NiveauJoueur niveau;
    //constructeurs
    Joueur(String n,NiveauJoueur nj){
        this.nomjoueur=n;
        this.niveau=nj;
    }
    //méthodes

    /**
     * @return the nomjoueur
     */
    public String getNomjoueur() {
        return nomjoueur;
    }

    /**
     * @return the niveau
     */
    public NiveauJoueur getNiveau() {
        return niveau;
    }

}
