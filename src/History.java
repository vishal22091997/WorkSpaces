import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JScrollPane;

public class History extends JFrame {
	private static  List<String> history;
	private JPanel contentPane;
	public History(List<String> history){
		setTitle("History");
		
		History.history = history;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 434, 261);
		contentPane.add(textArea);
		int len = history.size();
		if(len>0){
			for(int i=len-1,j=1;i>=0;i--,j++){
				textArea.append(j+".) "+history.get(i)+"\n");
			}
		}else{
			textArea.setText("\n\n\n\n\n\n\\n\n\n\n\n\n\n\n\n\n\nnn\n\n\n\nNo history Available");
		};
		
	}
}
