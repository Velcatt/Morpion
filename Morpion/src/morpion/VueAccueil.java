/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

/**
 *
 * @author rousstan
 * 
 * 
 * 
 */

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


public class VueAccueil extends Observable  {
    
    
    private final JFrame window ;
    private final int nbjoueurs;
    private JButton moins12 ;
    private JButton plus12 ;
    private JLabel nombrejoueurs;
    private JLabel v1;
    private JComboBox cbox;
    private final JButton btnValider ;
    
    
    /**
     *
     */
    public VueAccueil(){
        
        nbjoueurs =0;
       
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        
        window.setSize(500, 120);
        Dimension dim;
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
        
        JPanel panel = new JPanel(new BorderLayout());
        window.add(panel) ;
        
        JPanel panelhaut = new JPanel(new BorderLayout());
        panel.add(panelhaut, BorderLayout.NORTH) ;
        
        JPanel panelcentre = new JPanel(new GridLayout(1, 1));
        panel.add(panelcentre, BorderLayout.CENTER) ;
        
        JPanel panelbas = new JPanel(new GridLayout(1, 3));
        panel.add(panelbas, BorderLayout.SOUTH) ;
        
        JLabel label = new JLabel("Tournoi de Morpion");
        panelhaut.add(label);
        
        JTable table;
        table = new JTable();
        
        
        
        
        btnValider = new JButton("Lancer une partie");
        btnValider.addActionListener((ActionEvent e) -> {
            setChanged();
            notifyObservers(new Message());
            clearChanged();
        });
        panelbas.add(btnValider);

        panelbas.add(new JLabel(""));

        
        
        
    }
    
}
