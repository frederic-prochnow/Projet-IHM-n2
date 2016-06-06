package affichage;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Couleurchoisie extends JPanel {

	private static final long serialVersionUID = -5671772493122448032L;
	private Color couleur, gris;
	private JTextField hexa;
	private JLabel text;
	private int index;

	public Couleurchoisie(int i) {
		text = new JLabel("Couleur " + (i + 1));

		this.couleur = Color.white;
		this.gris = Color.white;
		this.hexa = new JTextField();
		this.index=i;
		
		this.setLayout(null);
		this.add(text);
		text.setBounds(30, 4, 70, 20);
		if(i==0){
			text.setForeground(Color.blue);
		}
		text.setFont(new Font("Monospaced", Font.BOLD, 12));

		this.add(hexa);
		hexa.setBounds(110, 4, 60, 20);
		hexa.setEditable(false);
	}

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.black);
		g.drawRect(7, 4, 19, 19);
		g.drawRect(this.getWidth() - 30, 4, 19, 19);
		g.setColor(couleur);
		g.fillRect(8, 5, 18, 18);
		g.setColor(gris);
		g.fillRect(this.getWidth() - 29, 5, 18, 18);
	}
	
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	public void setGris(Color gris) {
		this.gris = gris;
	}

	public JTextField getHexa() {
		return hexa;
	}

	public JLabel getText() {
		return text;
	}

}