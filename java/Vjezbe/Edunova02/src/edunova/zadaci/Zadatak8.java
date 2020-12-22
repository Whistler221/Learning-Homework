package edunova.zadaci;

public class Zadatak8 {
	
	//. Napiši program koji određuje površinu trokuta zadanih stranica.

	public static void main(String[] args) {
		
	float a=3;
	float b=4;
	float c=5;
	
	float s=(a+b+c)/2;
	
	double pov=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
	System.out.println(pov);
	
	
		
	}
}