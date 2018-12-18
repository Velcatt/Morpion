/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.ArrayList;
/**
 *
 * @author rousstan
 */
public class VueJeu extends Observable {
    
    private final JFrame window ;
    private final int nbjoueurs;
    private JButton moins12 ;
    private JButton plus12 ;
    private JLabel nombrejoueurs;
    private JLabel v1;
    private JComboBox cbox;
    private final JButton boutons[][]= new JButton[3][3];
    
    /**
     *
     */
    public VueJeu() {
        
        nbjoueurs =0;
       
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        
        window.setSize(500, 500);
        Dimension dim;
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
        
        JPanel panel = new JPanel(new BorderLayout());
        window.add(panel) ;
        
        JPanel panelhaut;
        panelhaut = new JPanel(new GridLayout(1,2));
        panel.add(panelhaut, BorderLayout.NORTH) ;
        
        JPanel panelcentre = new JPanel(new GridLayout(3, 3));
        panel.add(panelcentre, BorderLayout.CENTER) ;
        
        JPanel panelbas = new JPanel(new GridLayout(1, 3));
        panel.add(panelbas, BorderLayout.SOUTH) ;
        
        JLabel label = new JLabel("Tournoi de Morpion");
        panelhaut.add(label);
        
        JLabel label1 = new JLabel(" ");
        panelhaut.add(label1);
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                boutons[i][j]=new JButton();
                panelcentre.add(boutons[i][j]);
            }
        }
        
        
        
                    
    }
    
    public void afficher(){
        this.window.setVisible(true);
    }
}
