import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spielfeld implements ActionListener {

	JFrame frame = new JFrame();
	JButton felder[][] = new JButton[3][3];
	Player player = new Player();
	Border border = BorderFactory.createLineBorder(Color.black, 1);
	JPanel feld = new JPanel();
	JPanel textfeld = new JPanel();
	JTextField text = new JTextField("Spieler 1");
	JTextField text1 = new JTextField("Spieler 2");
	JDialog dialog = new JDialog();

	Spielfeld() {
		frame.setTitle("Tic Tac Toe");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);

		text.setFont(new Font("Arial", Font.PLAIN, 20));
		text.setHorizontalAlignment(JLabel.CENTER);

		text1.setFont(new Font("Arial", Font.PLAIN, 20));
		text1.setHorizontalAlignment(JLabel.CENTER);

		textfeld.setLayout(new GridLayout(1, 3));
		textfeld.add(text);
		textfeld.add(text1);

		text.setBackground(Color.RED);
		text.setForeground(Color.WHITE);

		text1.setBackground(Color.WHITE);
		text1.setForeground(Color.BLACK);

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

		player.setzen(button, text, text1);
		player.winner(felder, frame);
		player.tie(felder, frame);

	}

}
