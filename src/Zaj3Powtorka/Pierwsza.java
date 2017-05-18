package Zaj3Powtorka;

public class Pierwsza {

	// metdoa - obliczanie pola kwadratu

	public static int obliczPole(int a) {
		// System.out.println("Co�tam"+a*a*a*a);
		return a * a;
	}

	public static void obliczPoleIWypisz(int a) {
		System.out.println("Pole kwadratu o boku " + a + " wynosi " + a * a);
	}

	// sprawdzanie, czy bok kwadratu jest wi�kszy od zera:

	public static boolean sprawdzanie(int a) {
		if (a > 0) {
			return true;
		} else
			return false;
	}

	public static void obliczISprawdz(int a) {
		if (sprawdzanie(a) == true) {
			System.out.println("Pole kwadratu o boku " + a + " wynosi " + a * a);
		} else {
			System.out.println("Niepoprawne dane");
		}
	}

	public static int obliczSprawdzDwa(int a) {
		if (sprawdzanie(a)) {
			return obliczPole(a);
		} else {
			System.out.println("Z�e dane");
			return -1;
		}
	}

	/*
	 * 1. Napisz funkcj�, przyjmuj�c� jako argumenty godzin� oraz minuty, oraz
	 * wy�wietlaj�c� "Jest godzina: hh:mm.". Za pomoc� drugiej funcji sprawd�
	 * czy podane liczby s� poprawne, je�eli nie, zamiast komunikatu o godzinie,
	 * wy�wietl, �e podane liczby s� b��dne.
	 */

	public static void wyswietlGodzine(int g, int m) {
		System.out.println("Jest godzina " + g + ":" + m);
	}

	public static boolean sprawdzGodzine(int g, int m) {
		if (g <= 0 || g > 23 || m < 0 || m > 59) {
			return false;
		} else
			return true;
	}

	public static void sprawdzIWypiszGodzine(int g, int m) {
		if (sprawdzGodzine(g, m)) {
			wyswietlGodzine(g, m);
		} else {
			System.out.println("B��d godziny");

		}
	}

	// ZADANIE Z SILNI�

	public static int silniaItera(int n) {
		if (n == 0) {
			return 1;
		} else if (n > 0) {
			int silnia = 1;
			for (int i = 1; i <= n; i++) {
				silnia = silnia * i;
			}
			return silnia;
		} else
			return -1;
	}

	// silnia rekurencyjnie:

	public static int silniaRekur(int n) {
		if (n == 0) {
			return 1;
		} else if (n > 0) {
			int silnia = 1;

			return silnia = n * silniaRekur(n - 1);
		} else
			return -1;

	}

}
