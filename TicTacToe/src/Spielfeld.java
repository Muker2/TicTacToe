import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Spielfeld implements ActionListener{

	JFrame frame = new JFrame();
	JButton felder[] = new JButton[9];
	Player player = new Player();
	Border border = BorderFactory.createLineBorder(Color.black, 1);
	JPanel feld = new JPanel();
	JPanel textfeld = new JPanel();
	JTextField text = new JTextField ("Spieler 1: " + player.getPunkte());
	JTextField text1 = new JTextField("Spieler 2: " + player.getPunkte());
	JDialog dialog = new JDialog();


	Spielfeld(){
		frame.setTitle("Tic Tac Toe");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		
		/*
		text.setBackground(Color.BLUE);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Arial", Font.PLAIN, 20));
		text.setHorizontalAlignment(JLabel.CENTER);
		
		text1.setBackground(Color.BLUE);
		text1.setForeground(Color.WHITE);
		text1.setFont(new Font("Arial", Font.PLAIN, 20));
		text1.setHorizontalAlignment(JLabel.CENTER);
		
		
		textfeld.setLayout(new BoxLayout(textfeld, BoxLayout.LINE_AXIS));
		textfeld.setBounds(0, 0, 0, 100);
		textfeld.setBackground(Color.BLUE);
		textfeld.setOpaque(true);
		*/
		
		dialog.setSize(300, 300);
		dialog.setModal(true);
		dialog.setVisible(false);
		
		feld.setLayout(new GridLayout(3, 3));
		for (int i = 0; i<felder.length; i++) {
			felder[i] = new JButton("");
			felder[i].setBorder(border);
			felder[i].setBackground(Color.WHITE);
			felder[i].setOpaque(true);
			felder[i].setFont(new Font("Arial", Font.PLAIN, 30));
			felder[i].addActionListener(this);
			feld.add(felder[i]);
		}
		
		
		/*textfeld.add(text);
		textfeld.add(text1);*/
		frame.add(textfeld, BorderLayout.SOUTH);
		frame.add(feld, BorderLayout.CENTER);
		frame.setVisible(true);
		
		
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		
				player.setzen(button);
				
				player.spielfeldprüfen(felder[0], felder[1], felder[2], frame, "X");
				player.spielfeldprüfen(felder[0], felder[3], felder[6], frame, "X");
				player.spielfeldprüfen(felder[0], felder[4], felder[8], frame, "X");
				player.spielfeldprüfen(felder[1], felder[4], felder[7], frame, "X");
				player.spielfeldprüfen(felder[2], felder[5], felder[8], frame, "X");
				player.spielfeldprüfen(felder[6], felder[7], felder[8], frame, "X");
				player.spielfeldprüfen(felder[3], felder[4], felder[5], frame, "X");
				player.spielfeldprüfen(felder[2], felder[4], felder[6], frame, "X");
				
				player.spielfeldprüfen(felder[0], felder[1], felder[2], frame, "O");
				player.spielfeldprüfen(felder[0], felder[3], felder[6], frame, "O");
				player.spielfeldprüfen(felder[0], felder[4], felder[8], frame, "O");
				player.spielfeldprüfen(felder[1], felder[4], felder[7], frame, "O");
				player.spielfeldprüfen(felder[2], felder[5], felder[8], frame, "O");
				player.spielfeldprüfen(felder[6], felder[7], felder[8], frame, "O");
				player.spielfeldprüfen(felder[3], felder[4], felder[5], frame, "O");
				player.spielfeldprüfen(felder[2], felder[4], felder[6], frame, "O");
		
		}
		
	
	}
	
	
	

