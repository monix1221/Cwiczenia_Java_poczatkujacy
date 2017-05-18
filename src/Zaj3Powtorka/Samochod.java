package Zaj3Powtorka;

public class Samochod {
	/*
	 * 5. Stw�rz w�asn� klas� Samoch�d, posiadaj�c� nast�puj�ce pola: producent,
	 * model, przebieg, rok produkcji, kolor, (wiek, numer seryjny), stan. W
	 * konstruktorze upewnij si�, �e wpisane dane s� prawid�owe, w przeciwnym
	 * wypadku ustaw warto�ci na null/0. Wiek powinien by� obliczany na
	 * podstawie bierz�cego roku oraz roku produkcji. Numer seryjny jest
	 * nadawany po kolei stworzonym samochodom. Stan ustaw jako null. Utw�rz
	 * gettery i settery dla koloru oraz stanu.
	 * 
	 * Utw�rz metody rusz oraz zatrzymaj si�, kt�re odpowiednio zmieniaj� stan
	 * na JEDZIE lub STOI. Sprawd� czy stoj�cy samoch�d nie jest ponownie
	 * zatrzymywany itp. W takim wypadku wy�wietl odpowiedni� informacj�.
	 * 
	 */
	private String producent;
	private String model;
	private int przebieg;
	private int rokProdukcji;
	private String kolor;
	private int wiek;
	private String numerSeryjny;
	private String stan;

	Samochod() {
		this.producent = "producent";
		this.model = "model";
		this.przebieg = 0;
		this.rokProdukcji = 0;
		this.kolor = null;
		this.wiek = 0;
		this.numerSeryjny = "numerSeryjny";
		this.stan = "stan";
	}

	Samochod(String producent, String model, int przebieg, int rokProdukcji, String kolor, int wiek,
			String numerSeryjny, String stan) {
		this.producent = producent;
		this.model = model;
		this.przebieg = przebieg;
		this.rokProdukcji = rokProdukcji;
		this.kolor = kolor;
		this.wiek = wiek;
		this.numerSeryjny = numerSeryjny;
		this.stan = stan;
	}

	public String toString() {
		return "Opis samochodu:\n" + "producent: " + this.producent + "\nmodel: " + this.model + "\nprzebieg: "
				+ this.przebieg + "\nrok produkcji: " + this.rokProdukcji + "\nkolor: " + this.kolor + "\nwiek: "
				+ this.wiek + "\nnumer seryjny: " + this.numerSeryjny + "\nstan: " + this.stan;
	}

}
