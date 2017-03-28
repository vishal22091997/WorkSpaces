import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class testWindow {

	private JFrame frame;
	private JTextField textField;
	private int token = 1;
	private boolean actSig = true;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testWindow window = new testWindow();
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
	public testWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 160, 191, 166);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText().toString();
				textField.setText(s+"1");
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_3.setBackground(Color.WHITE);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_5.setBackground(Color.WHITE);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_6.setBackground(Color.WHITE);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_7.setBackground(Color.WHITE);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_8.setBackground(Color.WHITE);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("+/-");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(token == 1){
					token = 0;
					textField.setText("-"+textField.getText());
				}else{
					token = 1;
					textField.setText(textField.getText().toString().substring(1));
				}
			}
		});
		btnNewButton_9.setBackground(Color.WHITE);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_10.setBackground(Color.WHITE);
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton(".");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_11.setBackground(Color.WHITE);
		panel.add(btnNewButton_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 250, 76);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(0, 0, 250, 76);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 75, 250, 86);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JButton btnNewButton_12 = new JButton(String.valueOf(	"\u221A"));
		btnNewButton_12.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_12.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton('x'+String.valueOf("\u00B2"));
		btnNewButton_13.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_13.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton('x'+String.valueOf("\u00B3"));
		btnNewButton_14.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_14.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton(String.valueOf(	"\u2190"));
		btnNewButton_15.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				textField.setText(s.substring(0,s.length()-1));
			}
		});
		btnNewButton_15.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("\u21B6");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_16.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_16.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("(");
		btnNewButton_17.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_17.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton(")");
		btnNewButton_18.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_18.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton(String.valueOf("\u00F7"));
		btnNewButton_19.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+String.valueOf("\u00F7"));
			}
		});
		btnNewButton_19.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_19);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(188, 161, 62, 165);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_21 = new JButton("+");
		btnNewButton_21.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"+");
			}
		});
		btnNewButton_21.setBackground(Color.WHITE);
		panel_3.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("-");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"-");
			}
		});
		btnNewButton_22.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_22.setBackground(Color.WHITE);
		panel_3.add(btnNewButton_22);
		
		JButton btnNewButton_20 = new JButton(String.valueOf("\u00D7"));
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+String.valueOf("\u00D7"));
			}
		});
		btnNewButton_20.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_20.setBackground(Color.WHITE);
		panel_3.add(btnNewButton_20);
		
		JButton btnNewButton_23 = new JButton("=");
		btnNewButton_23.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_23.setBackground(Color.WHITE);
		panel_3.add(btnNewButton_23);
		frame.setBounds(100, 100, 266, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
