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
import java.util.Observer;
import java.util.Observable;

/**
 *
 * @author rousstan
 */
public class Controleur implements Observer{
    //attributs
    Plateau p = new Plateau();
    ArrayList<Joueur> ListeJoueur = new ArrayList();
    Joueur JoueurManche[] = new Joueur[2];
    private VueInitialisation VI;
    //constucteurs
    Controleur(){
        VueInitialisation VI = new VueInitialisation();
        VI.addObserver(this);
        VI.afficher();
    }
    //méthodes

    @Override
    public void update(Observable arg0,Object arg1){
        if (arg1 instanceof MessageInit) {
            MessageInit mi = (MessageInit) arg1;
            if(mi.getAction()==Actions.ANNULER){
                System.out.println("Vous venez d'annuler.");
            }else if(mi.getAction()==Actions.VALIDER){
                VueNouveauJoueur VNJ = new VueNouveauJoueur();
                VNJ.afficher();
                initListeAffrontement(mi.getNbjoueurs());
                System.out.println("Vous avez bien initialisé "+mi.getNbjoueurs()+" joueurs.");
            }      
        }
        if (arg1 instanceof MessageNouveauJoueur){
            MessageNouveauJoueur mnj = (MessageNouveauJoueur) arg1;
            if(mnj.getAction()==Actions.ANNULER){
                System.out.println("Vous venez d'annuler.");
            }else if(mnj.getAction()==Actions.VALIDER){
                ListeJoueur.add(new Joueur(mnj.getPseudo(),mnj.getNiveau()));
            }
        }
        if (arg1 instanceof MessageJeu){
            MessageJeu mj = (MessageJeu) arg1;
            if(mj.getAction()==Actions.ANNULER){
                System.out.println("Vous venez d'annuler.");
            }else if(mj.getAction()==Actions.COCHERCASE){
                //if(JoueurCourant==JoueurManche[0]){
                //    this.cocherCaseX(mj.getX(), mj.getY());
                //}else if(JoueurCourant==JoueurManche[1]){
                //    this.cocherCaseO(mj.getX(), mj.getY());
               //}
            }
        }
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
    public boolean verifVictoireX(){
        boolean vic=false;
        for(int i=0;i<3;i++){
            if(p.plateau[i][0].getEtat()==EtatCase.CROIX && 
            p.plateau[i][1].getEtat()==EtatCase.CROIX && 
            p.plateau[i][2].getEtat()==EtatCase.CROIX){
                vic=true;
                System.out.println("test");
            }
            if(p.plateau[0][i].getEtat()==EtatCase.CROIX && 
            p.plateau[1][i].getEtat()==EtatCase.CROIX && 
            p.plateau[2][i].getEtat()==EtatCase.CROIX){
                vic=true;
            }
        }
        if((p.plateau[0][0].getEtat()==EtatCase.CROIX &&
        p.plateau[1][1].getEtat()==EtatCase.CROIX &&
        p.plateau[2][2].getEtat()==EtatCase.CROIX)||
        (p.plateau[0][2].getEtat()==EtatCase.CROIX &&
        p.plateau[1][1].getEtat()==EtatCase.CROIX &&
        p.plateau[2][0].getEtat()==EtatCase.CROIX)){
            vic=true;
        }
        return vic;
    }
    public boolean verifVictoireO(){
        boolean vic=false;
        for(int i=0;i<3;i++){
            if(p.plateau[i][0].getEtat()==EtatCase.ROND && 
            p.plateau[i][1].getEtat()==EtatCase.ROND && 
            p.plateau[i][2].getEtat()==EtatCase.ROND){
                vic=true;
            }
            if(p.plateau[0][i].getEtat()==EtatCase.ROND && 
            p.plateau[1][i].getEtat()==EtatCase.ROND && 
            p.plateau[2][i].getEtat()==EtatCase.ROND){
                vic=true;
            }
        }
        if((p.plateau[0][0].getEtat()==EtatCase.ROND &&
        p.plateau[1][1].getEtat()==EtatCase.ROND &&
        p.plateau[2][2].getEtat()==EtatCase.ROND)||
        (p.plateau[0][2].getEtat()==EtatCase.ROND &&
        p.plateau[1][1].getEtat()==EtatCase.ROND &&
        p.plateau[2][0].getEtat()==EtatCase.ROND)){
            vic=true;
        }
        return vic;
    }
    public void cocherCaseX(int x,int y){
        p.plateau[x][y].setEtat(EtatCase.CROIX);
    }
    public void cocherCaseO(int x,int y){
        p.plateau[x][y].setEtat(EtatCase.ROND);
    }
}
