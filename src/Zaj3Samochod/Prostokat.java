package Zaj3Samochod;

public class Prostokat {

	private int bokA; // to jest pole klasy
	private int bokB; // to jest pole klasy
	private String kolor; // to jest pole klasy

	Prostokat() {
		this.bokA = 5;
		this.bokB = 6;
		this.kolor = "czerwony";
	}

	Prostokat(int a, int b, String c) {
		this.bokA = a;
		this.bokB = b;
		this.kolor = c;

	}

	public String toString() {
		return "Prostokat o wymiarach " + this.bokA + " x " + this.bokB + " ma kolor " + this.kolor;

	}

}
