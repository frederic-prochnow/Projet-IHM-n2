package affichage;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interface_graphique {

	public Interface_graphique() {
		JFrame fenetre = new JFrame("Logiciel");
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setPreferredSize(new Dimension(500,500));
	    fenetre.setLocation(250,250);
	    fenetre.setResizable(true);
	    fenetre.pack();
	    fenetre.add(new JLabel("Interface a réaliser"));
	    fenetre.setVisible(true);
	}

}
