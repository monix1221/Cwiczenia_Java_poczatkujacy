package Zaj3Powtorka;

public class Data {
	/*
	 * HW1 Stw�rz klas� o nazwie Data. Konstruktor przyjmuje dzie�, miesi�c i
	 * rok. Sprawd�, z pomoc� metody, czy wprowadzone dane s� poprawne. Stw�rz
	 * klas�, kt�ra jako argumenty b�dzie przyjmowa� dzie�, miesi�c, rok, kt�re
	 * b�dzie dodawa�a do utworzonej wcze�nej daty.
	 */
	private int dzien;
	private int miesiac;
	private int rok;

	Data() {
		this.dzien = 0;
		this.miesiac = 0;
		this.rok = 0;
	}

	Data(int d, int m, int r) {
		if (czyDobreDane(d, m, r)) {
			this.dzien = d;
			this.miesiac = m;
			this.rok = r;
		} else {
			System.out.println("Niepoprawne dane");
			this.dzien = 0;
			this.miesiac = 0;
			this.rok = 0;
		}
	}

	public static boolean czyDobreDane(int a, int b, int c) {
		if (a <= 0 || a > 31 || b <= 0 || b > 12 || c <= 0) {
			return false;
		} else
			return true;
	}

	public void dodajDate(int a, int b, int c) {
		if (czyDobreDane(a, b, c)) {

			this.rok = this.rok + c;
			if (this.dzien + a <= 31) {
				this.dzien = this.dzien + a;
			} else {
				this.dzien = this.dzien + a - 31;
			}
			if (this.miesiac + b <= 12) {
				this.miesiac = this.miesiac + b;
			} else {
				this.miesiac = this.miesiac + b - 12;
			}
		} else {
			System.out.println("b��d");
		}

	}

	public String toString() {
		return "Podana data to: " + this.dzien + "/" + this.miesiac + "/" + this.rok;

	}

}
