package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Paint;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javafx.geometry.HorizontalDirection;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.sun.corba.se.impl.orb.NormalDataCollector;

public class Interface_graphique implements MouseListener{

	public Interface_graphique() {	
		ArrayList<JMenuItem> item = new ArrayList<>();
		String[] chiffre = new String[]{"1","2","3","4","5","6","7","8","9","10"};
		String[] fichier = new String[]{"ouvrir","enregistrer"};
		JComboBox NbCouleurs = new JComboBox(chiffre);
		JFrame fenetre = new JFrame("Projet IHM");
		JMenuBar menu;
		int x = fenetre.getHeight();
		int y = fenetre.getWidth();
		JPanel pane1;
		JPanel pane2;
		JPanel pane3;
		JMenu Fichier = new JMenu("Fichier");
		JMenu Aide = new JMenu("Aide");
		JMenu nbcouleur = new JMenu("NbCouleur voulu :");
		//NbCouleurs.add(a);
		pane1 = new JPanel();
		pane2 = new JPanel();
		pane3 = new JPanel();
		menu = new JMenuBar();
		nbcouleur.add(NbCouleurs);
		menu.add(Fichier);
		menu.add(Aide);
		menu.add(nbcouleur);
		fenetre.setLayout(new BorderLayout());

		JButton Automatique1 = new JButton("Automatique");
		Automatique1.setPreferredSize(new Dimension(125,75));
		JButton Manuel1 = new JButton("Manuel");
		Manuel1.setPreferredSize(new Dimension(125,75));
						
		JSlider Rouge = new JSlider(SwingConstants.HORIZONTAL,0,255,100);
		JSlider Bleu = new JSlider(SwingConstants.HORIZONTAL,0,255,125);
		JSlider Vert = new JSlider(SwingConstants.HORIZONTAL,0,255,150);
		
		pane1.setPreferredSize(new Dimension(x/2,y/3));
		pane1.add(Automatique1);
		pane1.add(Manuel1);
				
		
		pane2.add(Rouge);
		pane2.add(Bleu);
		pane2.add(Vert);
		
		fenetre.add(menu,BorderLayout.NORTH);
		fenetre.add(pane1,BorderLayout.CENTER);
		fenetre.add(pane2,BorderLayout.EAST);
		fenetre.add(pane3,BorderLayout.SOUTH);
		
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setPreferredSize(new Dimension(1000,1000));
		fenetre.setLocation(250,250);
		fenetre.setResizable(true);
		fenetre.pack();
		fenetre.setVisible(true);

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




}
