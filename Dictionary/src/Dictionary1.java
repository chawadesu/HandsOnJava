import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Dictionary1 extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dictionary1 frame = new Dictionary1();
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
	public Dictionary1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(103, 45, 245, 36);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(103, 104, 245, 36);
		contentPane.add(txt2);
		
		JLabel lblWord = new JLabel("Word");
		lblWord.setBounds(30, 55, 61, 16);
		contentPane.add(lblWord);
		
		JLabel lblMeaning = new JLabel("Meaning");
		lblMeaning.setBounds(30, 114, 61, 16);
		contentPane.add(lblMeaning);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				File f = new File ("/Users/username/Desktop/xx.txt");
				FileOutputStream outs; 
				PrintWriter pw = null;
				try 
				{
					outs = new FileOutputStream(f, true);
					pw = new PrintWriter(outs);
					pw.println(txt1.getText()+ "," +txt2.getText());
					pw.close();
				} 
				catch (FileNotFoundException e) 
				{
					e.printStackTrace();
				}
			}
		});
		btnOk.setBounds(167, 179, 117, 29);
		contentPane.add(btnOk);
	}
}
