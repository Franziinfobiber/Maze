package de.gymnasium_kirchheim.maze.view.menu;

public class MainMenu {
    // TODO: Franzi Hauptmenü
}


import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random; 

public class Home extends JFrame{
    
    private JButton knopf = new JButton("LEVELS");
    
    public Home() {       
        
        JPanel testPanel = new JPanel();        
        testPanel.setPreferredSize(new Dimension(800, 600));
        
        createMenu();
                
        add(testPanel);
        testPanel.add(knopf);
        
        knopf.setLocation(250, 400);
        knopf.resize(100,200);
        
        pack();
        
        setTitle("Maze");
        setLocation(10, 10);
        setResizable(false);
        
        setVisible(true);
        
        

    }
    
    
    private void createMenu() {
        
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        JMenu fileMenu = new JMenu("Beenden");
        
        menuBar.add(fileMenu);        
        addFileMenuItems(fileMenu);
    }
    
    private void addFileMenuItems(JMenu fileMenu) {
        
        JMenuItem quitItem = new JMenuItem("Schließen");
        fileMenu.add(quitItem);
        quitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }); 
    }
    

    
    
    
    

    
    
}
