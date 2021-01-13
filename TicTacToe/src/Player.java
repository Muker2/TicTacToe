import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Player {
	private int Punkte = 0;
	private boolean spielzug = true;
	private String text1 = "Spieler 1 ist am Zug";
	private String text2 = "Spieler 2 ist am Zug";
	Gewinnfenster fenster = new Gewinnfenster();

	
	public String getText1() {
	return text1;
	}
	
	public String getText2() {
		return text2;
	}
	
	
	public int getPunkte(){
		return Punkte;
	}
	
	public void setPunkte(int punkte) {
		this.Punkte = punkte;
	}
	
	public boolean getSpielzug(){
		return spielzug;
	}
	
	public void setSpielzug(boolean zug) {
		this.spielzug = zug;
	}
	
	public void spielfeldprüfen(JButton i, JButton a, JButton j, JFrame frame, String w ) {
		if (i.getText() == w && a.getText() == w && j.getText() == w) {
			
			if (w == "X") {	
			fenster.gewonnen(1);
			}
			else {
			fenster.gewonnen(2);
			}
			
			frame.dispose();
		}
		else {
			return;
		}
}
		
		public void setzen(JButton b) {
			
			if (b.getText().equals("X") || b.getText().equals("O")) {
				return;
			}
			
			else {
			if (this.spielzug == true) {
				b.setText("X");
				b.setForeground(Color.RED);
				this.setSpielzug(false);
			}
			else {
				b.setText("O");
				b.setForeground(Color.BLUE);
				this.setSpielzug(true);
			}
			
		}
			
	}

	
}
