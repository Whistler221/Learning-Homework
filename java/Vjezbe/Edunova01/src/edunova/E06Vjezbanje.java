package edunova;

import javax.swing.JOptionPane;

public class E06Vjezbanje {

	// Korisnik unosi decimalni broj
	// program ispisuje samo cijeli dio broja
	
	public static void main(String[] args) {
		
		
		String unionKorisnik=JOptionPane.showInputDialog("Unesi broj");
		
		float f=Float.parseFloat(unionKorisnik);
		int g=(int)f;
		
		System.out.println(g);
		
	}
	
}
