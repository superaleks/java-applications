package com.aleksandralukic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import java.awt.Color;

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
		
		int[][] allData = new int[3][3];
		
		public TableData() {
			
		allData[0] = new int[] {1, 2, 3};
		allData[1] = new int[] {4, 5, 6};
		allData[2] = new int[] {7, 8, 9};
		
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
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(44, 33, 377, 204);
		frame.getContentPane().add(table);
		
		TableData data = new TableData();
		table.setModel(data);
		
	}
}
