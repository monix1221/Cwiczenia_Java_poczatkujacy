package Zaj3Powtorka;

public class Prosto {

	private int bokA;
	private int bokB;
	private String kolor;

	// KONSTRUKTOR:

	Prosto() {
		this.bokA = 5;
		this.bokB = 4;
		this.kolor = "czerwony";
	}
	/*
	 * Prosto(int a, int b, String c){ this.bokA=a; this.bokB=b; this.kolor=c; }
	 */

	// sprawdzanie czy podano dobre dane:
	public static boolean czyPoprawneDane(int a, int b, String kolor) {
		if (a <= 0 || b <= 0 || kolor == null || kolor.isEmpty()) {
			return false;
		} else
			return true;
	}

	// poni¿ej nowy konstruktor:
	Prosto(int a, int b, String kolor) {
		if (czyPoprawneDane(a, b, kolor)) {
			this.bokA = a;
			this.bokB = b;
			this.kolor = kolor;
		} else {
			this.bokA = 0;
			this.bokB = 0;
			this.kolor = null;
		}
	}

	// GETTERY I SETTERY:

	public String getKolor() {
		return this.kolor;
	}

	public int getBokA() {
		return this.bokA;
	}

	public int getBokB() {
		return this.bokB;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public void setBokA(int a) {
		this.bokA = a;
	}

	public void setBokB(int b) {
		this.bokB = b;
	}

	/*
	 * 4. Napisz dwie metody: jedna ma zwracaæ pole kwadratu, druga przypisywaæ
	 * t¹ wartoœæ zmiennej.
	 */

	public int oblPoleKwa(int a) {
		return this.bokA * this.bokA;
	}

	private int pole;

	public int getPoleKwa() {
		return this.pole;
	}

	public void setPoleKwa(int a) {
		this.pole = a;
	}

	public String toString() {
		return "Prostokat o wymiarach " + this.bokA + " x " + this.bokB + " ma kolor " + this.kolor;

	}

}
