import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Hauptmenü implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton btn1 = new JButton("1 Spieler");
	JButton btn2 = new JButton("2 Spieler");
	JPanel buttons = new JPanel();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	
	Hauptmenü(){
		frame.setTitle("Tic Tac Toe");
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(20,20));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		btn2.addActionListener(this);

		
		label.setBackground(Color.WHITE);
		label.setVisible(true);
		label.setText("Tic Tac Toe");
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		buttons.setSize(300, 300);
		buttons.setLayout(new FlowLayout());
		buttons.setVisible(true);
		buttons.add(btn1);
		buttons.add(btn2);
		
		
		panel.add(label);
		frame.add(panel, BorderLayout.NORTH);
		frame.add(buttons, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		Spielfeld gui = new Spielfeld();
		
	}

}
