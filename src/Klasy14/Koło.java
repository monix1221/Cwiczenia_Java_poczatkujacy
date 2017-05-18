package Klasy14;

public class Ko³o {

	// definiujemy pole:

	// KONSTRUKTORY REKURSYJNE: !!!!!!!!!!!!!!!!!!!!!!!!!!!
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	private double promien;

	// tworzymy pole wspolne dla wszystkich obiektów klasy:

	private int id;
	private static int nextId; // static oznacza, ze pole przynale¿y do klasy, a
								// nie do obiektu
	// takie pole bedzie mieæ postaæ Ko³o.nextId (a nie obiekt.nextID)

	Ko³o() {
		// this.promien=1.0;

		this(1.0);
	}

	Ko³o(double r) {
		this(r, "coœtam");
	}

	public Ko³o(double r, String j) {
		id = nextId;
		nextId++;
		this.promien = r;
		if (j.equals("km")) {
			this.promien = this.promien * 1000;
		}
	}

	// REKURSJA-koniec.

	// mutator - zmienia wartosc pola
	public void setPromien(double r) {
		this.promien = r;
	}

	// akcesor - odczytuje wartosc pola
	public double getPromien() {
		return this.promien;
	}

	public double obliczObwodKola() {
		return 2 * Math.PI * promien;
	}

	public double obliczPoleKola() {
		double pole;
		pole = Math.PI * promien * promien;
		return pole;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {

		Ko³o kolo = new Ko³o(3, "km");
		// Ko³o koleczko = new Ko³o();
		System.out.println("promien kola wynosi " + kolo.getPromien());
		System.out.println("id obiektu kolo wynosi:  " + kolo.getId() + "\n");

		// koleczko.setPromien(1.0);

		// Ko³o kolko=new Ko³o(3.0, "km");

		// ZMIENNE OBIEKTOWE DEFINIOWANE JAKO TABLICOWE:
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		Ko³o[] kó³ka = new Ko³o[3];
		kó³ka[0] = new Ko³o();
		kó³ka[1] = new Ko³o(3.5);
		kó³ka[2] = new Ko³o(7, "km");

		for (Ko³o x : kó³ka) {
			System.out.println("ID wynsi: " + x.getId());
			System.out.println("Obwod kola wynosi " + x.obliczObwodKola());
			System.out.println("Pole kola wynosi " + x.obliczPoleKola());
			System.out.println("promien kola wynosi " + x.getPromien() + "\n");
		}
	}

	static {
		nextId = 1;
	}
}
