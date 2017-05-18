package Zaj3Powtorka;

public class Samochod {
	/*
	 * 5. Stwórz w³asn¹ klasê Samochód, posiadaj¹c¹ nastêpuj¹ce pola: producent,
	 * model, przebieg, rok produkcji, kolor, (wiek, numer seryjny), stan. W
	 * konstruktorze upewnij siê, ¿e wpisane dane s¹ prawid³owe, w przeciwnym
	 * wypadku ustaw wartoœci na null/0. Wiek powinien byæ obliczany na
	 * podstawie bierz¹cego roku oraz roku produkcji. Numer seryjny jest
	 * nadawany po kolei stworzonym samochodom. Stan ustaw jako null. Utwórz
	 * gettery i settery dla koloru oraz stanu.
	 * 
	 * Utwórz metody rusz oraz zatrzymaj siê, które odpowiednio zmieniaj¹ stan
	 * na JEDZIE lub STOI. SprawdŸ czy stoj¹cy samochód nie jest ponownie
	 * zatrzymywany itp. W takim wypadku wyœwietl odpowiedni¹ informacjê.
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
