

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.SystemColor;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Activity3 {

	private JFrame frame;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Activity3 window = new Activity3();
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
	public Activity3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.getContentPane().setBackground(new Color(72, 61, 139));
		frame.getContentPane().setLayout(null);
		
		JLabel lblLofatBurgers = new JLabel("Lo-Fat Burgers");
		lblLofatBurgers.setHorizontalAlignment(SwingConstants.CENTER);
		lblLofatBurgers.setForeground(new Color(240, 128, 128));
		lblLofatBurgers.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 20));
		lblLofatBurgers.setBounds(179, 31, 257, 94);
		frame.getContentPane().add(lblLofatBurgers);
		
		JLabel lblNewLabel = new JLabel("MyJava");
		lblNewLabel.setBounds(36, 11, 440, 84);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(240, 128, 128));
		lblNewLabel.setFont(new Font("Malatan DEMO", Font.BOLD, 50));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(153, 102, 153));
		panel.setBounds(36, 46, 454, 338);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JList xlist = new JList();
		xlist.setForeground(new Color(255, 204, 0));
		xlist.setBorder(null);
		xlist.setFont(new Font("Tahoma", Font.BOLD, 12));
		xlist.setBackground(new Color(153, 102, 153));
		xlist.setBounds(76, 215, 109, 112);
		panel.add(xlist);
		
		JList ylist = new JList();
		ylist.setForeground(new Color(255, 204, 0));
		ylist.setFont(new Font("Tahoma", Font.BOLD, 12));
		ylist.setBorder(null);
		ylist.setBackground(new Color(153, 102, 153));
		ylist.setBounds(187, 216, 178, 112);
		panel.add(ylist);
		
		JLabel lblNewLabel_1 = new JLabel("Regular Hours Worked:");
		lblNewLabel_1.setBounds(76, 80, 163, 31);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(255, 204, 102));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblNewLabel_1_1 = new JLabel("Overtime:");
		lblNewLabel_1_1.setForeground(new Color(255, 204, 102));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(76, 110, 163, 31);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Total Sales:");
		lblNewLabel_1_2.setForeground(new Color(255, 204, 102));
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(76, 142, 163, 31);
		panel.add(lblNewLabel_1_2);
		
		JButton btnSalary = new JButton("Count Salary");
		btnSalary.setEnabled(false);
		
		text1 = new JTextField();
		text1.addKeyListener(new KeyAdapter() {
			/**@Override
			public void keyReleased(KeyEvent e) {
				if (text1.getText().length()>0) {
					btnSalary.setEnabled(true);
				}
				else {
					btnSalary.setEnabled(false);
				}
			}**/
			@Override
			public void keyPressed(KeyEvent e) {
				
				char num = e.getKeyChar();
				
				if ((Character.isDigit(num))||(num==KeyEvent.VK_BACK_SPACE)) {
					text1.setEditable(true);
				}
				else {
					text1.setEditable(false);
				}
			}
			
		});
		text1.setBackground(new Color(255, 239, 213));
		text1.setFont(new Font("Arial", Font.PLAIN, 12));
		text1.setBounds(249, 85, 129, 20);
		panel.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char num = e.getKeyChar();
				
				if ((Character.isDigit(num))||(num==KeyEvent.VK_BACK_SPACE)) {
					text2.setEditable(true);
				}
				else {
					text2.setEditable(false);
				}
			}
		});
		text2.setFont(new Font("Arial", Font.PLAIN, 12));
		text2.setColumns(10);
		text2.setBackground(new Color(255, 239, 213));
		text2.setBounds(249, 115, 129, 20);
		panel.add(text2);
		
		text3 = new JTextField();
		text3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(text1.getText().length()>0) {
					if (text2.getText().length()>0) {
						if (text3.getText().length()>0) {
							btnSalary.setEnabled(true);
						}
						else {
							btnSalary.setEnabled(false);
						}
					}
					else {
						btnSalary.setEnabled(false);
					}
				}
				else {
					btnSalary.setEnabled(false);
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				char num = e.getKeyChar();
				
				if ((Character.isDigit(num))||(num==KeyEvent.VK_BACK_SPACE)) {
					text3.setEditable(true);
				}
				else {
					text3.setEditable(false);
				}
			}
		});
		text3.setFont(new Font("Arial", Font.PLAIN, 12));
		text3.setColumns(10);
		text3.setBackground(new Color(255, 239, 213));
		text3.setBounds(249, 147, 129, 20);
		panel.add(text3);
		
		
		
		
		
		@SuppressWarnings("rawtypes")
		DefaultListModel x = new DefaultListModel();
		@SuppressWarnings("rawtypes")
		DefaultListModel y = new DefaultListModel();
		

		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
				btnReset.setVisible(false);
				x.clear();
				y.clear();
					
			}
		});
		btnReset.setVisible(false);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBackground(new Color(240, 128, 128));
		btnReset.setBounds(367, 304, 77, 23);
		panel.add(btnReset);
		frame.setBounds(100, 100, 543, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		btnSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnReset.setVisible(true);
				btnSalary.setEnabled(false);
				
				double hours = Double.parseDouble(text1.getText());
				double ot = Double.parseDouble(text2.getText());
				double tsales = Double.parseDouble(text3.getText());
				double wage = 7.25, op = 1.5, tsal=hours*wage, top=op*(ot*wage);
				
				xlist.setModel(x);
				ylist.setModel(y);
				x.addElement("Regular Salary:");
				y.addElement("$ " + tsal);
				x.addElement("Overtime Pay:");
				y.addElement("$ " + top);
				
				if ((tsales>=1.00)&&(tsales<=99.99)) {
					double comm = tsales*0.5;

					x.addElement("Commission:");
					y.addElement("$ " + comm);
					x.addElement("Total Salary:");
					y.addElement("$ " + (tsal+top+comm));
				}
				else if ((tsales>=100.00)&&(tsales<=299.99)) {
					double comm = tsales*0.10;

					x.addElement("Commission:");
					y.addElement("$ " + comm);
					x.addElement("Total Salary:");
					y.addElement("$ " + (tsal+top+comm));
					
				}
				else if (tsales>=300.00) {
					double comm = tsales*0.15;

					x.addElement("Commission:");
					y.addElement("$ " + comm);
					x.addElement("Total Salary:");
					y.addElement("$ " + (tsal+top+comm));
					
				}
				else{
					double comm = 0;
					x.addElement("Commission:");
					y.addElement("$ " + comm);
					x.addElement("Total Salary:");
					y.addElement("$ " + (tsal+top+comm));
				}

			}
		});
		btnSalary.setBackground(new Color(240, 128, 128));
		btnSalary.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalary.setBounds(329, 178, 115, 23);
		panel.add(btnSalary);
		
		JLabel lblNewLabel_2 = new JLabel("*Only number is allowed to enter.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(88, 66, 173, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DICT 2-1 <TEAM 1>");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.BOLD, 10));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(36, 387, 454, 19);
		frame.getContentPane().add(lblNewLabel_3);


		
		
	}
}
