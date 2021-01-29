package zadatci;

public class Zadatak04 {
	
	// Kreirati metodu tipa int naziva suma koja prima
	// jedan parametar koji je tipa niz cijelih brojeva (int[])
	// metoda vraca sumu svih elemenata primljenog niza
	
	// Prikazati poziv metode tako da ispisani rezultat bude 12
	
	public static void main(String[] args) {
		
		int[] niz = { 10, 2 };
		
		System.out.println(suma(niz));
	}
	
	static int suma(int[] array) {
		int suma =0;
		
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		
		return suma;
	}
}
