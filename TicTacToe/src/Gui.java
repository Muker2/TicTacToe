import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.GridLayout;


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
		frame.getContentPane().setLayout(new GridLayout(3, 3));
		
		Border border = BorderFactory.createLineBorder(Color.black, 1);
		
		JLabel feld1 = new JLabel("", SwingConstants.CENTER);
		feld1.setBorder(border);
		frame.getContentPane().add(feld1);
		
		JLabel feld2 = new JLabel("", SwingConstants.CENTER);
		feld2.setBorder(border);
		frame.getContentPane().add(feld2);
		
		JLabel feld3 = new JLabel("", SwingConstants.CENTER);
		feld3.setBorder(border);
		frame.getContentPane().add(feld3);
		
		JLabel feld4 = new JLabel("", SwingConstants.CENTER);
		feld4.setBorder(border);
		frame.getContentPane().add(feld4);
		
		JLabel feld5 = new JLabel("", SwingConstants.CENTER);
		feld5.setBorder(border);
		frame.getContentPane().add(feld5);
		
		JLabel feld6 = new JLabel("", SwingConstants.CENTER);
		feld6.setBorder(border);
		frame.getContentPane().add(feld6);
		
		JLabel feld7 = new JLabel("", SwingConstants.CENTER);
		feld7.setBorder(border);
		frame.getContentPane().add(feld7);
		
		JLabel feld8 = new JLabel("", SwingConstants.CENTER);
		feld8.setBorder(border);
		frame.getContentPane().add(feld8);
		
		JLabel feld9 = new JLabel("", SwingConstants.CENTER);
		feld9.setBorder(border);
		frame.getContentPane().add(feld9);
	}

}
