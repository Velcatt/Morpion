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
    private final JButton case11;
    private final JButton case12;
    private final JButton case13;
    private final JButton case21;
    private final JButton case22;
    private final JButton case23;
    private final JButton case31;
    private final JButton case32;
    private final JButton case33;
    
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
        
        
        
        case11 = new JButton(" ");
        case12 = new JButton(" ");
        case13 = new JButton(" ");
        case21 = new JButton(" ");
        case22 = new JButton(" ");
        case23 = new JButton(" ");
        case31 = new JButton(" ");
        case32 = new JButton(" ");
        case33 = new JButton(" ");
        
        panelcentre.add(case11);
        panelcentre.add(case12);
        panelcentre.add(case13);
        panelcentre.add(case21);
        panelcentre.add(case22);
        panelcentre.add(case23);
        panelcentre.add(case31);
        panelcentre.add(case32);
        panelcentre.add(case33);              
    }
    
    public void afficher(){
        this.window.setVisible(true);
    }
}
