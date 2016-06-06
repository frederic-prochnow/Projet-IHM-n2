package affichage;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Case extends JPanel {
	
	/**
	 * @return le r
	 */
	public int getR() {
		return r;
	}

	/**
	 * @param r le r à définir
	 */
	public void setR(int r) {
		this.r = r;
	}

	/**
	 * @return le v
	 */
	public int getV() {
		return v;
	}

	/**
	 * @param v le v à définir
	 */
	public void setV(int v) {
		this.v = v;
	}

	/**
	 * @return le b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b le b à définir
	 */
	public void setB(int b) {
		this.b = b;
	}

	public static int cel;

	private static final long serialVersionUID = -7407558281977901559L;
	private int r, v, b;
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

	
	/**
	 * Constructeur
	 * 
	 * @param r
	 * @param v
	 * @param b
	 * @param hexa
	 */
	public Case(int r, int v, int b) {
		this.r = r;
		this.v = v;
		this.b = b;
		this.gris = (int) (0.3 * r + 0.59 * v + 0.11 * b);
	}
	
	public void setCase(int r,int v,int b) {
		this.r = r;
		this.v = v;
		this.b = b;
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