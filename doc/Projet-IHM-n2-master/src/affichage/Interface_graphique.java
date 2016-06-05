package affichage;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Interface_graphique {

	public Interface_graphique() {
		JFrame fenetre = new JFrame("Logiciel");
		JButton Automatique = new JButton("Automatique");
		JButton Manuel = new JButton("Manuel");
				
		JButton un = new JButton("1");
		JButton deux = new JButton("2");
		JButton trois = new JButton("3");
		JButton quatre = new JButton("4");
		JButton cinq = new JButton("5");
		JButton six = new JButton("6");
		JButton sept = new JButton("7");
		JButton huit = new JButton("8");
		JButton neuf = new JButton("9");
		JButton dix = new JButton("10");
				
		final JSlider Rouge = new JSlider(255);
		final JSlider Vert = new JSlider(255);
		final JSlider Bleu = new JSlider(255);
		
		
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setPreferredSize(new Dimension(500,500));
	    fenetre.setLocation(250,250);
	    fenetre.setResizable(true);
	    fenetre.pack();
	    fenetre.add(new JLabel("Interface a r�aliser"));
	    fenetre.setVisible(true);
	    
	    fenetre.add(Automatique);
	    fenetre.add(Manuel);
	    
	    fenetre.add(un);
	    fenetre.add(deux);
	    fenetre.add(trois);
	    fenetre.add(quatre);
	    fenetre.add(cinq);
	    fenetre.add(six);
	    fenetre.add(sept);
	    fenetre.add(huit);
	    fenetre.add(neuf);
	    fenetre.add(dix);
	    
	    fenetre.add(Rouge);
	    fenetre.add(Vert);
	    fenetre.add(Bleu);
	    
	    Rouge.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				label.setLabel("" + Rouge.getValue());
			}
		});
	}

}
