import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GewinnFenster {
	
	JDialog gewinn = new JDialog();
	JLabel panel = new JLabel();
	JButton nm = new JButton();
	JButton hm = new JButton();
	JPanel buttonlayout = new JPanel();

	
	public void gewonnen(int win){
		gewinn.setTitle("Tic Tac Toe");
		gewinn.setSize(300, 300);
		gewinn.setLayout(new BorderLayout());
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
		
		
		panel.setBackground(Color.WHITE);
		panel.setVisible(true);
		panel.setText("Glückwunsch!" + " " + "Spieler" + " " + win  + " "  +"hat gewonnen!");
	
		gewinn.add(buttonlayout, BorderLayout.SOUTH);
		gewinn.add(panel, BorderLayout.CENTER);
		

	}
	
	class nochmal implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			gewinn.dispose();
			Gui gui = new Gui();
			
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