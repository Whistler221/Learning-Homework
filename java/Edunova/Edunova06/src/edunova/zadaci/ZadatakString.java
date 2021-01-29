package edunova.zadaci;

import javax.swing.JOptionPane;

public class ZadatakString {

	// Korisnik Ucitajte 5 naziva gradova u niz Stringova
	// ispisite sve nazive gradova jednog ispod drug u nazad
	
	// primjer Osijek -> kejisO
	
	public static void main(String[] args) {
		
		String popis[] = new String[5];
		
		for(int i=0;i<popis.length;i++) {
			popis[i]= JOptionPane.showInputDialog("Grad #" + i + 1);
			
		}
		
		for(String grad:popis) {
			System.out.println(grad);
			for(int i=grad.length()-1;i>=0;i--) {
				System.out.println(grad.charAt(i));
				
			}
			System.out.println();
			
		}
	}
}
