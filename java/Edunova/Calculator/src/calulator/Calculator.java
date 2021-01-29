package calulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField txtStandard;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 300, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtStandard = new JTextField();
		txtStandard.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtStandard.setText("STANDARD");
		txtStandard.setBounds(10, 10, 101, 26);
		frame.getContentPane().add(txtStandard);
		txtStandard.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(10, 46, 270, 75);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnPercent.setBounds(10, 131, 60, 60);
		frame.getContentPane().add(btnPercent);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(10, 201, 60, 60);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.setBounds(10, 271, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.setBounds(10, 341, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.setBounds(10, 411, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlusMinus.setBounds(10, 481, 60, 60);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnClearEntry = new JButton("CE");
		btnClearEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClearEntry.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnClearEntry.setBounds(80, 131, 60, 60);
		frame.getContentPane().add(btnClearEntry);
		
		JButton btnSquare = new JButton("X^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;	
				textField.setText("");
				textField.setText(textField.getText()+a);	
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSquare.setBounds(80, 201, 60, 60);
		frame.getContentPane().add(btnSquare);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn8.setBounds(80, 271, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn5.setBounds(80, 341, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.setBounds(80, 411, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(80, 481, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnClear.setBounds(150, 131, 60, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnSquareRoot = new JButton("²√x");
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));	
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSquareRoot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSquareRoot.setBounds(150, 201, 60, 60);
		frame.getContentPane().add(btnSquareRoot);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.setBounds(150, 271, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.setBounds(150, 411, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDot.setBounds(150, 481, 60, 60);
		frame.getContentPane().add(btnDot);
		
		JButton btnbackSpace = new JButton("\uF0E7");
		btnbackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnbackSpace.setFont(new Font("Wingdings", Font.PLAIN, 24));
		btnbackSpace.setBounds(220, 131, 60, 60);
		frame.getContentPane().add(btnbackSpace);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDivide.setBounds(220, 201, 60, 60);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnMul.setBounds(220, 271, 60, 60);
		frame.getContentPane().add(btnMul);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btnSub.setBounds(220, 341, 60, 60);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+\r\n");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnAdd.setBounds(220, 411, 60, 60);
		frame.getContentPane().add(btnAdd);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnEqual.setBounds(220, 481, 60, 60);
		frame.getContentPane().add(btnEqual);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.setBounds(150, 341, 60, 60);
		frame.getContentPane().add(btn6);
	}
}
