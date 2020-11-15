package com.aleksandralukic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TablesTwoDimensionalArray {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablesTwoDimensionalArray window = new TablesTwoDimensionalArray();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class TableData extends AbstractTableModel {
		
		String[][] allData = new String[3][3];
		
		public TableData() {
			
		allData[0] = new String[] {"Marcos", "Daniel", "Cortez"};
		allData[1] = new String[] {"Aleksandra", "Lukic", "Aleksandra"};
		allData[2] = new String[] {"Marcos", "Alejandra", "Priscila"};
		
		}
		
		private static final long serialVersionUID = -4105822240301079221L;

		@Override
		public int getRowCount() {
			
			return allData.length;
		}

		@Override
		public int getColumnCount() {
		
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			
			return allData[rowIndex][columnIndex];
		}
		
	}

	/**
	 * Create the application.
	 */
	public TablesTwoDimensionalArray() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(44, 33, 308, 151);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		TableData data = new TableData();
		table.setModel(data);
		
		
		
	}
}
