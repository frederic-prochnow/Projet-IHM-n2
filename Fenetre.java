package affichage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Fenetre {
	// ensemble de panel d'embelissement
	private JPanel bordureDroit = new JPanel();
	private JPanel bordureBas = new JPanel(), bordureGauche = new JPanel();
	private JPanel droit = new JPanel();
	// ensemble de panel d'organisation
	private JPanel codeRvb = new JPanel(), contentDroit = new JPanel();
	private JPanel tier2 = new JPanel(), tier3 = new JPanel();
	private JSpinner choix = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
	// ensemble des composants variable
	public static JLabel codeR = new JLabel("R = 0");
	public static JLabel codeV = new JLabel("V = 0");
	public static JLabel codeB = new JLabel("B = 0");
	public static JSlider codeRValue = new JSlider(0, 255);
	public static JSlider codeVValue = new JSlider(0, 255);
	public static JSlider codeBValue = new JSlider(0, 255);
	public static ArrayList<Couleurchoisie> listeCouleur = new ArrayList<>();
	public static int indexCourant;

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Fenetre();
			}
		});
	}

	public Fenetre() {
		initialiseList();
		JFrame f = new JFrame("Design-Color");

		bordureBas.setPreferredSize(new Dimension(600, 5));
		bordureGauche.setPreferredSize(new Dimension(5, 400));
		bordureDroit.setPreferredSize(new Dimension(5, 400));

		droit.setPreferredSize(new Dimension(210, 500));
		droit.setLayout(new BorderLayout());
		droit.add(bordureDroit, BorderLayout.EAST);
		droit.add(contentDroit);
		droit.setBackground(Color.gray);

		contentDroit.setLayout(new GridLayout(3, 1));
		contentDroit.add(codeRvb);
		contentDroit.add(tier2);
		contentDroit.add(tier3);

		codeRvb.setBorder(BorderFactory.createTitledBorder("Reglages RVB"));
		codeRvb.setLayout(new GridLayout(3, 2));
		codeRvb.add(codeR);
		codeRvb.add(codeRValue);
		codeRvb.add(codeV);
		codeRvb.add(codeVValue);
		codeRvb.add(codeB);
		codeRvb.add(codeBValue);
		codeR.setHorizontalAlignment(SwingConstants.CENTER);
		codeV.setHorizontalAlignment(SwingConstants.CENTER);
		codeB.setHorizontalAlignment(SwingConstants.CENTER);
		codeRValue.setValue(0);
		codeRValue.setEnabled(false);
		codeVValue.setValue(0);
		codeVValue.setEnabled(false);
		codeBValue.setValue(0);
		codeBValue.setEnabled(false);

		tier2.setLayout(new GridLayout(5, 1));
		for (int i = 0; i < 5; i++) {
			tier2.add(listeCouleur.get(i));
		}

		tier3.setLayout(new GridLayout(5, 1));
		for (int i = 5; i < 10; i++) {
			tier3.add(listeCouleur.get(i));
		}

		JMenuBar menuBar = new JMenuBar();
		JLabel aleAtoire = new JLabel("  Random");
		aleAtoire.setMaximumSize(new Dimension(80, 30));
		choix.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				modifieAffichage((int) choix.getValue());
			}
		});
		modifieAffichage(1);
		choix.setMaximumSize(new Dimension(50, 40));
		menuBar.add(aleAtoire);
		menuBar.add(new JLabel("Nombre de couleur  "));
		menuBar.add(choix, BorderLayout.SOUTH);

		f.setPreferredSize(new Dimension(650, 400));
		f.getContentPane().add(new Palette(), BorderLayout.CENTER);
		f.getContentPane().add(droit, BorderLayout.EAST);
		f.getContentPane().add(bordureBas, BorderLayout.SOUTH);
		f.getContentPane().add(menuBar, BorderLayout.NORTH);
		f.getContentPane().add(bordureGauche, BorderLayout.WEST);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tmp = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(((int) tmp.getWidth()) / 2 - 325,
				((int) tmp.getHeight()) / 2 - 200);
		f.setResizable(false);
		f.pack();
		f.setVisible(true);
	}

	private void initialiseList() {
		for (int i = 0; i < 10; i++) {
			listeCouleur.add(new Couleurchoisie(i));
		}
	}

	private void modifieAffichage(int i) {
		for (int j = 0; j < 10; j++) {
			listeCouleur.get(j).setVisible(false);
		}
		for (int j = 0; j < i; j++) {
			listeCouleur.get(j).setVisible(true);
		}
	}
}