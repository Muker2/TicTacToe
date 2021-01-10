import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Hauptmenü implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton btn1 = new JButton("1 Spieler");
	JButton btn2 = new JButton("2 Spieler");
	JLabel buttons = new JLabel();
	
	Hauptmenü(){
		frame.setTitle("Tic Tac Toe");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(20,20));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		btn2.addActionListener(this);

		buttons.setSize(300, 300);
		buttons.setLayout(new BoxLayout(buttons, BoxLayout.LINE_AXIS));
		buttons.setHorizontalAlignment(JLabel.CENTER);
		buttons.setVisible(true);
		buttons.add(btn1);
		buttons.add(btn2);
		buttons.setHorizontalAlignment(SwingConstants.CENTER);
		
		frame.add(buttons, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.dispose();
		Gui gui = new Gui();
		
	}

}
