package affichage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Case extends JPanel {
	
	public static int cel;

	private static final long serialVersionUID = -7407558281977901559L;
	private int r, v, b;
	private String hexa = "r";
	private int gris;
	private boolean visible;

	public int getGris() {
		return this.gris;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Case() {
		super();
		this.visible = true;
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Fenetre.listeCouleur.get(Fenetre.indexCourant).getHexa()
						.setText(hexa);
				Fenetre.listeCouleur.get(Fenetre.indexCourant).setCouleur(
						new Color(r, v, b));
				Fenetre.listeCouleur.get(Fenetre.indexCourant).setGris(
						new Color(gris, gris, gris));
				Fenetre.listeCouleur.get(Fenetre.indexCourant).repaint();
				Fenetre.codeR.setText("R = " + r);
				Fenetre.codeRValue.setValue(r);
				Fenetre.codeV.setText("V = " + v);
				Fenetre.codeVValue.setValue(v);
				Fenetre.codeB.setText("B = " + b);
				Fenetre.codeBValue.setValue(b);
			}
		});
	}

	/**
	 * Constructeur
	 * 
	 * @param r
	 * @param v
	 * @param b
	 * @param hexa
	 */
	public Case(int r, int v, int b) {
		this();
		this.r = r;
		this.v = v;
		this.b = b;
		this.hexa = Convert(r, v, b);
		this.gris = (int) (0.3 * r + 0.59 * v + 0.11 * b);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		if (visible) {
			g.setColor(new Color(r, v, b));
			g.fillRect(1, 1, 120, 300);
			g.setColor(Color.black);
			g.drawRect(0, 0, 120 + 1, 300 + 1);
		}
	}

	private String Convert(int r, int v, int b) {
		Color color = new Color(r, v, b);
		String hex = Integer.toHexString(color.getRGB() & 0xffffff);
		if (hex.length() < 6) {
			hex = "0" + hex;
		}
		return "#" + hex;
	}
}