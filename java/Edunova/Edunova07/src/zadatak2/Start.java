package zadatak2;

public class Start {
	
	// Kreirajte paket zadatak2
	// Kreirajte model klasa koji opisuje svijet flore i faune
	// na minimalno 4 razine nasljeđivanja
	// na svakoj razini nasljeđivanja u klasi definirajte minimalno 2 svojstva
	// Instancijrajte svaku od kreiranih najnižih klasa
	// klase na višoj razini proglasite apstraktnima

	
	
	public Start() {
		
		Name nameTribe = new Name("Fallow deer");
		
		
		Kind kind = new Kind(nameTribe);
		kind.setNameKingdom(new Name("Animalia"));
		
		Habitat habitat = new Habitat(" woodlands, deciduous forests, "
			+ "mixed forests, marshes, meadows, and agricultural areas");
		
		Tribe tribe = new Tribe(new Name("Dama"));
		tribe.setHabitat(habitat);
		
		System.out.printf("Kind %s is Tribe%s.",kind.getNameKind().getEnglishName(),nameTribe.getEnglishName());
		System.out.println();
							
	}
	
	public static void main(String[] args) {
		
	}
	

}
