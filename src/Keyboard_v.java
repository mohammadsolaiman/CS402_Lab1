import java.awt.Color;
import java.awt.EventQueue;
import java.awt.RenderingHints.Key;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;

public class Keyboard_v implements KeyListener {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Keyboard_v window = new Keyboard_v();
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
	public Keyboard_v() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			
		allBtns = new JButton[54];

		frame = new JFrame();
		


		frame.setBounds(100, 100, 691, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		
		textArea.setBounds(10, 11, 655, 193);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("~");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				textArea.setText(textArea.getText()+"~");
				btnNewButton.setBackground(Color.blue);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText(textArea.getText()+"~");
			}
		});

		
		btnNewButton.setBounds(10, 215, 49, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"2");
			}
		});
		
		button_1.setBounds(118, 215, 49, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"3");
			}
		});
		button_2.setBounds(177, 215, 49, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"4");
			}
		});
		button_3.setBounds(235, 215, 49, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"5");
			}
		});
		button_4.setBounds(294, 215, 49, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"6");
			}
		});
		button_5.setBounds(353, 215, 49, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"7");
			}
		});
		button_6.setBounds(412, 215, 49, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"8");
			}
		});
		button_7.setBounds(471, 215, 49, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"9");
			}
		});
		button_8.setBounds(530, 215, 49, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"0");
			}
		});
		button_9.setBounds(589, 215, 49, 23);
		frame.getContentPane().add(button_9);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"1");
			}
		});
		button.setBounds(69, 215, 39, 23);
		frame.getContentPane().add(button);
		
		JButton btnTab = new JButton("Tab");
		btnTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"\t");
			}
		});
		btnTab.setBounds(10, 249, 69, 23);
		frame.getContentPane().add(btnTab);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText()+"Q");
			}
		});
		btnQ.setBounds(89, 249, 49, 23);
		frame.getContentPane().add(btnQ);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(148, 249, 49, 23);
		frame.getContentPane().add(btnW);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(207, 249, 49, 23);
		frame.getContentPane().add(btnE);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(266, 249, 49, 23);
		frame.getContentPane().add(btnR);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(325, 249, 49, 23);
		frame.getContentPane().add(btnT);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(384, 249, 49, 23);
		frame.getContentPane().add(btnY);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(443, 249, 49, 23);
		frame.getContentPane().add(btnU);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(502, 249, 49, 23);
		frame.getContentPane().add(btnI);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(561, 249, 49, 23);
		frame.getContentPane().add(btnO);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(69, 283, 49, 23);
		frame.getContentPane().add(btnA);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(128, 283, 49, 23);
		frame.getContentPane().add(btnS);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(187, 283, 49, 23);
		frame.getContentPane().add(btnD);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(246, 283, 49, 23);
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(305, 283, 49, 23);
		frame.getContentPane().add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(364, 283, 49, 23);
		frame.getContentPane().add(btnH);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(423, 283, 49, 23);
		frame.getContentPane().add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(482, 283, 49, 23);
		frame.getContentPane().add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(541, 283, 49, 23);
		frame.getContentPane().add(btnL);
		
		JButton btnCl = new JButton("CL");
		btnCl.setBounds(10, 283, 49, 23);
		frame.getContentPane().add(btnCl);
		
		JButton btnShift = new JButton("Shift");
		btnShift.setBounds(10, 317, 69, 23);
		frame.getContentPane().add(btnShift);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(89, 317, 49, 23);
		frame.getContentPane().add(btnZ);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(148, 317, 49, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(207, 317, 49, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnV_1 = new JButton("V");
		btnV_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnV_1.setBounds(266, 317, 49, 23);
		frame.getContentPane().add(btnV_1);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(325, 317, 49, 23);
		frame.getContentPane().add(btnB);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(384, 317, 49, 23);
		frame.getContentPane().add(btnN);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(443, 317, 49, 23);
		frame.getContentPane().add(btnM);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(502, 317, 49, 23);
		frame.getContentPane().add(btnP);
		
		JButton btnCtrl = new JButton("Ctrl");
		btnCtrl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCtrl.setBounds(10, 351, 55, 23);
		frame.getContentPane().add(btnCtrl);
		
		JButton btnAlt = new JButton("Alt");
		btnAlt.setBounds(69, 351, 49, 23);
		frame.getContentPane().add(btnAlt);
		
		JButton btnCtrl_1 = new JButton("Ctrl");
		btnCtrl_1.setBounds(530, 351, 55, 23);
		frame.getContentPane().add(btnCtrl_1);
		
		JButton btnAlt_1 = new JButton("Alt");
		btnAlt_1.setBounds(471, 351, 49, 23);
		frame.getContentPane().add(btnAlt_1);
		
		JButton btnShift_1 = new JButton("Shift");
		btnShift_1.setBounds(561, 317, 77, 23);
		frame.getContentPane().add(btnShift_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(589, 351, 76, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnter.setBounds(596, 275, 69, 40);
		frame.getContentPane().add(btnEnter);
		
		JButton button_27 = new JButton("");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_27.setBounds(128, 351, 333, 23);
		frame.getContentPane().add(button_27);
		
		JButton button_36 = new JButton("^");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_36.setBounds(561, 385, 49, 23);
		frame.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("->");
		button_37.setBounds(620, 413, 45, 23);
		frame.getContentPane().add(button_37);
		
		JButton btnV = new JButton("v");
		btnV.setBounds(561, 413, 49, 23);
		frame.getContentPane().add(btnV);
		
		JButton button_39 = new JButton("<-");
		button_39.setBounds(502, 413, 49, 23);
		frame.getContentPane().add(button_39);
		
		
		allBtns[0] = btnNewButton;
		allBtns[1] = button_1;
		allBtns[2] = button_2;
		allBtns[3] = button_3;
		allBtns[4] = button_4;
		allBtns[5] = button_5;
		allBtns[6] = button_6;
		allBtns[7] = button_7;
		allBtns[8] = button_8;
		allBtns[9] = button_9;
		allBtns[10] = button_27;
		allBtns[11] = button_36;
		allBtns[12] = button_37;
		allBtns[13] = button_39;
		allBtns[14] = button;
		allBtns[15] = btnA;
		allBtns[16] = btnB;
		allBtns[17] = btnC;
		allBtns[18] = btnD;
		allBtns[19] = btnE;
		allBtns[20] = btnF;
		allBtns[21] = btnG;
		allBtns[22] = btnH;
		allBtns[23] = btnI;
		allBtns[24] = btnJ;
		allBtns[25] = btnK;
		allBtns[26] = btnL;
		allBtns[27] = btnM;
		allBtns[28] = btnN;
		allBtns[29] = btnO;
		allBtns[30] = btnP;		
		allBtns[31] = btnQ;
		allBtns[32] = btnR;
		allBtns[33] = btnS;
		allBtns[34] = btnT;
		allBtns[35] = btnU;
		allBtns[36] = btnV;
		allBtns[37] = btnW;
		allBtns[38] = btnX;
		allBtns[39] = btnY;
		allBtns[40] = btnZ;
		allBtns[41] = btnAlt;
		allBtns[42] = btnAlt_1;
		allBtns[43] = btnCtrl;
		allBtns[44] = btnCtrl_1;
		allBtns[45] = btnShift;
		allBtns[46] = btnShift_1;
		allBtns[47] = btnEnter;
		allBtns[48] = btnDelete;
		allBtns[49] = btnCl;
		allBtns[50] = btnV_1;
		allBtns[51] = btnTab;
		allBtns[52] = btnNewButton;		
		allBtns[53] = btnNewButton;
		
		for(int i=0;i<allBtns.length; i++){
			allBtns[i].setBackground(Color.LIGHT_GRAY);
		}
		
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				switch(e.getKeyCode()){
				case KeyEvent.VK_SHIFT:
					btnShift.setBackground(Color.CYAN);
					btnShift_1.setBackground(Color.CYAN);
					break;
				case KeyEvent.VK_CONTROL:
					btnCtrl.setBackground(Color.CYAN);
					btnCtrl_1.setBackground(Color.CYAN);
					break;
				case KeyEvent.VK_ALT:
					btnAlt.setBackground(Color.CYAN);
					btnAlt_1.setBackground(Color.CYAN);
					break;
				case KeyEvent.VK_DELETE:
					btnDelete.setBackground(Color.CYAN);
					break;
				case KeyEvent.VK_RIGHT:
					button_37.setBackground(Color.CYAN);
					break;
				case KeyEvent.VK_LEFT:
					button_39.setBackground(Color.CYAN);
					break;
				case KeyEvent.VK_UP:
					button_36.setBackground(Color.CYAN);
					break;
				case KeyEvent.VK_DOWN:
					btnV.setBackground(Color.CYAN);
					break;
					
				}
				
				char key = e.getKeyChar();
			System.out.println("Key : "+key);
				switch (key){
				case ('`'|'~'):
					btnNewButton.setBackground(Color.CYAN);
					break;
				case('1'):
					button.setBackground(Color.CYAN);
					break;
				case('2'):
					button_1.setBackground(Color.CYAN);
					break;
				case('3'):
					button_2.setBackground(Color.CYAN);
					break;
				case('4'):
					button_3.setBackground(Color.CYAN);
					break;
				case('5'):
					button_4.setBackground(Color.CYAN);
					break;
				case('6'):
					button_5.setBackground(Color.CYAN);
					break;
				case('7'):
					button_6.setBackground(Color.CYAN);
					break;
				case('8'):
					button_7.setBackground(Color.CYAN);
					break;
				case('9'):
					btnNewButton.setBackground(Color.CYAN);
					break;
				case('0'):
					btnNewButton.setBackground(Color.CYAN);
					break;
				case('q'|'Q'):
					btnQ.setBackground(Color.CYAN);
					break;
				case('w'|'W'):
					btnW.setBackground(Color.CYAN);
					break;
				case('e'|'E'):
					btnE.setBackground(Color.CYAN);
					break;
				case('r'|'R'):
					btnR.setBackground(Color.CYAN);
					break;
				case('t'|'T'):
					btnT.setBackground(Color.CYAN);
					break;
				case('y'|'Y'):
					btnY.setBackground(Color.CYAN);
					break;
				case('u'|'U'):
					btnU.setBackground(Color.CYAN);
					break;
				case('i'|'I'):
					btnI.setBackground(Color.CYAN);
					break;
				case('o'|'O'):
					btnO.setBackground(Color.CYAN);
					break;
				case('p'|'P'):
					btnP.setBackground(Color.CYAN);
					break;
				case('a'|'A'):
					btnA.setBackground(Color.CYAN);
					break;
				case('s'|'S'):
					btnS.setBackground(Color.CYAN);
					break;
				case('d'|'D'):
					btnD.setBackground(Color.CYAN);
					break;
				case('f'|'F'):
					btnF.setBackground(Color.CYAN);
					break;
				case('g'|'G'):
					btnG.setBackground(Color.CYAN);
					break;
				case('h'|'H'):
					btnH.setBackground(Color.CYAN);
					break;
				case('j'|'J'):
					btnJ.setBackground(Color.CYAN);
					break;
				case('k'|'K'):
					btnK.setBackground(Color.CYAN);
					break;
				case('l'|'L'):
					btnL.setBackground(Color.CYAN);
					break;
				case('z'|'Z'):
					btnZ.setBackground(Color.CYAN);
					break;
				case('x'|'X'):
					btnX.setBackground(Color.CYAN);
					break;
				case('c'|'C'):
					btnC.setBackground(Color.CYAN);
					break;
				case('v'|'V'):
					btnV.setBackground(Color.CYAN);
					break;
				case('b'|'B'):
					btnB.setBackground(Color.CYAN);
					break;
				case('n'|'N'):
					btnN.setBackground(Color.CYAN);
					break;
				case('m'|'M'):
					btnM.setBackground(Color.CYAN);
					break;
				case(' '):
					button_27.setBackground(Color.CYAN);
					break;
				case('\t'):
					btnTab.setBackground(Color.CYAN);
					break;
				case('\n'):
					btnEnter.setBackground(Color.CYAN);
					break;
				
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				for(int i=0;i<allBtns.length; i++){
					allBtns[i].setBackground(Color.LIGHT_GRAY);
				}
			}
		});
		
		
	}

	private char pressedChar ;
	private JButton[] allBtns;
	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
