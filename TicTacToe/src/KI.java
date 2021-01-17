import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KI {

	int zugzahl = 0;
	int turn = 1;
	Gewinnfenster fenster = new Gewinnfenster();
	Random rand = new Random();
	List<Integer> frei = new ArrayList<Integer>();

	KI() {
		for (int i = 0; i < 9; i++) {
			frei.add(i);
		}

	}

	public boolean winner(JButton[][] button, JFrame f) {

		for (int i = 0; i < 3; i++) {
			if (!button[i][0].getText().equals("")) {
				if (button[i][0].getText().equals(button[i][1].getText())
						&& button[i][1].getText().equals(button[i][2].getText())) {
					if (turn == 0) {
						f.dispose();
						fenster.gewonnen(1);
					} else {
						f.dispose();
						fenster.gewonnen(3);
					}

					return true;

				}
			}
		}

		for (int i = 0; i < 3; i++) {
			if (!button[0][i].getText().equals("")) {
				if (button[0][i].getText().equals(button[1][i].getText())
						&& button[1][i].getText().equals(button[2][i].getText())) {
					if (turn == 0) {
						f.dispose();
						fenster.gewonnen(1);
					} else {
						f.dispose();
						fenster.gewonnen(3);
					}

					return true;

				}
			}
		}

		if (!button[0][0].getText().equals("") && !button[1][1].getText().equals("")
				&& !button[2][2].getText().equals("")) {
			if (button[0][0].getText().equals(button[1][1].getText())
					&& button[1][1].getText().equals(button[2][2].getText())

			) {
				if (turn == 0) {
					f.dispose();
					fenster.gewonnen(1);
				} else {
					f.dispose();
					fenster.gewonnen(3);
				}

				return true;

			}
		}
		if (!button[0][2].getText().equals("") && !button[1][1].getText().equals("")
				&& !button[2][0].getText().equals("")) {
			if (button[0][2].getText().equals(button[1][1].getText())
					&& button[1][1].getText().equals(button[2][0].getText())) {
				if (turn == 0) {
					f.dispose();
					fenster.gewonnen(1);
				} else {
					f.dispose();
					fenster.gewonnen(3);
				}

				return true;
			}

		}
		return false;
	}

	public void setzen(JButton b) {
		if (frei.isEmpty()) {
			return;
		}
		if (b.getText().equals("") && turn == 1) {
			frei.remove(frei.size() - 1);
			b.setText("X");
			b.setForeground(Color.RED);
			turn = 0;
		} else {
			return;

		}
	}

	public void ki(JButton[][] b, JFrame f) {

		if (frei.isEmpty() || winner(b, f) == true || turn == 1) {
			return;
		} else {
			int i = rand.nextInt(3);
			int j = rand.nextInt(3);
			if (b[i][j].getText().equals("")) {
				frei.remove(frei.size() - 1);
				b[i][j].setText("O");
				turn = 1;
				return;
			} else {
				ki(b, f);
			}
		}

	}

	public boolean tie(JButton[][] button, JFrame f) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (button[i][j].getText().equals("")) {
					return false;
				}
			}
		}

		if (winner(button, f) == false) {
			f.dispose();
			fenster.unentschieden();
			return true;
		}

		return true;
	}
}
