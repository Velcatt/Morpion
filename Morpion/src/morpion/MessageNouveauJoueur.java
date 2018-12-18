/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

/**
 *
 * @author lacranto
 */
public class MessageNouveauJoueur {
    //attributs
    private final Actions action;
    private final String pseudo;
    private final NiveauJoueur niveau;
    //constructeurs
    MessageNouveauJoueur(Actions a,String p,NiveauJoueur n){
        this.action=a;
        this.pseudo=p;
        this.niveau=n;
    }
    //méthodes

    /**
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * @return the enfant
     */
    public NiveauJoueur getNiveau() {
        return niveau;
    }

    /**
     * @return the action
     */
    public Actions getAction() {
        return action;
    }
}
