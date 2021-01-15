import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gewinnfenster {
	
	JDialog gewinn = new JDialog();
	JPanel panel = new JPanel();
	JButton nm = new JButton();
	JButton hm = new JButton();
	JPanel buttonlayout = new JPanel();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	
	public void gewonnen(int win){
		gewinn.setTitle("Tic Tac Toe");
		gewinn.setSize(300, 200);
		gewinn.setLayout(new BorderLayout(20, 20));
		gewinn.setLocationRelativeTo(null);
		gewinn.setVisible(true);
		gewinn.setModal(true);
		
		hm.setText("Hauptmenü");
		hm.setPreferredSize(new Dimension (100, 50));
		hm.addActionListener(new zurück());
		hm.setVisible(true);
		
		nm.setText("Nochmal");
		nm.setPreferredSize(new Dimension (100, 50));
		nm.addActionListener(new nochmal());
		nm.setVisible(true);
		
		buttonlayout.setSize(300, 50);
		buttonlayout.setLayout (new FlowLayout());
		buttonlayout.add(nm);
		buttonlayout.add(hm);
		
		label.setBackground(Color.WHITE);
		label.setVisible(true);
		label.setText("Glückwunsch!" + " " + "Spieler" + " " + win  + " "  +"hat gewonnen!");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(label);
	
		gewinn.add(buttonlayout, BorderLayout.CENTER);
		gewinn.add(panel, BorderLayout.NORTH);
		

	}
	
	public void unentschieden(){
		gewinn.setTitle("Tic Tac Toe");
		gewinn.setSize(300, 200);
		gewinn.setLayout(new BorderLayout(20, 20));
		gewinn.setLocationRelativeTo(null);
		gewinn.setVisible(true);
		gewinn.setModal(true);
		
		hm.setText("Hauptmenü");
		hm.setPreferredSize(new Dimension (100, 50));
		hm.addActionListener(new zurück());
		hm.setVisible(true);
		
		nm.setText("Nochmal");
		nm.setPreferredSize(new Dimension (100, 50));
		nm.addActionListener(new nochmal());
		nm.setVisible(true);
		
		buttonlayout.setSize(300, 50);
		buttonlayout.setLayout (new FlowLayout());
		buttonlayout.add(nm);
		buttonlayout.add(hm);
		
		label.setBackground(Color.WHITE);
		label.setVisible(true);
		label.setText("Unentschieden");
		label.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(label);
	
		gewinn.add(buttonlayout, BorderLayout.CENTER);
		gewinn.add(panel, BorderLayout.NORTH);
		

	}
	class nochmal implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			gewinn.dispose();
			Spielfeld gui = new Spielfeld();
			
		}
		
	}


	class zurück implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			gewinn.dispose();
			Hauptmenü menü = new Hauptmenü();
		
	}
	}
}