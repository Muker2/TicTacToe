import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Player {
	private int turn = 1;
	Gewinnfenster fenster = new Gewinnfenster();

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
						fenster.gewonnen(2);
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
						fenster.gewonnen(2);
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
					fenster.gewonnen(2);
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
					fenster.gewonnen(2);
				}

				return true;

			}

		}
		return false;
	}

	public void setzen(JButton b, JTextField p, JTextField o) {
		if (!b.getText().equals("") || !b.getText().equals("")) {
			return;
		}

		else {
			if (turn == 1) {
				o.setBackground(Color.BLUE);
				o.setForeground(Color.WHITE);
				p.setBackground(Color.WHITE);
				p.setForeground(Color.BLACK);
				b.setText("X");
				b.setForeground(Color.RED);
				turn = 0;
			} else {
				p.setBackground(Color.RED);
				p.setForeground(Color.WHITE);
				o.setBackground(Color.WHITE);
				o.setForeground(Color.BLACK);
				b.setText("O");
				b.setForeground(Color.BLUE);
				turn = 1;
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
