package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class Interface_graphique implements MouseListener {
	final JSlider Rouge = new JSlider(SwingConstants.HORIZONTAL,0,255,100);
	final JSlider Bleu = new JSlider(SwingConstants.HORIZONTAL,0,255,125);
	final JSlider Vert = new JSlider(SwingConstants.HORIZONTAL,0,255,150);

	public Interface_graphique() {	
		JLabel label1;
		JLabel slider1;
		JLabel slider2;
		JLabel slider3;
		ArrayList<JMenuItem> item = new ArrayList<>();
		String[] chiffre = new String[]{"1","2","3","4","5","6","7","8","9","10"};
		JMenuItem ouvrir = new JMenuItem("ouvrir");
		JMenuItem fermer = new JMenuItem("fermer");
		JComboBox NbCouleurs = new JComboBox(chiffre);
		JFrame fenetre = new JFrame("Projet IHM");
		JMenuBar menu;
		label1 = new JLabel("Nb de couleur voulues");
		
		Case c1 = new Case(255,0,0);
		Case c2 = new Case(0,255,0);
		Case c3 = new Case(0,0,255);
		Case c4 = new Case(125,0,0);
		Case c5 = new Case(0,125,0);
		Case c6 = new Case(0,0,125);
		Case c7 = new Case(190,0,0);
		Case c8 = new Case(0,190,0);
		Case c9 = new Case(0,0,190);
		Case c10 = new Case(150,110,190);
		Case c11 = new Case();
		Case c12 = new Case();
		Case c13 = new Case();
		Case c14 = new Case();
		Case c15 = new Case();
		Case c16 = new Case();
		Case c17 = new Case();
		Case c18 = new Case();
		Case c19 = new Case();
		Case c20 = new Case();
		
		JPanel pane1;
		JPanel pane2;
		JPanel pane3;
		JPanel pane4;
		
		JMenu Fichier = new JMenu("Fichier");
		JMenu Aide = new JMenu("Aide");
		pane1 = new JPanel();
		pane2 = new JPanel();
		pane3 = new JPanel();
		pane4 = new JPanel();
		menu = new JMenuBar();
		
		Fichier.add(ouvrir);
		Fichier.add(fermer);
		menu.add(Fichier);
		menu.add(Aide);
		fenetre.setLayout(new BorderLayout());

		JButton Automatique1 = new JButton("Automatique");
		Automatique1.setPreferredSize(new Dimension(125,75));
		JButton Manuel1 = new JButton("Manuel");
		Manuel1.setPreferredSize(new Dimension(125,75));
		NbCouleurs.addActionListener(new ActionListener());
		Automatique1.addActionListener(new ActionListener());
		Manuel1.addActionListener(new ActionListener());
		
		final JLabel labelRouge = new JLabel("" + Rouge.getValue());
		final JLabel labelBleu = new JLabel("" + Bleu.getValue());
		final JLabel labelVert = new JLabel("" + Vert.getValue() +"");
		slider1 = new JLabel("Rouge :" );
		slider2 = new JLabel("Bleu :" );
		slider3 = new JLabel("Vert :" );
		
		Rouge.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				labelRouge.setText("" + Rouge.getValue());
			}
		});
		
		Vert.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				labelVert.setText("" + Vert.getValue());
			}
		});
		
		Bleu.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				labelBleu.setText("" + Bleu.getValue());
			}
		});
		
		
		pane1.setPreferredSize(new Dimension(500,300));
		pane2.setPreferredSize(new Dimension(400,300));
		pane3.setPreferredSize(new Dimension(1250,700));
		pane4.setPreferredSize(new Dimension(200,150));
		
		
		pane1.setAlignmentX(0);
		pane1.setAlignmentY(0);
		pane1.add(label1,BorderLayout.WEST);
		pane1.add(NbCouleurs);
		pane1.add(Automatique1);
		pane1.add(Manuel1);
		
		pane2.setAlignmentX(500);
		pane2.setAlignmentY(0);
		pane2.setLayout(new BoxLayout(pane2,BoxLayout.Y_AXIS));
		pane2.add(Box.createVerticalStrut(20));
		pane2.add(Rouge);
		pane2.add(Bleu);
		pane2.add(Vert);
		
		pane4.setAlignmentX(1000);
		pane4.setAlignmentY(0);
		pane4.add(slider1);pane4.add(labelRouge);
		pane4.add(slider2);pane4.add(labelBleu);
		pane4.add(slider3);pane4.add(labelVert);
				
		pane3.add(c1);
		pane3.add(c2);
		pane3.add(c3);
		pane3.add(c4);
		pane3.add(c5);
		pane3.add(c6);
		pane3.add(c7);
		pane3.add(c8);
		pane3.add(c9);
		pane3.add(c10);
		
		pane3.add(c11);
		pane3.add(c12);
		pane3.add(c13);
		pane3.add(c14);
		pane3.add(c15);
		pane3.add(c16);
		pane3.add(c17);
		pane3.add(c18);
		pane3.add(c19);
		pane3.add(c20);
		
		c11.setAlignmentX(10);
		c11.setAlignmentY(50);
		
		
		fenetre.add(menu,BorderLayout.NORTH);
		fenetre.add(pane1,BorderLayout.WEST);
		fenetre.add(pane2,BorderLayout.CENTER);
		fenetre.add(pane4,BorderLayout.EAST);
		fenetre.add(pane3,BorderLayout.SOUTH);
		
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setPreferredSize(new Dimension(1250,1000));
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
