package edunova05;

public class E06Rekurzija {
	
	// Rekurzija je kada metoda zove samu sebe
	// uz uvijet izlaska iz rekurzije

	public static void main(String[] args) {
		int zbroj=0;
		for(int i=0;i<=100;i++) {
			zbroj+=i;
		}
		System.out.println(zbroj);
		
		System.out.println(zbroj(100));
	}
	
	// primitivni skolski primjer
	
	static int zbroj(int broj) {
		if(broj==0) {
			return 0;
		}
		return broj + zbroj(broj-1);
	}
}
