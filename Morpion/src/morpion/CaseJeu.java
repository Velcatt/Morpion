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
public class CaseJeu {
    //attributs
    private EtatCase Etat;
    private final int X;
    private final int Y;
    //constructeurs
    public CaseJeu(int x,int y){
        this.X=x;
        this.Y=y;
        this.Etat=EtatCase.VIDE;
    }
    //méthodes

    /**
     * @return the Etat
     */
    public EtatCase getEtat() {
        return Etat;
    }

    /**
     * @param Etat the Etat to set
     */
    public void setEtat(EtatCase Etat) {
        this.Etat = Etat;
    }
}
