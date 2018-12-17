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
    private final boolean enfant;
    //constructeurs
    MessageNouveauJoueur(Actions a,String p,boolean e){
        this.action=a;
        this.pseudo=p;
        this.enfant=e;
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
    public boolean getEnfant() {
        return enfant;
    }

    /**
     * @return the action
     */
    public Actions getAction() {
        return action;
    }
}
