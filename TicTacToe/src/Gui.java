import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;


public class Gui {

	private JFrame frame;

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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		JPanel feld = new JPanel();
		feld.setLayout(new GridLayout(3, 3));
		frame.add(feld);
		
		
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		
		JLabel felder[] = new JLabel[9];
		
		for (int i = 0; i<felder.length; i++) {
			felder[i] = new JLabel("", SwingConstants.CENTER);
			felder[i].setBorder(border);
			felder[i].addMouseListener(null);
			feld.add(felder[i]);
		}
		
		
		}
		
		
}
	
	

