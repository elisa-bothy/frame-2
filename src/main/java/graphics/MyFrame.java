/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Elisa Bothy
 */
public class MyFrame extends JFrame {
    Box vbox;
    JButton jb1;
    JButton jb2;
    JButton jb3;
    JButton jb4;
    JButton jb5;
    JButton jb6;
    JPanel north;

    private static final long serialVersionUID = 1L;
    public MyFrame(){
        //créer l'objet fenêtre
        super("Ma fenêtre");
        vbox = Box.createVerticalBox();
        ImageIcon catIcon = new ImageIcon("cat.gif");

        //ajouter des boutons
        jb1 = new JButton(catIcon);
        jb2 = new JButton("2");
        jb3 = new JButton("3");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        jb6 = new JButton("6");
        north =new JPanel();//par défaut avec un FlowLayout
        initGui();
                
        //laisser la fenêtre s'autodimentionner par rapport au contenu
        this.pack();
        //centrer fenêtre
        this.setLocationRelativeTo(null);
        
        //fermer la fenêtre quand on ferme avec la croix
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    private void initGui() {
        north.setBackground(Color.red);
        north.setOpaque(true);
        north.add(jb1);
        north.add(jb6);
        
        this.getContentPane().add(vbox);
        vbox.add(north);
        vbox.add(jb2);
        vbox.add(jb3);
        vbox.add(jb4);
        vbox.add(jb5);    }
}
