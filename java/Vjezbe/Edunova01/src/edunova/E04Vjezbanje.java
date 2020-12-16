package edunova;

import javax.swing.JOptionPane;

public class E04Vjezbanje {
	
	// Korisnik unosi dva cijela broja
	// Program ispisuje brojeve jedan pored drugog.
	
	public static void main(String[] args) {
		
		String b1= JOptionPane.showInputDialog("Broj1");
		
		int i = Integer.parseInt(b1);
		
		String b2= JOptionPane.showInputDialog("Broj2");
		
		int j = Integer.parseInt(b2);
		
		System.out.println(i+" "+j);
		
	}
	
	
}
