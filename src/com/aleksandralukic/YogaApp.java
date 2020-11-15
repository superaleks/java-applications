package com.aleksandralukic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class YogaApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YogaApp window = new YogaApp();
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
	public YogaApp() {
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
		
		JLabel introLabel = new JLabel("Welcome to Yoga Guide!");
		introLabel.setBounds(23, 16, 174, 16);
		frame.getContentPane().add(introLabel);
		
		JLabel name = new JLabel("Name");
		name.setBounds(23, 44, 61, 16);
		frame.getContentPane().add(name);
		
		JTextArea nameTextArea = new JTextArea();
		nameTextArea.setBounds(96, 44, 202, 16);
		frame.getContentPane().add(nameTextArea);
		
		JLabel sexLabel = new JLabel("Sex");
		sexLabel.setBounds(23, 86, 61, 16);
		frame.getContentPane().add(sexLabel);
		
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(23, 134, 61, 16);
		frame.getContentPane().add(ageLabel);
		
		JTextArea sexTextArea = new JTextArea();
		sexTextArea.setBounds(96, 86, 101, 16);
		frame.getContentPane().add(sexTextArea);
		
		JTextArea ageTextArea = new JTextArea();
		ageTextArea.setBounds(96, 134, 61, 16);
		frame.getContentPane().add(ageTextArea);
	
		
		
		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Yogi yogi = new Yogi();
				yogi.setName(nameTextArea.getText());
				yogi.setAge(ageTextArea.getText());
				yogi.setSex(sexTextArea.getText());
		
				
			}
		});
		saveButton.setBounds(311, 218, 117, 29);
		frame.getContentPane().add(saveButton);
		
		JList list = new JList();
		list.setBounds(226, 86, 125, 23);
		frame.getContentPane().add(list);
	}
}
