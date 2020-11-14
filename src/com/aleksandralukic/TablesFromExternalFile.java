package com.aleksandralukic;

import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

import java.awt.Color;

public class TablesFromExternalFile {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablesFromExternalFile window = new TablesFromExternalFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class TableData extends AbstractTableModel {
		
		int[][] allData;
		
		public TableData() {
				loadFile("data.csv");
		
		}
		
		
		void loadFile(String fileName) {
			
			Path file = FileSystems.getDefault().getPath("",fileName);
			try {
				List<String> lines = Files.readAllLines(file);
				
				for(int i=0;i<lines.size();i++) {
					
					String line = lines.get(i);
					String[] lineArray = line.split(",");
					
					if(allData==null) {
						allData = new int [lines.size()][lineArray.length];
						
					}
					for(int j=0; i<lineArray.length;j++) {
						
						int parsedInt = Integer.parseInt(lineArray[j]);
						
						allData[i][j] = parsedInt;
						
						
					}
					
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			
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
	public TablesFromExternalFile() {
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
