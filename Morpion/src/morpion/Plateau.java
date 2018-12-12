/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;
import java.util.ArrayList;

/**
 *
 * @author lacranto
 */
public class Plateau {
    //attributs
    CaseJeu plateau[][] = new CaseJeu[3][3];
    //constructeurs
    Plateau(){
        for(int x=0;x>3;x++){
            for(int y=0;y<3;y++){
                plateau[x][y] = new CaseJeu(x,y);
            }
        }
    }
    //méthodes
}
