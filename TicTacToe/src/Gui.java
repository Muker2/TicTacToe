import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Gui implements MouseListener{

	private JFrame frame;
	public JLabel felder[] = new JLabel[9];
	Player player = new Player();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("Tic Tac Toe");
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		JPanel feld = new JPanel();
		feld.setLayout(new GridLayout(3, 3));
		frame.add(feld);
		
		
		
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		
		
		for (int i = 0; i<felder.length; i++) {
			felder[i] = new JLabel("", SwingConstants.CENTER);
			felder[i].setBorder(border);
			felder[i].setFont(new Font("Arial", Font.PLAIN, 30));
			felder[i].addMouseListener(this);
			feld.add(felder[i]);
		}
		
		
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		JLabel label = (JLabel) e.getSource();
		if (label.getText().equals("O") || label.getText().equals("X")) {
			return;
		}else {
		
			if (player.getSpielzug() == true) {
				label.setText("X");
				player.setSpielzug(false);
			}else{
				label.setText("O");
				player.setSpielzug(true);
			}
		}
		
	}
			
		
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
		
}
	
	

