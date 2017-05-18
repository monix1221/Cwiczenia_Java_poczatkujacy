package Klasy14;

public class Ko�o {

	// definiujemy pole:

	// KONSTRUKTORY REKURSYJNE: !!!!!!!!!!!!!!!!!!!!!!!!!!!
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	private double promien;

	// tworzymy pole wspolne dla wszystkich obiekt�w klasy:

	private int id;
	private static int nextId; // static oznacza, ze pole przynale�y do klasy, a
								// nie do obiektu
	// takie pole bedzie mie� posta� Ko�o.nextId (a nie obiekt.nextID)

	Ko�o() {
		// this.promien=1.0;

		this(1.0);
	}

	Ko�o(double r) {
		this(r, "co�tam");
	}

	public Ko�o(double r, String j) {
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

		Ko�o kolo = new Ko�o(3, "km");
		// Ko�o koleczko = new Ko�o();
		System.out.println("promien kola wynosi " + kolo.getPromien());
		System.out.println("id obiektu kolo wynosi:  " + kolo.getId() + "\n");

		// koleczko.setPromien(1.0);

		// Ko�o kolko=new Ko�o(3.0, "km");

		// ZMIENNE OBIEKTOWE DEFINIOWANE JAKO TABLICOWE:
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		Ko�o[] k�ka = new Ko�o[3];
		k�ka[0] = new Ko�o();
		k�ka[1] = new Ko�o(3.5);
		k�ka[2] = new Ko�o(7, "km");

		for (Ko�o x : k�ka) {
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
