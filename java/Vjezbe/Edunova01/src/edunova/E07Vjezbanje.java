package edunova;

import javax.swing.JOptionPane;

public class E07Vjezbanje {

	// Korisnik unosi decimalni broj
	// Program ispisuje samo decimalni dio broja
	
	public static void main(String[] args) {
		
		String b1= JOptionPane.showInputDialog("Broj1");
		
		double i = Double.parseDouble(b1);
		System.out.println(i);
		
		int j =(int)i;
		System.out.println(j);
		System.out.println(i-j);
		
		
	}
	
}
