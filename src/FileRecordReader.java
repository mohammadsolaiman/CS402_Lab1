import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class FileRecordReader {

	private JFrame frame;
	private JTextField filePath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileRecordReader window = new FileRecordReader();
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
	public FileRecordReader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	String fileName = "input.txt";
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea out = new JTextArea();
		out.setBounds(10, 79, 414, 171);
		frame.getContentPane().add(out);
		
		filePath = new JTextField();
		filePath.setBounds(10, 11, 324, 29);
		frame.getContentPane().add(filePath);
		filePath.setColumns(10);
		
		JButton run = new JButton("RUN");
		run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File input = new File("input.txt");
				try {
					Scanner sc = new Scanner(input);
					String nextLine="";
					while (sc.hasNextLine()){
						nextLine = sc.nextLine();
						String currLine="";
						Scanner sc2 = new Scanner(nextLine);
						while(sc2.hasNext()){
							currLine += sc2.next().charAt(0);
						}
						out.setText(out.getText()+currLine+'\n');
						
					}
					sc.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		run.setBounds(346, 10, 78, 58);
		frame.getContentPane().add(run);
		
		filePath.setText(fileName);
		
	}
}
