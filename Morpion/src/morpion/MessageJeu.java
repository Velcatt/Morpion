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
public class MessageJeu {
    //attributs
    private final Actions action;
    private final int x;
    private final int y;
    //constructeurs
    MessageJeu(Actions a,int x,int y){
        this.action=a;
        this.x=x;
        this.y=y;
    }
    //méthodes

    /**
     * @return the action
     */
    public Actions getAction() {
        return action;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
}
