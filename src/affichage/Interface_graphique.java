package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
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

import javafx.geometry.HorizontalDirection;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.sun.corba.se.impl.orb.NormalDataCollector;

public class Interface_graphique implements MouseListener{

	public Interface_graphique() {	
		Action label;
		JFrame fenetre = new JFrame("Projet IHM");
		JButton Automatique = new JButton("Automatique");
		JButton Manuel = new JButton("Manuel");	
		GridLayout casebouton = new GridLayout(2,6);
		fenetre.setLayout(casebouton);

		JPanel Automatique1 = new JPanel();
		Automatique1.setPreferredSize(new Dimension(60, 40));  
		
		JPanel un = new JPanel();
		un.setPreferredSize(new Dimension(60, 40));
		
		JPanel deux = new JPanel();
		deux.setPreferredSize(new Dimension(60, 40));
		
		JPanel trois = new JPanel();
		trois.setPreferredSize(new Dimension(60, 40));
		
		JPanel quatre = new JPanel();
		quatre.setPreferredSize(new Dimension(60, 40));
		
		JPanel cinq = new JPanel();
		cinq.setPreferredSize(new Dimension(60, 40));
		
		JPanel Manuel1 = new JPanel();
		Manuel1.setPreferredSize(new Dimension(60, 40));
		
		JPanel six = new JPanel();
		six.setPreferredSize(new Dimension(60, 40));
		
		JPanel sept = new JPanel();
		sept.setPreferredSize(new Dimension(60, 40));
		
		JPanel huit = new JPanel();
		huit.setPreferredSize(new Dimension(60, 40));
		
		JPanel neuf = new JPanel();
		neuf.setPreferredSize(new Dimension(60, 40));
		
		JPanel dix = new JPanel();
		dix.setPreferredSize(new Dimension(60, 40));

		JPanel content = new JPanel();
	    content.setPreferredSize(new Dimension(300, 120));
	    content.setBackground(Color.WHITE);
	    
	    content.setLayout(new GridBagLayout());
	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.gridx = 0;
	    gbc.gridy = 0;
		
		JSlider Rouge = new JSlider(SwingConstants.HORIZONTAL,0,255,100);
		JSlider Bleu = new JSlider(SwingConstants.HORIZONTAL,0,255,125);
		JSlider Vert = new JSlider(SwingConstants.HORIZONTAL,0,255,150);

		fenetre.add(Automatique1, BorderLayout.NORTH);
		fenetre.add(un,BorderLayout.NORTH);
		fenetre.add(deux,BorderLayout.NORTH);
		fenetre.add(trois, BorderLayout.NORTH);
		fenetre.add(quatre, BorderLayout.NORTH);
		fenetre.add(cinq, BorderLayout.NORTH);
		fenetre.add(Manuel1,BorderLayout.NORTH);
		fenetre.add(six);
		fenetre.add(sept);
		fenetre.add(huit);
		fenetre.add(neuf);
		fenetre.add(dix);

		fenetre.add(Rouge, BorderLayout.EAST);
		fenetre.add(Bleu, BorderLayout.EAST);
		fenetre.add(Vert, BorderLayout.EAST);

		/*public void paint (Graphics g){	
			int[] abcisse = new int[]{245,275,470,500};
			int[] ordonnée = new int[]{410,475,475,410};

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);

			g.setColor(new Color(Rouge.getValue(),Vert.getValue(),Bleu.getValue()));
			g.drawRect(50, 50, 50, 50);
		}*/


		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setPreferredSize(new Dimension(500,500));
		fenetre.setLocation(250,250);
		fenetre.setResizable(true);
		fenetre.pack();
		fenetre.setVisible(true);

	}


	public void mouseClicked(MouseEvent e) {
		int clic = e.getButton();
		if (clic == MouseEvent.BUTTON1){
			if(un.buttonPressed()){

			}
		}
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




}
