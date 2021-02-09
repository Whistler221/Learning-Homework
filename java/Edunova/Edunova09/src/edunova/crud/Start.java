package edunova.crud;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

public class Start {
	
	private List<Smjer> smjerovi;
	private static final String PUTANJA_SMJEROVI="smjerovi.json";

	/*
	 * Izvođenje iz CMD
	 * D:\jp23\eclipse\Edunova09\bin>java  -cp ../lib/gson-2.8.6.jar;. edunova.crud.Start
	 * Program za izradu čarobnjaka za instalacije:
	 * https://nsis.sourceforge.io/Download
	 */
	public Start() {
		smjerovi= new ArrayList<>();
		ucitajSmjerove();
		izbornik();
	}

	private void ucitajSmjerove() {
		if(!new File(PUTANJA_SMJEROVI).exists()) {
			return;
		}
		try {
			Type listType = new TypeToken<List<Smjer>>(){}.getType();
			String json=Files.readString(Path.of(PUTANJA_SMJEROVI));
			smjerovi = new Gson().fromJson(json, listType);
		}catch(Exception e) {
			e.printStackTrace();
			// obvijestiti korisnika
		}
		
		
	}

	private void izbornik() {
		System.out.println("******* EDUNOVA CRUD *********");
		stavkeIzbornika();
		switch (Pomocno.ucitajCijeliBroj("Odaberite akciju",1,5)) {
		case 1:
			smjerIzbornik();
			break;
			// ostale stavke izbornika napraviti
		case 5:
			System.out.println("Doviđenja");
			break;
		}
	}

	private void smjerIzbornik() {
		System.out.println("Rad s smjerovima");
		stavkeSmjerIzbornika();
		switch(Pomocno.ucitajCijeliBroj("Odaberite akciju", 1, 5)) {
		case 1:
			prikaziSmjerove();
			break;
		case 2:
			dodajNoviSmjer();
			break;
		case 3:
			promjeniSmjer();
			break;
		case 4:
			obrisiSmjer();
			break;
		case 5:
			izbornik();
			break;
		}
		
	}

	private void obrisiSmjer() {
		// bilo bi dobro pitati jeste li sigurno
		//var odabir = odaberiSmjer();
		//smjerovi.remove(odabir);
		smjerovi.remove(odaberiSmjer());
		spremi();
		smjerIzbornik();
	}
	
	private int odaberiSmjer() {
		sviSmjerovi();
		return Pomocno.ucitajCijeliBroj("Odaberite redni broj stavke", 1,
				smjerovi.size())-1;
	}

	private void promjeniSmjer() {
		var odabir=odaberiSmjer();
		var s = smjerovi.get(odabir);

		s.setSifra(Pomocno.ucitajCijeliBroj("Šifra (" + s.getSifra() + ")"));
		s.setNaziv(Pomocno.ucitajString("Naziv (" + s.getNaziv() + ")"));
		// Ova linija i nije potrebna. Tu je da pokaže set metodu na List sučelju
		smjerovi.set(odabir, s);
		spremi();
		smjerIzbornik();
	}
	
	

	private void dodajNoviSmjer() {
		Smjer s = new Smjer();
		s.setSifra(Pomocno.ucitajCijeliBroj("Unesi šifru smjera"));
		s.setNaziv(Pomocno.ucitajString("Unesi naziv smjera"));
		s.setGrupe(ucitajGrupe());
		smjerovi.add(s);
		spremi();
		smjerIzbornik();
	}

	private List<Grupa> ucitajGrupe() {
		List<Grupa> grupe = new ArrayList<>();
		
		if(Pomocno.ucitajCijeliBroj("1 za unos grupa")!=1) {
			return grupe;
		}
		Grupa g;
		while(true) {
			System.out.println("Unos nove grupe");
			g=new Grupa();
			g.setNaziv(Pomocno.ucitajString("Naziv grupe"));
			g.setDatumPocetka(Pomocno.ucitajDatum("Unesite datum grupe"));
			grupe.add(g);
			if(Pomocno.ucitajCijeliBroj("0 za prekid unosa grupa")==0) {
				break;
			}
		}
		
		return grupe;
	}

	private void stavkeSmjerIzbornika() {
		System.out.println("1. Prikaži sve smjerove");
		System.out.println("2. Dodaj novi smjer");
		System.out.println("3. Promjeni postojeći smjer");
		System.out.println("4. Obriši postojeći smjer");
		System.out.println("5. Vraćanje na glavni izbornik");
		
	}
	
	private void sviSmjerovi() {
		System.out.println("+++++++++++++++++++++");
		for(int i=0;i<smjerovi.size();i++) {
			var s = smjerovi.get(i);
			System.out.println((i+1) + ". " + s.getNaziv());
			if(s.getGrupe().isEmpty()) {
				continue;
			}
			System.out.println("\tGrupe:");
			for( Grupa g: s.getGrupe()) {
				System.out.println("\t\t" + g.getNaziv());
			}
		}
		System.out.println("+++++++++++++++++++++");
	}

	private void prikaziSmjerove() {
		sviSmjerovi();
		smjerIzbornik();
	}

	private void stavkeIzbornika() {
		System.out.println("1. Smjerovi");
		System.out.println("2. Grupe");
		System.out.println("3. Polaznici");
		System.out.println("4. Predavači");
		System.out.println("5. Izaz");
		
	}
	
	private void spremi() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//System.out.println(gson.toJson(smjerovi));
		
		
		try {
			FileWriter fw = new FileWriter(new File(PUTANJA_SMJEROVI));
			fw.write(gson.toJson(smjerovi));
			fw.close();
			
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Start();
	}

}