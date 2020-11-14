package com.aleksandralukic;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class RadioButtons {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JLabel label = new JLabel("");	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtons window = new RadioButtons();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class RadioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton btn = (JRadioButton)e.getSource();
			label.setText(btn.getText());
			
		}
		
	}

	/**
	 * Create the application.
	 */
	public RadioButtons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		RadioListener listener = new RadioListener();
		
		JRadioButton item1 = new JRadioButton("Item 1");

		buttonGroup.add(item1);
		item1.setBounds(43, 20, 181, 23);
		frame.getContentPane().add(item1);
		item1.addActionListener(listener);
		
		JRadioButton item2 = new JRadioButton("Item 2");
	
		buttonGroup.add(item2);
		item2.setBounds(43, 67, 141, 23);
		frame.getContentPane().add(item2);
		
		item2.addActionListener(listener);
		
		JRadioButton item3 = new JRadioButton("Item 3");
		buttonGroup.add(item3);
		item3.setBounds(43, 119, 141, 23);
		frame.getContentPane().add(item3);
		
		item3.addActionListener(listener);
		
		label.setBounds(53, 195, 156, 16);
		frame.getContentPane().add(label);
		
	
	}
}
