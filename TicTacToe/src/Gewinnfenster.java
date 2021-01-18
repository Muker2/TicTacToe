import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gewinnfenster {

	JFrame gewinn = new JFrame();
	JPanel panel = new JPanel();
	JButton hm = new JButton();
	JPanel buttonlayout = new JPanel();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();

	public void gewonnen(int win) {
		gewinn.setTitle("Tic Tac Toe");
		gewinn.setSize(300, 200);
		gewinn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gewinn.setLayout(new BorderLayout(20, 20));
		gewinn.setLocationRelativeTo(null);
		gewinn.setVisible(true);


		hm.setText("Hauptmenü");
		hm.setPreferredSize(new Dimension(100, 50));
		hm.addActionListener(new zurück());
		hm.setVisible(true);

		buttonlayout.setSize(300, 50);
		buttonlayout.setLayout(new FlowLayout());
		buttonlayout.add(hm);
		buttonlayout.setVisible(true);

		label.setBackground(Color.WHITE);
		label.setVisible(true);
		label.setText("Glückwunsch!" + " " + "Spieler" + " " + win + " " + "hat gewonnen!");

		if (win == 3) {
			label.setText("Com gewinnt!");
		}
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(label);

		gewinn.add(buttonlayout, BorderLayout.CENTER);
		gewinn.add(panel, BorderLayout.NORTH);

	}

	public void unentschieden() {
		gewinn.setTitle("Tic Tac Toe");
		gewinn.setSize(300, 200);
		gewinn.setLayout(new BorderLayout(20, 20));
		gewinn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gewinn.setLocationRelativeTo(null);
		gewinn.setVisible(true);

		hm.setText("Hauptmenü");
		hm.setPreferredSize(new Dimension(100, 50));
		hm.addActionListener(new zurück());
		hm.setVisible(true);

		buttonlayout.setSize(300, 50);
		buttonlayout.setLayout(new FlowLayout());
		buttonlayout.add(hm);

		label.setBackground(Color.WHITE);
		label.setVisible(true);
		label.setText("Unentschieden");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(label);

		gewinn.add(buttonlayout, BorderLayout.CENTER);
		gewinn.add(panel, BorderLayout.NORTH);

	}

	class zurück implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			gewinn.dispose();
			Hauptmenü menü = new Hauptmenü();

		}
	}
}