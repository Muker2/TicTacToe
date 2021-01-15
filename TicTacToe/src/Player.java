import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Player {
	private int Punkte = 0;
	private int zugzahl = 0;
	private boolean spielzug = true;
	private String text1 = "Spieler 1 ist am Zug";
	private String text2 = "Spieler 2 ist am Zug";
	private boolean unentschieden = true;
	Gewinnfenster fenster = new Gewinnfenster();

	public String getText1() {
		return text1;
	}

	public String getText2() {
		return text2;
	}

	public int getPunkte() {
		return Punkte;
	}

	public void setPunkte(int punkte) {
		this.Punkte = punkte;
	}

	public boolean getSpielzug() {
		return spielzug;
	}

	public void setSpielzug(boolean zug) {
		this.spielzug = zug;
	}

	public int getZugzahl() {
		return zugzahl;
	}

	public boolean winner(JButton[][] button, JFrame f) {
		
		for (int i = 0; i < 3; i++) {
			if (!button[i][0].getText().equals("")) {
				if (button[i][0].getText().equals(button[i][1].getText())
						&& button[i][1].getText().equals(button[i][2].getText())) {
					if (this.spielzug == true) {
						f.dispose();
						fenster.gewonnen(2);
					} else {
						f.dispose();
						fenster.gewonnen(1);
					}

				}
			} 
		}

		for (int i = 0; i < 3; i++) {
			if (!button[0][i].getText().equals("")) {
				if (button[0][i].getText().equals(button[1][i].getText())
						&& button[1][i].getText().equals(button[2][i].getText())) {
					if (this.spielzug == true) {
						f.dispose();
						fenster.gewonnen(2);
					} else {
						f.dispose();
						fenster.gewonnen(1);
					}

				}
			}
		}

		if (!button[0][0].getText().equals("") && !button[1][1].getText().equals("")
				&& !button[2][2].getText().equals("")) {
			if (button[0][0].getText().equals(button[1][1].getText())
					&& button[1][1].getText().equals(button[2][2].getText())

			) {
				if (this.spielzug == true) {
					f.dispose();
					fenster.gewonnen(2);
				} else {
					f.dispose();
					fenster.gewonnen(1);
				}
			}
		}
		if (!button[0][2].getText().equals("") && !button[1][2].getText().equals("")
				&& !button[2][0].getText().equals("")) {
			if (button[0][2].getText().equals(button[1][2].getText())
					&& button[1][2].getText().equals(button[2][0].getText())) {
				if (this.spielzug == true) {
					f.dispose();
					fenster.gewonnen(1);
				} else {
					f.dispose();
					fenster.gewonnen(1);
				}

			}
		
		} else {
			
		}	
		
		unentschieden = false;
		return unentschieden;
	}

	public void tie(JButton[][] button, JFrame f) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if (!button[i][j].getText().equals("") && zugzahl == 9 && !winner(button, f)) {
					fenster.unentschieden();
					
				}
				
				
			}
		}
	}

	public void setzen(JButton b) {

		zugzahl++;

		if (!b.getText().equals("") || !b.getText().equals("")) {
			return;
		}

		else {
			if (this.spielzug == true) {
				b.setText("X");
				b.setForeground(Color.RED);
				this.setSpielzug(false);
			} else {
				b.setText("O");
				b.setForeground(Color.BLUE);
				this.setSpielzug(true);
			}

		}

	}

}
