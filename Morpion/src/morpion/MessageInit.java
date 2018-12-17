/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

/**
 *
 * @author Tanguy
 */
public class MessageInit {
    //attributs
    private final Actions action;
    private final int nbjoueurs;
    //constructeurs
    MessageInit(Actions a, int n){
        this.action=a;
        this.nbjoueurs=n;
    }
    //méthodes

    /**
     * @return the action
     */
    public Actions getAction() {
        return action;
    }

    /**
     * @return the nbjoueurs
     */
    public int getNbjoueurs() {
        return nbjoueurs;
    }
    
}
