/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author rousstan
 */
public class Controleur {
    //attributs
    //constucteurs
    //méthodes

    public ArrayList<Joueur> initJoueurs(int nbjoueurs){
        String nomj,nivj;
        ArrayList<Joueur> ListeJoueur = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=nbjoueurs;i++){
            System.out.println("Nom du joueur "+i+" : ");
            nomj=sc.nextLine();
            System.out.println("Ce joueur est-il un enfant ? (o/n)");
            nivj=sc.nextLine();
            if(nivj.equals("o")){
                ListeJoueur.add(new Joueur(nomj,NiveauJoueur.ENFANT));
            }else{
                ListeJoueur.add(new Joueur(nomj,NiveauJoueur.ADULTE));
            }
        }
        return ListeJoueur;
    }
    
    
    public ArrayList<Affrontement> initListeAffrontement(int nbjoueurs){
        int nba=1;
        int outil=1;
        for(int i=3;i<=nbjoueurs;i++){
            nba=(i-1)*(i-1)-nba;
        }
        ArrayList<Affrontement> ListeAffrontement = new ArrayList(nba);
        for(int i=1;i<nbjoueurs;i++){
            for(int j=nbjoueurs;j>outil;j--){
                ListeAffrontement.add(new Affrontement(i,j));
            }
        if(outil<nbjoueurs){outil=outil+1;}
        }
        Collections.shuffle(ListeAffrontement);
        return ListeAffrontement;
    }
}
