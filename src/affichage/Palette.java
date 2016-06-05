package affichage;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Palette extends JPanel {

	private static final long serialVersionUID = 3150055622519569208L;
	private Cellule[][] tab;
	private int[][] tabGris;
	private int min = 255, max = 0;

	public Palette() {
		this.setLayout(new GridLayout(8, 20));
		this.tab = new Cellule[8][20];
		this.tabGris = new int[8][20];
		ligneRouge();
		ligneMarron();
		ligneOrange();
		ligneJaune();
		ligneBleu();
		ligneBleuC();
		ligneVert();
		ligneViolet();
		creationPallette();
		initialiseGris();
	}

	public void ligneRouge() {
		int r = 16, v = 3, b = 2;
		for (int i = 0; i < 20; i++) {
			tab[0][i] = new Cellule(r, v, b);
			v = v + 1;
			r = (int) (v * 11.6);
			if (i % 9 == 0) {
				b = b + 1;
			}
		}
	}

	public void ligneMarron() {
		int r = 55, v = 25, b = 4;
		for (int i = 0; i < 20; i++) {
			tab[1][i] = new Cellule(r, v, b);
			v = v + 2;
			r = (int) (v * 2.65);
			b = b + 1;

		}
	}

	public void ligneOrange() {
		int r = 55, v = 35, b = 5;
		for (int i = 0; i < 20; i++) {
			tab[2][i] = new Cellule(r, v, b);
			v = v + 6;
			r = (int) (v * 1.57);
			if (i % 3 == 0) {
				b = b + 1;
			}
		}
	}

	public void ligneJaune() {
		int r = 60, v = 60, b = 6;
		for (int i = 0; i < 20; i++) {
			tab[3][i] = new Cellule(r, v, b);
			v = v + 10;
			r = r + 10;
			b = b + 1;

		}
	}

	public void ligneVert() {
		int r = 11, v = 66, b = 5;
		for (int i = 0; i < 20; i++) {
			tab[4][i] = new Cellule(r, v, b);
			r = r + 6;
			v = v + 9;
			if (i % 2 == 0) {
				b = b + 1;
			}
		}
	}

	public void ligneBleuC() {
		int r = 3, v = 65, b = 56;
		for (int i = 0; i < 20; i++) {
			tab[5][i] = new Cellule(r, v, b);
			if (i % 3 == 0) {
				r = r + 1;
			}
			v = v + 9;
			b = b + 8;

		}
	}

	public void ligneBleu() {
		int r = 9, v = 12, b = 63;
		for (int i = 0; i < 20; i++) {
			tab[6][i] = new Cellule(r, v, b);
			r = r + 4;
			if (i % 2 == 0) {
				r = r + 1;
			}

			v = v + 4;
			b = b + 10;

		}
	}

	public void ligneViolet() {
		int r = 50, v = 11, b = 70;
		for (int i = 0; i < 20; i++) {
			tab[7][i] = new Cellule(r, v, b);
			r = r + 8;
			v = v + 2;
			b = b + 9;

		}
	}

	private void creationPallette() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 20; j++) {
				this.add(tab[i][j]);
			}
		}
	}

	private void initialiseGris() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 20; j++) {
				tabGris[i][j] = tab[i][j].getGris();
				if (min > tabGris[i][j]) {
					min = tabGris[i][j];
				}
				if (max < tabGris[i][j]) {
					max = tabGris[i][j];
				}
			}
		}
	}
}