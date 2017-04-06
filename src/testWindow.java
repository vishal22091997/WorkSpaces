import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JScrollBar;
import java.awt.Window.Type;

public class testWindow extends JFrame{

	private JFrame frmCalvish;
	private JTextField textField;
	private int token = 1;
	private boolean actSig = true;
	private static HashMap<String, Integer> map = new HashMap<String, Integer>();
	private static List<String> history = new ArrayList<String>();
	private int cbra = 0;
	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testWindow window = new testWindow();
					// Making the Key value pair so as to calculate the precidence
					map.put("+",1);
					map.put("(", 0);
					map.put("-", 1);
					map.put("\u00F7",2);//division
					map.put("\u00D7", 2);//multiplication
					
					
					
					
					///till here
					window.frmCalvish.setVisible(true);
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
		frmCalvish = new JFrame();
		frmCalvish.setTitle("Calculator");
		frmCalvish.setResizable(false);
		frmCalvish.getContentPane().setBackground(Color.WHITE);
		frmCalvish.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 160, 187, 166);
		frmCalvish.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
	
		
		
		
		
		
		
		//
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText().toString();
				textField.setText(s+"1");
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(Color.WHITE);
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
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(Color.WHITE);
				
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
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_2.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setBackground(Color.WHITE);
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
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_3.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_3.setBackground(Color.WHITE);
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
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_4.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_4.setBackground(Color.WHITE);
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
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_5.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_5.setBackground(Color.WHITE);
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
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_6.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_6.setBackground(Color.WHITE);
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
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_7.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_7.setBackground(Color.WHITE);
			}
		});
		btnNewButton_7.setBackground(Color.WHITE);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_8.setBackground(new Color(223, 220, 219  ));
			}
			public void mouseExited(MouseEvent e) {
				btnNewButton_8.setBackground(Color.WHITE);
			}
		});
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_7.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_7.setBackground(Color.WHITE);
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
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_9.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_9.setBackground(Color.WHITE);
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
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_10.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_10.setBackground(Color.WHITE);
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
		btnNewButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_11.setBackground(new Color(223, 220, 219  ));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_11.setBackground(Color.WHITE);
			}
		});
		btnNewButton_11.setBackground(Color.WHITE);
		panel.add(btnNewButton_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 250, 76);
		frmCalvish.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(0, 0, 250, 76);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 75, 250, 86);
		frmCalvish.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JButton btnNewButton_16 = new JButton("\u21B6");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				History hist = new History(history);
				hist.setVisible(true);
			}
		});
		btnNewButton_16.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_16.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_16);
		JButton btnNewButton_17 = new JButton("(");
		JButton btnNewButton_18 = new JButton(")");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbra++;
				if(cbra>0){
					btnNewButton_18.setEnabled(true);
					textField.setText(textField.getText()+"(");
				}
			}
		});
		
		JButton btnNewButton_15 = new JButton(String.valueOf(	"\u2190"));
		btnNewButton_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_15.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				btnNewButton_15.setBackground(Color.WHITE);
			}
		});
		btnNewButton_15.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				if(s.length()>0){
					textField.setText(s.substring(0,s.length()-1));
				}
			}
		});
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}
		});
		btnCe.setBackground(Color.WHITE);
		panel_2.add(btnCe);
		btnNewButton_15.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_15);
		btnNewButton_17.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_17.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_17);
		
		
		btnNewButton_18.setEnabled(false);
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				cbra--;
				if(cbra==0){
					btnNewButton_18.setEnabled(false);
				}
				textField.setText(textField.getText()+")");
			}
		});
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
		btnNewButton_19.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				btnNewButton_19.setBackground(Color.WHITE);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				btnNewButton_19.setBackground(Color.GRAY);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(186, 161, 64, 165);
		frmCalvish.getContentPane().add(panel_3);
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
		btnNewButton_21.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent a){
				btnNewButton_21.setBackground(Color.GRAY);
			}
public void mouseExited(MouseEvent a){
				btnNewButton_21.setBackground(Color.WHITE);
			}
		});
		JButton btnNewButton_22 = new JButton("-");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"-");
			}
		});
		btnNewButton_22.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent a){
				btnNewButton_22.setBackground(Color.GRAY);
			}
public void mouseExited(MouseEvent a){
				btnNewButton_22.setBackground(Color.WHITE);
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
		btnNewButton_20.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent a){
				btnNewButton_20.setBackground(Color.GRAY);
			}
public void mouseExited(MouseEvent a){
				btnNewButton_20.setBackground(Color.WHITE);
			}
		});
		JButton btnNewButton_23 = new JButton("=");
		btnNewButton_23.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent a){
				btnNewButton_23.setBackground(Color.GREEN);
			}
public void mouseExited(MouseEvent a){
				btnNewButton_23.setBackground(Color.WHITE);
			}
		});
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				Queue<String> queue = parseText(text);
				System.out.println(queue);
				Queue<String> post = convertToPost(queue);
				System.out.println(post);
				double solution = calculateSolution(post);
				textField.setText(String.valueOf(solution));
				String finalSol = text+" = "+solution;
				history.add(finalSol);
			}
			
		//	map.put("\u00F7",2);//division "\u00F7"
		//	map.put("\u00D7", 2);//multiplication "\u00D7"
			private void errorMessage(String text){
				JOptionPane.showMessageDialog(null, text);
			}
			
			private Queue<String> parseText(String text){
				Queue<String> sol = new LinkedList<String>();
				int last = -1;
				String c = String.valueOf(text.charAt(0));
				String temp = "";
				if(c.equals(")")||c.equals("\u00F7")||c.equals("\u00D7")){
					errorMessage("Syntax Error");
				}else{
					if(c.equals("+")||c.equals("-")){
						last = 3;
						temp = c;			
					}else if(c.equals("(")){
						last =	 1;
						sol.add(c);
					}else{
						temp = c;
						last = 2;
					}
				}
				int len = text.length();
				for(int i=1;i<len;i++){
					String s = String.valueOf(text.charAt(i));
					if(s.equals("(")){
							if(last == 2||last==5){
								sol.add("\u00D7");	
							}
							sol.add(s);
							last = 1;
					}else if(s.equals("+")||s.equals("-")){
						if(last==1){
							temp="";
							temp+=s;
						}else if(last==2){
							sol.add(temp);
							temp = "";
							sol.add(s);
						}else if(last == 3||last==4){
							temp = "";
							temp += s;
						}else if(last==5){
							sol.add(s);
						}
						last=3;
					}else if(s.equals("\u00F7")||s.equals("\u00D7")){
						if(last==1||last==3||last==4){
							errorMessage("Syntax Error");
						}else if(last==2||last==5){
							sol.add(temp);
							temp = "";
							sol.add(s);
							
						}
						last=4;
					}else if(s.equals(")")) {
						if(last==1||last==3||last==4){
							errorMessage("Syntax Error");
						}else if(last==2||last==5){
							sol.add(temp);
							sol.add(s);
							temp = "";
						}
						last=5;
					}else{
						if(last==1||last==2||last==3||last==4){
							temp += s;
						}else if(last==5){
							sol.add("\u00D7");
							temp+=s;
						}
						last=2;
					}
					
					
					
					
				}
				if(temp.length()>0)
					sol.add(temp);
				return sol;
			}
			private void ats(String text){
				
			}
			private boolean checkPrecidence(String temp, String cur){
				// TODO Auto-generated method stub
				
				if(map.get(temp)>=map.get(cur)){
					return true;
				}
				else{
					return false;
				}
				 
				
				
				
			}

			private Queue<String> convertToPost(Queue<String> queue) {
				Queue<String> post = new LinkedList<String>();
				Stack<String> temp = new Stack<String>();
				while(!queue.isEmpty()){
					String cur = queue.poll();
					if(cur.equals("(")){
						temp.push(cur);
					}else if(cur.equals(")")){
						while(!temp.peek().equals("(")){
							post.add(temp.pop());
						}
						temp.pop();
					}else if(cur.equals("\u00D7") || cur.equals("\u00F7") || cur.equals("-") || 
							cur.equals("+") || cur.equals("\u00D7")){
						System.out.println(cur+" "+temp.size());
						// check if the precedence of operator on top of stack is greater or not
						if(!temp.isEmpty()){
							while(!temp.isEmpty()&&checkPrecidence(temp.peek(), cur)){
								// if precedence of top element is greater or equal then we have to push it to the queue 
								post.add(temp.pop());
								
							}
						}
						temp.push(cur);
						
						}else{
							post.add(cur);
						}
					}
				while(!temp.isEmpty()&&!(temp.peek().equals("(")||temp.peek().equals(")"))){
					System.out.println("Entered");
					post.add(temp.pop());
				}
				
				return post;
			}
			private double calculateSolution(Queue<String> post) {
				// TODO Auto-generated method stub
				Stack<String> temp = new Stack<String>();
				while(!post.isEmpty()){
					String c = post.poll();
					if(c.equals("\u00D7") || c.equals("\u00F7") || c.equals("-") || 
							c.equals("+") || c.equals("\u00D7")){
						double a = Double.parseDouble(temp.pop());
						double b = Double.parseDouble(temp.pop());
						System.out.println(a+" "+b);
						double sol = 0;
						System.out.println(c);
						if(c.equals("+")){
							// Addition of two happens here
							sol = a+b;
						}else if(c.equals("-")){
							// subtraction of two happens here
							sol = b-a;
						}else if(c.equals(	"\u00F7")){
							//division of the two happens here
							sol = b/a;
						}else if(c.equals("\u00D7")){
							//multiplication of two happens here
							sol = b*a;	
						}else {
							System.out.println(c);
						}
						temp.push(String.valueOf(sol));
					}else {
						temp.push(c);
						
					}
				 }
				
				
				if(temp.isEmpty()){
					return 0;
				}else{
					return Double.parseDouble(temp.peek());
				}
			}
		});
		
		btnNewButton_23.setFont(new Font("Dialog", Font.PLAIN, 19));
		btnNewButton_23.setBackground(Color.WHITE);
		panel_3.add(btnNewButton_23);
		frmCalvish.setBounds(100, 100, 253, 354);
		frmCalvish.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
