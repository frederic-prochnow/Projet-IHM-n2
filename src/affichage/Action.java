package affichage;

import javax.swing.JLabel;


public class Action {

	private JLabel label;
	
	public Action(String valeur) {
		label = new JLabel(valeur);
	}
	
	public void setValeur(int i){
		int a = Integer.parseInt(label.getText()) + i;
		label.setText(""+a);
		if(Integer.parseInt(label.getText()) + i < 0){
			label.setText("" + 0);
		} else if(Integer.parseInt(label.getText()) + i > 100){
			label.setText("" + 100);
		}
	}

	public JLabel getJLabel(){
		return this.label;
	}
	
	public String getText(){
		return label.getText();
	}
	
	public void setLabel(String valeur){
		label.setText(valeur);
	}
}