import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculate extends JFrame {
	double x,y;

	private JPanel contentPane;
	private JTextField Num1;
	private JTextField Num2;
	private JTextField Addfield;
	private JTextField subfield;
	private JTextField multfield;
	private JTextField divfield;
	private JTextField modfield;
	private JLabel lblCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculate frame = new calculate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculate() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum = new JLabel("NUM1");
		lblNum.setForeground(Color.ORANGE);
		lblNum.setFont(new Font("Agency FB", Font.BOLD, 16));
		lblNum.setBounds(33, 86, 46, 14);
		contentPane.add(lblNum);
		
		JLabel lblNum_1 = new JLabel("NUM2");
		lblNum_1.setForeground(Color.ORANGE);
		lblNum_1.setFont(new Font("Agency FB", Font.BOLD, 16));
		lblNum_1.setBounds(250, 86, 46, 14);
		contentPane.add(lblNum_1);
		
		Num1 = new JTextField();
		Num1.setBounds(89, 80, 120, 20);
		contentPane.add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setColumns(10);
		Num2.setBounds(294, 80, 120, 20);
		contentPane.add(Num2);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				x =Double.parseDouble(Num1.getText());
				y = Double.parseDouble(Num2.getText());
				
			}
		});
		btnSubmit.setBackground(Color.ORANGE);
		btnSubmit.setFont(new Font("Agency FB", Font.BOLD, 17));
		btnSubmit.setBounds(189, 127, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton add = new JButton("ADD:");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addfield.setText(Double.toString(x+y));
			}
		});
		add.setBackground(Color.ORANGE);
		add.setFont(new Font("Agency FB", Font.BOLD, 16));
		add.setForeground(Color.DARK_GRAY);
		add.setBounds(102, 171, 89, 23);
		contentPane.add(add);
		
		Addfield = new JTextField();
		Addfield.setBounds(210, 171, 160, 23);
		contentPane.add(Addfield);
		Addfield.setColumns(10);
		
		JButton sub = new JButton("SUBTRAC:");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subfield.setText(Double.toString(x-y));
			}
		});
		sub.setForeground(Color.DARK_GRAY);
		sub.setFont(new Font("Agency FB", Font.BOLD, 16));
		sub.setBackground(Color.ORANGE);
		sub.setBounds(102, 205, 89, 23);
		contentPane.add(sub);
		
		JButton mul = new JButton("MULTI:");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multfield .setText(Double.toString(x*y));
			}
		});
		mul.setForeground(Color.DARK_GRAY);
		mul.setFont(new Font("Agency FB", Font.BOLD, 16));
		mul.setBackground(Color.ORANGE);
		mul.setBounds(102, 239, 89, 23);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV:");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divfield.setText(Double.toString(x/y));
			}
		});
		div.setForeground(Color.DARK_GRAY);
		div.setFont(new Font("Agency FB", Font.BOLD, 16));
		div.setBackground(Color.ORANGE);
		div.setBounds(102, 274, 89, 23);
		contentPane.add(div);
		
		JButton mod = new JButton("MOD:");
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = Math.ceil(x);
				y = Math.ceil(y);
				modfield.setText(Double.toString(x%y));
			}
			
		});
		mod.setForeground(Color.DARK_GRAY);
		mod.setFont(new Font("Agency FB", Font.BOLD, 16));
		mod.setBackground(Color.ORANGE);
		mod.setBounds(102, 308, 89, 23);
		contentPane.add(mod);
		
		subfield = new JTextField();
		subfield.setColumns(10);
		subfield.setBounds(210, 205, 160, 23);
		contentPane.add(subfield);
		
		multfield = new JTextField();
		multfield.setColumns(10);
		multfield.setBounds(210, 242, 160, 23);
		contentPane.add(multfield);
		
		divfield = new JTextField();
		divfield.setColumns(10);
		divfield.setBounds(210, 277, 160, 23);
		contentPane.add(divfield);
		
		modfield = new JTextField();
		modfield.setColumns(10);
		modfield.setBounds(210, 311, 160, 23);
		contentPane.add(modfield);
		
		lblCalculator = new JLabel("CALCULATOR:");
		lblCalculator.setForeground(Color.ORANGE);
		lblCalculator.setFont(new Font("Agency FB", Font.BOLD, 25));
		lblCalculator.setBounds(176, 11, 132, 62);
		contentPane.add(lblCalculator);
	}
}
