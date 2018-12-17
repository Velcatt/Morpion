/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;
import java.util.ArrayList;

/**
 *
 * @author rousstan
 */
public class Morpion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controleur controleur = new Controleur();
        ArrayList<Affrontement> liste = controleur.initListeAffrontement(7);
        for(int i=0;i<liste.size();i++){
            System.out.println(liste.get(i).getJ1()+ "-" +liste.get(i).getJ2());
        }
        //ArrayList<Joueur> liste2 = controleur.initJoueurs(7);
        //for(int i=0;i<liste2.size();i++){
        //    System.out.println("joueur n°"+ (i+1) +" : " +liste2.get(i).getNomjoueur() + " - " + liste2.get(i).getNiveau());
        //}
        
        controleur.p.plateau[0][0].setEtat(EtatCase.CROIX);
        controleur.p.plateau[0][2].setEtat(EtatCase.CROIX);
        controleur.p.plateau[0][1].setEtat(EtatCase.CROIX);
        System.out.println(controleur.verifVictoireX());
        System.out.println(controleur.verifVictoireO());
        
        VueJeu test;
        test = new VueJeu();
        test.afficher();
        
    }   
    
    
}
