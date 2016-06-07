package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
	Integer nbvoulues;
	static JComboBox NbCouleurs;
	JFrame fenetre;
	Case c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Boolean manuelb =false;
	
	/**
	 * @return le rouge
	 */
	public JSlider getRouge() {
		return Rouge;
	}


	/**
	 * @return le bleu
	 */
	public JSlider getBleu() {
		return Bleu;
	}


	/**
	 * @return le vert
	 */
	public JSlider getVert() {
		return Vert;
	}
	
	public void visibilite_true(int i,Case a,Case b) {
		if(i<=nbvoulues){
			a.setVisible(true);
			b.setVisible(true);
		}
	}
	
	public void rafraichisement_couleur() {
		nbvoulues = Integer.parseInt(Interface_graphique.NbCouleurs.getSelectedItem().toString());
		c1.setVisible(false);		c2.setVisible(false);	c3.setVisible(false);
		c4.setVisible(false);		c5.setVisible(false);	c6.setVisible(false);
		c7.setVisible(false);		c8.setVisible(false);	c9.setVisible(false);
		c10.setVisible(false);
		c11.setVisible(false);		c12.setVisible(false);	c13.setVisible(false);
		c14.setVisible(false);		c15.setVisible(false);	c16.setVisible(false);
		c17.setVisible(false);		c18.setVisible(false);	c19.setVisible(false);
		c20.setVisible(false);
		visibilite_true(1,c1,c11);		visibilite_true(2,c2,c12);
		visibilite_true(3,c3,c13);		visibilite_true(4,c4,c14);
		visibilite_true(5,c5,c15);		visibilite_true(6,c6,c16);
		visibilite_true(7,c7,c17);		visibilite_true(8,c8,c18);
		visibilite_true(9,c9,c19);		visibilite_true(10,c10,c20);
		fenetre.revalidate();
		fenetre.repaint();
	}
	public void creation_case() {
		c1 = new Case(255,0,0);		c2 = new Case(0,255,0);
		c3 = new Case(0,0,255);		c4 = new Case(125,0,0);
		c5 = new Case(0,125,0);		c6 = new Case(0,0,125);
		c7 = new Case(190,0,0);		c8 = new Case(0,190,0);
		c9 = new Case(0,0,190);		c10 = new Case(150,110,190);
		c11 = new Case(c1.getGris(),c1.getGris(),c1.getGris());
		c12 = new Case(c2.getGris(),c2.getGris(),c2.getGris());
		c13 = new Case(c3.getGris(),c3.getGris(),c3.getGris());
		c14 = new Case(c4.getGris(),c4.getGris(),c4.getGris());
		c15 = new Case(c5.getGris(),c5.getGris(),c5.getGris());
		c16 = new Case(c6.getGris(),c6.getGris(),c6.getGris());
		c17 = new Case(c7.getGris(),c7.getGris(),c7.getGris());
		c18 = new Case(c8.getGris(),c8.getGris(),c8.getGris());
		c19 = new Case(c9.getGris(),c9.getGris(),c9.getGris()); 
		c20 = new Case(c10.getGris(),c10.getGris(),c10.getGris());
	}
	public void aide_creation_case(Case a) {
		//a = new Case(r,v,b);
		a.setPreferredSize(new Dimension(110,100));
		a.setVisible(false);
	}
	public void action_de_changement(JButton b,final Case a,final Case c) {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Rouge.setValue(a.getR());
				//Vert.setValue(a.getV());
				//Bleu.setValue(a.getB());
				Rouge.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent arg0) {
						if(manuelb != true)Rouge.setValue(a.getR());
					}
				});
				Vert.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent arg0) {
						if(manuelb != true)Vert.setValue(a.getV());
					}
				});
				Bleu.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent arg0) {
						if(manuelb != true)Bleu.setValue(a.getB());
					}
				});
				a.setCase(Rouge.getValue(), Vert.getValue(), Bleu.getValue());
				Case d = new Case(Rouge.getValue(), Vert.getValue(), Bleu.getValue());
				c.setCase(d.getGris(), d.getGris(), d.getGris());
				fenetre.revalidate();
				fenetre.repaint();
			}
		});
	}
	public Interface_graphique() {	
		JLabel label1;
		JLabel slider1;
		JLabel slider2;
		JLabel slider3;
		ArrayList<JMenuItem> item = new ArrayList<>();
		String[] chiffre = new String[]{"10","9","8","7","6","5","4","3","2","1"};
		JMenuItem ouvrir = new JMenuItem("Nouveau");
		ouvrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nbvoulues = 0;
				rafraichisement_couleur();
			}
		});
		JMenuItem fermer = new JMenuItem("Fermer");
		fermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fenetre.dispose();	
			}
		});
		JMenuItem aproposde = new JMenuItem("A propos de");
		fermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
			        public void run() {
			        	JFrame fenetre2 = new JFrame("JFrame");
			 		    fenetre2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 		    fenetre2.setPreferredSize(new Dimension(400,100));
			 		    fenetre2.setLocation(250,250);
			 		    fenetre2.pack();
			 		    fenetre2.add(new JLabel("------Version 2016------"));
			 		    fenetre2.add(new JLabel("------Version 2016------ Par Frederic et Robin "));
			 		    fenetre2.setVisible(true);
			 		    fenetre2.setLocation(250,250);
			        }
			    });
			}
		});
		NbCouleurs = new JComboBox(chiffre);
		fenetre = new JFrame("Projet IHM");
		JMenuBar menu;
		label1 = new JLabel("Nb de couleur voulues");
		GridLayout cases = new GridLayout(2,10);
		
		creation_case();
		aide_creation_case(c1);		aide_creation_case(c2);
		aide_creation_case(c3);		aide_creation_case(c4);
		aide_creation_case(c5);		aide_creation_case(c6);
		aide_creation_case(c7);		aide_creation_case(c8);
		aide_creation_case(c9);		aide_creation_case(c10);
		aide_creation_case(c11);	aide_creation_case(c12);
		aide_creation_case(c13);	aide_creation_case(c14);
		aide_creation_case(c15);	aide_creation_case(c16);
		aide_creation_case(c17);	aide_creation_case(c18);
		aide_creation_case(c19);	aide_creation_case(c20);
		nbvoulues = Integer.parseInt(Interface_graphique.NbCouleurs.getSelectedItem().toString());
		NbCouleurs.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) 
			   { 
				rafraichisement_couleur();
			 } 
		});
		
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
		Aide.add(aproposde);
		menu.add(Fichier);
		menu.add(Aide);
		fenetre.setLayout(new BorderLayout());
		
		b1 = new JButton("Couleur 1");
		b1.setPreferredSize(new Dimension(100,50));
		b2 = new JButton("Couleur 2");
		b2.setPreferredSize(new Dimension(100,50));
		b3 = new JButton("Couleur 3");
		b3.setPreferredSize(new Dimension(100,50));
		b4 = new JButton("Couleur 4");
		b4.setPreferredSize(new Dimension(100,50));
		b5 = new JButton("Couleur 5");
		b5.setPreferredSize(new Dimension(100,50));
		b6 = new JButton("Couleur 6");
		b6.setPreferredSize(new Dimension(100,50));
		b7 = new JButton("Couleur 7");
		b7.setPreferredSize(new Dimension(100,50));
		b8 = new JButton("Couleur 8");
		b8.setPreferredSize(new Dimension(100,50));
		b9 = new JButton("Couleur 9");
		b9.setPreferredSize(new Dimension(100,50));
		b10 = new JButton("Couleur 10");
		b10.setPreferredSize(new Dimension(100,50));
		
		JButton Automatique1 = new JButton("Automatique");
		Automatique1.setPreferredSize(new Dimension(125,75));
		Automatique1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rafraichisement_couleur();
				if(manuelb == true) {
					manuelb = false;
				}
			}
		});
		JButton Manuel1 = new JButton("Manuel");
		Manuel1.setPreferredSize(new Dimension(125,75));
		Manuel1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manuelb = true;
				if(manuelb == true) {
					System.out.println("ok");
				}
				rafraichisement_couleur();
			}
		});
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
		
		action_de_changement(b1,c1,c11);
		action_de_changement(b2,c2,c12);
		action_de_changement(b3,c3,c13);
		action_de_changement(b4,c4,c14);
		action_de_changement(b5,c5,c15);
		action_de_changement(b6,c6,c16);
		action_de_changement(b7,c7,c17);
		action_de_changement(b8,c8,c18);
		action_de_changement(b9,c9,c19);
		action_de_changement(b10,c10,c20);
		
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
				
		
		pane3.setLayout(cases);
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
		
		c1.add(b1);
		c2.add(b2);
		c3.add(b3);
		c4.add(b4);
		c5.add(b5);
		c6.add(b6);
		c7.add(b7);
		c8.add(b8);
		c9.add(b9);
		c10.add(b10);
		
		c11.setAlignmentX(10);
		c11.setAlignmentY(50);
		
		
		fenetre.add(menu,BorderLayout.NORTH);
		fenetre.add(pane1,BorderLayout.WEST);
		fenetre.add(pane2,BorderLayout.CENTER);
		fenetre.add(pane4,BorderLayout.EAST);
		fenetre.add(pane3,BorderLayout.SOUTH);
		
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setPreferredSize(new Dimension(1250,900));
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
	public void mouseClicked(MouseEvent e) {
		Case c = new Case(Rouge.getValue(),Bleu.getValue(),Vert.getValue());  
		
	}
}
