package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak5 {
	
	// Korisnik unosi cijeli broj
	// Ako je paran broj unesen ispiši Osijek
	// Ako je neparan broj unesen ispiši Zagreb
	
	// koristiti inline if

	
	public static void main(String[] args) {
		
	String a= JOptionPane.showInputDialog("Unesi broj");
		
		int i = Integer.parseInt(a);
		
		System.out.println(i%2==0 ? "Osijek" : "Zagreb");

		
	}
	
}
