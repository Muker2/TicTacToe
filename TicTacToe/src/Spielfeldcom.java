import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Spielfeldcom implements ActionListener {

	JFrame frame = new JFrame();
	JButton felder[][] = new JButton[3][3];
	KI ki = new KI();
	Border border = BorderFactory.createLineBorder(Color.black, 1);
	JPanel feld = new JPanel();
	JPanel textfeld = new JPanel();
	// JTextField text = new JTextField ("Spieler 1: " + player.getPunkte());
	// JTextField text1 = new JTextField("Spieler 2: " + player.getPunkte());
	JDialog dialog = new JDialog();

	Spielfeldcom() {
		frame.setTitle("Tic Tac Toe");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);

		/*
		 * text.setBackground(Color.BLUE); text.setForeground(Color.WHITE);
		 * text.setFont(new Font("Arial", Font.PLAIN, 20));
		 * text.setHorizontalAlignment(JLabel.CENTER);
		 * 
		 * text1.setBackground(Color.BLUE); text1.setForeground(Color.WHITE);
		 * text1.setFont(new Font("Arial", Font.PLAIN, 20));
		 * text1.setHorizontalAlignment(JLabel.CENTER);
		 * 
		 * 
		 * textfeld.setLayout(new BoxLayout(textfeld, BoxLayout.LINE_AXIS));
		 * textfeld.setBounds(0, 0, 0, 100); textfeld.setBackground(Color.BLUE);
		 * textfeld.setOpaque(true);
		 */

		dialog.setSize(300, 300);
		dialog.setModal(true);
		dialog.setVisible(false);

		feld.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				felder[i][j] = new JButton();
				feld.add(felder[i][j]);
				felder[i][j].setBorder(border);
				felder[i][j].setBackground(Color.WHITE);
				felder[i][j].setOpaque(true);
				felder[i][j].setFont(new Font("Arial", Font.PLAIN, 30));
				felder[i][j].addActionListener(this);
			}
		}

		/*
		 * textfeld.add(text); textfeld.add(text1);
		 */
		frame.add(textfeld, BorderLayout.SOUTH);
		frame.add(feld, BorderLayout.CENTER);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();

		ki.setzen(button);
		ki.winner(felder, frame);
		ki.tie(felder, frame);
		ki.ki(felder, frame);
		ki.winner(felder, frame);
		ki.tie(felder, frame);

	}

}
