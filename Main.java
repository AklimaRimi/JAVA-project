import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main extends JTable {
			
	JTable table;
	
	String[] column  = {"Name","Id","phone"};
		Object[][] data = {{"Rimi","084","0198"},
				{"Rimi","084","0198"},
				{"Rimi","084","0198"}};
	public Main() {
		//setLayout(new FlowLayout());
		table = new JTable(data,column);
		table.setBounds(50, 50, 400, 250);
		JScrollPane  scroll = new JScrollPane(table);
		add(scroll);
		this.setSize(500, 60);
		this.setVisible(true);
		
		
		
	}
	public static void main(String args[])
	{
		new Main();
	}
	
	
}
