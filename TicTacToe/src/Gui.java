import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui implements ActionListener{

	JFrame frame = new JFrame();
	JButton felder[] = new JButton[9];
	Player player = new Player();
	Border border = BorderFactory.createLineBorder(Color.black, 1);
	JPanel feld = new JPanel();
	JPanel textfeld = new JPanel();
	JTextField text = new JTextField();


	Gui(){
		frame.setTitle("Tic Tac Toe");
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		text.setBackground(Color.BLUE);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Arial", Font.PLAIN, 10));
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setText("Tic Tac Toe");
		
		textfeld.setLayout(new BorderLayout());
		textfeld.setBounds(0, 0, 700, 100);
		textfeld.setBackground(Color.BLUE);
		textfeld.setOpaque(true);
		
	
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
		
		textfeld.add(text);
		frame.add(textfeld, BorderLayout.NORTH);
		frame.add(feld, BorderLayout.CENTER);
		frame.setVisible(true);
		
		
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		if (button.getText().equals("O") || button.getText().equals("X")) {
			return;
		}else {
		
			if (player.getSpielzug() == true) {
				button.setText("X");
				spielfeldprüfen1();
				spielfeldprüfen2();
				player.setSpielzug(false);

			}else{
				button.setText("O");
				spielfeldprüfen1();
				spielfeldprüfen2();
				player.setSpielzug(true);
			}
		}
		
	
	}
	
	public void spielfeldprüfen1() {
		if (felder[0].getText() == "X" && felder[1].getText() == "X" && felder[2].getText() == "X") {
			System.out.println("Spieler 1 gewinnt");
			}
		
		if (felder[0].getText() == "X" && felder[4].getText() == "X" && felder[8].getText() == "X") {
			System.out.println("Spieler 1 gewinnt");
			}
		
		if (felder[0].getText() == "X" && felder[3].getText() == "X" && felder[6].getText() == "X") {
			System.out.println("Spieler 1 gewinnt");
			}
		
		if (felder[1].getText() == "X" && felder[4].getText() == "X" && felder[7].getText() == "X") {
			System.out.println("Spieler 1 gewinnt");
			}
		
		if (felder[2].getText() == "X" && felder[5].getText() == "X" && felder[8].getText() == "X") {
			System.out.println("Spieler 1 gewinnt");
			}
		
		if (felder[6].getText() == "X" && felder[7].getText() == "X" && felder[8].getText() == "X") {
			System.out.println("Spieler 1 gewinnt");
			}
		
		if (felder[2].getText() == "X" && felder[4].getText() == "X" && felder[6].getText() == "X") {
			System.out.println("Spieler 1 gewinnt");
			}
		
		if (felder[0].getText() == "X" && felder[1].getText() == "X" && felder[2].getText() == "X") {
			System.out.println("Spieler 1 gewinnt");
			}
		
		else {
		return;
		}
		
	}
	
	public void spielfeldprüfen2() {
		if (felder[0].getText() == "O" && felder[1].getText() == "O" && felder[2].getText() == "O") {
			System.out.println("Spieler 2 gewinnt");
			}
		
		if (felder[0].getText() == "O" && felder[4].getText() == "O" && felder[8].getText() == "O") {
			System.out.println("Spieler 2 gewinnt");
			}
		
		if (felder[0].getText() == "O" && felder[3].getText() == "O" && felder[6].getText() == "O") {
			System.out.println("Spieler 2 gewinnt");
			}
		
		if (felder[1].getText() == "O" && felder[4].getText() == "O" && felder[7].getText() == "O") {
			System.out.println("Spieler 2 gewinnt");
			}
		
		if (felder[2].getText() == "O" && felder[5].getText() == "O" && felder[8].getText() == "O") {
			System.out.println("Spieler 2 gewinnt");
			}
		
		if (felder[6].getText() == "O" && felder[7].getText() == "O" && felder[8].getText() == "O") {
			System.out.println("Spieler 2 gewinnt");
			}
		
		if (felder[2].getText() == "O" && felder[4].getText() == "O" && felder[6].getText() == "O") {
			System.out.println("Spieler 2 gewinnt");
			}
		
		if (felder[0].getText() == "O" && felder[1].getText() == "O" && felder[2].getText() == "O") {
			System.out.println("Spieler 2 gewinnt");
			}
		else {
			
		return;}
	}
	
	
			

		
		
}  // test um zu gucken ob es bei Marius klappt
	
	

