package affichage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Interface_graphique;

public class CouleurGris {
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
	
	JPanel slider = new JPanel();
	JPanel labelSlider = new JPanel();
	GridLayout sliderLayout = new GridLayout(3, 1);
	slider.setLayout(sliderLayout);
	labelSlider.setLayout(sliderLayout);
	final JLabel labelRouge = new JLabel("" + getRouge().getValue());
	final JLabel labelVert = new JLabel("" + getVert().getValue());
	final JLabel labelBleu = new JLabel("" + getBleu().getValue());
	
	Dimension sizeSlider = slider.getPreferredSize();
	slider.setBounds(new Dimension().width - sizeSlider.width - 50, 15,
			sizeSlider.width, sizeSlider.height);
	Dimension sizeLabelSliders = labelSlider.getPreferredSize();
	labelSlider.setBounds(new Dimension().width - 50, 15,
			sizeLabelSliders.width + 20, sizeLabelSliders.height);
	
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


	pane1.setPreferredSize(new Dimension(500,500));
	pane1.add(label1,BorderLayout.WEST);
	pane1.add(NbCouleurs);
	pane1.add(Automatique1);
	pane1.add(Manuel1);
			
	pane2.add(slider);
	pane2.add(labelSlider);
}
