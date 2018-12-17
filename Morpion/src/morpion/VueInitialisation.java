package morpion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rousstan
 */
        
        

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class VueInitialisation extends Observable {
    private JFrame window ;
    private int nbjoueurs;
    private JButton moins12 ;
    private JButton plus12 ;
    private JLabel nombrejoueurs;
    private JLabel v1;
    private JComboBox cbox;
    private final JButton btnValider ;
    private final JButton btnAnnuler ;
    
    
    public VueInitialisation() {
        
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
        
        JLabel label = new JLabel("Bienvenue dans notre tournoi de morpion! Veuillez choisir le nombre de joueurs:");
        panelhaut.add(label);
        
        String [] items = {"2","3","4","5","6","7","8","9","10"};
        
        cbox = new JComboBox(items);
        panelcentre.add(cbox);
        
        
        btnValider = new JButton("Valider");
        btnValider.addActionListener((ActionEvent e) -> {
            setChanged();
            notifyObservers(new MessageInit(Actions.VALIDER,Integer.valueOf(cbox.getSelectedItem().toString())));
            clearChanged();
        });
        panelbas.add(btnValider);

        panelbas.add(new JLabel(""));

        btnAnnuler = new JButton("Annuler");
        btnAnnuler.addActionListener((ActionEvent e) -> {
            setChanged();
            notifyObservers(new MessageInit(Actions.ANNULER,0));
            clearChanged();
        });
        panelbas.add(btnAnnuler);
        
        
    }

    /**
     *
     */
    public void afficher(){
        this.window.setVisible(true);
    }
}
