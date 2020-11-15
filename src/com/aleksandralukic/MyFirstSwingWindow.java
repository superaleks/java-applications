package com.aleksandralukic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextArea;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class MyFirstSwingWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstSwingWindow window = new MyFirstSwingWindow();
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
	public MyFirstSwingWindow() {
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
		
		JTextArea textField = new JTextArea();
		textField.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 13));
		textField.setBounds(72, 30, 227, 22);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("Say HI to me!");
		
		JLabel label = new JLabel("");
		label.setBounds(30, 77, 414, 16);
		frame.getContentPane().add(label);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Hi! " + textField.getText() + "!");
				
			}
		});
		
		
		button.setBounds(311, 22, 133, 37);
		frame.getContentPane().add(button);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		name.setHorizontalAlignment(SwingConstants.TRAILING);
		name.setBounds(6, 31, 61, 16);
		frame.getContentPane().add(name);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(16, 105, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
	}
}
