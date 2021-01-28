package edunova.obradapogresaka;

import javax.swing.JOptionPane;

public class TryCatch {
	
	public TryCatch() {
		
		Integer.parseInt("");
		
		try {
			int i=Integer.parseInt(
					JOptionPane.showInputDialog("Unesi broj"));
			
			System.out.println(i);
		}catch(Exception e) {
			System.out.println("Niste unijeli broj");
		}
		
		//primjer1();
		//primjer2();
		//primjer3();
		primjer4();
		
	}
	
	private void primjer4() {
		
		try {
			bacaIznimku(1);
		} catch (MojaIznimka e) {
			System.out.println(e.getPoruka());
		}
		
	}

	private void bacaIznimku(int i) throws MojaIznimka {
		
		if(i==1) {
			MojaIznimka m = new MojaIznimka();
			m.setPoruka("Poslao si broj 1 a to ne smiješ");
			throw m;
		}
	}
	
	private void primjer3() {
		int niz[] = new int[2];
		try {
			niz[1]=1/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nije dobar index");
		} catch (NumberFormatException e) {
			System.out.println("Nije broj");
		} catch (ArithmeticException | StackOverflowError e) {
			System.out.println("Obrađuje dvije navedene iznimke");
		} 
		catch (Exception e) {
			// ispisuje poruku ali program ne puca
			e.printStackTrace();
		}
		
		
	}
	

	private void primjer2() {
		// osnovni dio
		// otvori vezu na bazu
		try {
			// OVO SE UVIJEK IZVODI
			// izvedi upit
			// osnovni dio
		} catch (Exception e) {
			// OVO SE IZVODI AKO SE DOGODI NAVEDENA IZNIMKA
			// puknuo je upit
			
			
			// opcionalni
		}finally {
			// OVO SE UVIJEK IZVODI
			// zatvori vezu na bazu
		}
		
	}

	private void primjer1() {
		while(true) {
			try {
				int i=Integer.parseInt(
						JOptionPane.showInputDialog("Unesi broj"));
				System.out.println(i);
				break;
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null,"Niste unijeli broj");
			}
		}
		
	}

	public static void main(String[] args) {
		new TryCatch();
	}

}