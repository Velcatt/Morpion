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
public class Affrontement {
    //attributs
    private int joueur1;
    private int joueur2;
    //constructeurs
    Affrontement(int j1, int j2){
        this.joueur1=j1;
        this.joueur2=j2;
    }
    //méthodes
    public int getJ1(){
        return this.joueur1;
    }
    public int getJ2(){
        return this.joueur2;
    }
}
