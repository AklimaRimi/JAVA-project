import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class EMedGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField namfld;
	private JTextField agefld;
	private JTextField doctorfld;
	private JTextField disfld;
	private JTextField med1fld;
	private JTextField med2fld;
	private JTextField syfld;
	private JTextField q1fld;
	private JTextField q2fld;
	private JTextField q3fld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EMedGUI frame = new EMedGUI();
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
	static int i=100;
	String P_name,D_name,Oshukh,Med1,Med2,Syrup,phone,add;
	int age,quantity=0,Q2=0,Q3=0,total;
	private JTextField Addfld;
	private JTextField phonfld;
	
	public EMedGUI() {
		
		//variables 
	
		
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E-Pharmy");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 40));
		lblNewLabel.setForeground(new Color(240, 248, 255));
		lblNewLabel.setBounds(238, 11, 167, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblName.setForeground(new Color(240, 248, 255));
		lblName.setBounds(61, 107, 122, 14);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(new Color(240, 248, 255));
		lblAge.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblAge.setBounds(427, 107, 70, 14);
		contentPane.add(lblAge);
		
		JLabel lblDoctorsName = new JLabel("Doctor's Name:");
		lblDoctorsName.setForeground(new Color(240, 248, 255));
		lblDoctorsName.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblDoctorsName.setBounds(61, 176, 136, 14);
		contentPane.add(lblDoctorsName);
		
		JLabel lblAilment = new JLabel("Ailment:");
		lblAilment.setForeground(new Color(240, 248, 255));
		lblAilment.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblAilment.setBounds(393, 176, 136, 14);
		contentPane.add(lblAilment);
		
		JLabel lblMedcine = new JLabel("Medicine(s) :");
		lblMedcine.setForeground(new Color(240, 248, 255));
		lblMedcine.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblMedcine.setBounds(61, 208, 136, 14);
		contentPane.add(lblMedcine);
		
		
		JLabel lblQuantitys = new JLabel("Quantity(s):");
		lblQuantitys.setForeground(new Color(240, 248, 255));
		lblQuantitys.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblQuantitys.setBounds(354, 208, 100, 14);
		contentPane.add(lblQuantitys);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(new Color(240, 248, 255));
		lblAddress.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblAddress.setBounds(61, 135, 136, 14);
		contentPane.add(lblAddress);
		
		
		
		phonfld = new JTextField();
		phonfld.setColumns(10);
		phonfld.setBounds(467, 132, 144, 20);
		contentPane.add(phonfld);
		
		JLabel lblpreTabltecaptk = new JLabel("*per tablte/cap 5tk");
		lblpreTabltecaptk.setBounds(483, 233, 128, 14);
		contentPane.add(lblpreTabltecaptk);
		
		JLabel lblperBolttletk = new JLabel("*per bolttle 10tk");
		lblperBolttletk.setBounds(483, 295, 100, 14);
		contentPane.add(lblperBolttletk);
		
		
		JLabel lblBillNo = new JLabel();
		i++;
		lblBillNo.setText("Bill No: 101");
		lblBillNo.setFont(new Font("Arial Unicode MS", Font.BOLD, 11));
		lblBillNo.setForeground(new Color(240, 248, 255));
		lblBillNo.setBackground(new Color(0, 139, 139));
		lblBillNo.setBounds(511, 68, 100, 14);
		contentPane.add(lblBillNo);
		
		namfld = new JTextField();
		namfld.setBounds(193, 104, 198, 20);
		contentPane.add(namfld);
		namfld.setColumns(10);
		
		agefld = new JTextField();
		agefld.setColumns(10);
		agefld.setBounds(467, 104, 144, 20);
		contentPane.add(agefld);
		
		doctorfld = new JTextField();
		doctorfld.setColumns(10);
		doctorfld.setBounds(193, 173, 190, 20);
		contentPane.add(doctorfld);
		
		disfld = new JTextField();
		disfld.setColumns(10);
		disfld.setBounds(467, 173, 144, 20);
		contentPane.add(disfld);
		
		med1fld = new JTextField();
		med1fld.setColumns(10);
		med1fld.setBounds(61, 230, 283, 20);
		contentPane.add(med1fld);
		
		JLabel m = new JLabel("Phone:");
		m.setForeground(new Color(240, 248, 255));
		m.setFont(new Font("Sitka Small", Font.BOLD, 15));
		m.setBounds(404, 135, 136, 14);
		contentPane.add(m);
		
		Addfld = new JTextField();
		Addfld.setColumns(10);
		Addfld.setBounds(193, 132, 198, 23);
		contentPane.add(Addfld);
		
		med2fld = new JTextField();
		
		med2fld.setColumns(10);
		med2fld.setBounds(61, 261, 283, 20);
		contentPane.add(med2fld);
		
		syfld = new JTextField();
		syfld.setText("For Syrup.. ");
		syfld.setColumns(10);
		syfld.setBounds(61, 292, 283, 20);
		contentPane.add(syfld);
		
		q1fld = new JTextField();
		q1fld.setColumns(10);
		q1fld.setBounds(354, 230, 57, 20);
		contentPane.add(q1fld);
		
		q2fld = new JTextField();
		q2fld.setColumns(10);
		q2fld.setBounds(354, 261, 57, 20);
		contentPane.add(q2fld);
		
		q3fld = new JTextField();
		q3fld.setColumns(10);
		q3fld.setBounds(354, 292, 57, 20);
		contentPane.add(q3fld);
		
		JLabel lblPs = new JLabel("ps");
		lblPs.setForeground(new Color(240, 248, 255));
		lblPs.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblPs.setBounds(427, 233, 86, 14);
		contentPane.add(lblPs);
		
		JLabel label_2 = new JLabel("ps");
		label_2.setForeground(new Color(240, 248, 255));
		label_2.setFont(new Font("Sitka Small", Font.BOLD, 15));
		label_2.setBounds(427, 264, 86, 14);
		contentPane.add(label_2);
		
		JLabel lblBottle = new JLabel("bottle");
		lblBottle.setForeground(new Color(240, 248, 255));
		lblBottle.setFont(new Font("Sitka Small", Font.BOLD, 15));
		lblBottle.setBounds(427, 295, 86, 14);
		contentPane.add(lblBottle);
		
		JButton btnNewButton = new JButton("BUY NOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				quantity=Integer.parseInt(q1fld.getText());
				P_name = namfld.getText();
				age = Integer.parseInt( agefld.getText());
				D_name = doctorfld.getText();
				Oshukh = disfld.getText();
				Med1 = med1fld.getText();
				Med2 = med2fld.getText();
				Syrup = syfld.getText();
				phone = phonfld .getText();
				add = Addfld.getText();
				
				
				Q2= Integer.parseInt( q2fld.getText());
				Q3= Integer.parseInt( q3fld.getText());
				
				info info2 = new info( phone,add,P_name, age, D_name, Oshukh, Med1, Med2, Syrup, quantity,  Q2, Q3);
				
				FileWriter fw = null;
				BufferedWriter bw = null;
				PrintWriter out = null;
				try {
				    fw = new FileWriter("myfile.txt", true);
				    bw = new BufferedWriter(fw);
				    out = new PrintWriter(bw);
				    out.println(info2.P_name+"\t"+info2.age+"\t"+info2.D_name+"\t"+info2.Oshukh+"\t"+info2.Med1+"\t"+info2.Med2+"\t"+info2.Syrup+"\t"+info2.add+"\t"+info2.total);
				    out.close();
				} catch (IOException e) {
				    //exception handling left as an exercise for the reader
				}
				finally {
				    if(out != null)
					    out.close();
				    try {
				        if(bw != null)
				            bw.close();
				    } catch (IOException e) {
				        //exception handling left as an exercise for the reader
				    }
				    try {
				        if(fw != null)
				            fw.close();
				    } catch (IOException e) {
				        //exception handling left as an exercise for the reader
				    }
				}
				
				
			
				
			}

			private File getUniqueFile(String string, String string2, int i) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		JTextArea see = new JTextArea();
		see.setForeground(new Color(240, 248, 255));
		see.setBackground(new Color(0, 128, 128));
		see.setBounds(147, 330, 312, 120);
		contentPane.add(see);
		
		btnNewButton.setBackground(new Color(240, 248, 255));
		btnNewButton.setBounds(494, 356, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSeeHere = new JButton("Check Out");
		btnSeeHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				phone = phonfld .getText();
				add = Addfld.getText();
				quantity=Integer.parseInt(q1fld.getText());
				P_name = namfld.getText();
				age = Integer.parseInt( agefld.getText());
				D_name = doctorfld.getText();
				Oshukh = disfld.getText();
				Med1 = med1fld.getText();
				Med2 = med2fld.getText();
				Syrup = syfld.getText();
				
				Q2= Integer.parseInt( q2fld.getText());
				Q3= Integer.parseInt( q3fld.getText());
				info info2 = new info( phone, add,P_name, age, D_name, Oshukh, Med1, Med2, Syrup, quantity,  Q2, Q3);
				see.setText(info2.print());
			}
		});
		btnSeeHere.setBackground(new Color(240, 248, 255));
		btnSeeHere.setBounds(48, 356, 89, 36);
		contentPane.add(btnSeeHere);
		
		JButton btnSeeOurProgress = new JButton("See Our Progress");
		btnSeeOurProgress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				table windo =new table();
				windo.setVisible(true);
				
				
			}
		});
		btnSeeOurProgress.setBounds(565, 427, 159, 23);
		contentPane.add(btnSeeOurProgress);
		
		
		
	}
}
