package MojeCwiczeniaZajecia3;

import java.util.Arrays;

public class PierwszaKlasaM {

	public static int obliczPoleKwadratu(int a) {
		return a * a;
	}

	public static void wyswietlPoleKwadratu(int a) {
		System.out.println("Pole kwadratu wynosi: " + a * a);
	}

	// sprawdzenie czy mo�na obliczy� pole tj. czy a>0:

	// metoda poni�ej tylko zwraca prawd� lub fa�sz, gdy skorzystamy z tej
	// metody wyswietlu ture or false
	public static boolean czyWiekszeOdZera(int a) {
		if (a > 0) {
			return true;
		} else
			return false;
	}

	// teraz trzeba utworzy� metod�, kt�ra dla prawdy z metody powy�ej policzy
	// pole, a dla fa�szu zwr�ci komunikat o b��dzie

	public static void obliczPoleISprawdz(int a) {
		if (czyWiekszeOdZera(a)) {
			System.out.println("Pole wynosi: " + a * a);
		} else {
			System.out.println("-1");
		}
	}

	/*
	 * Zadanie 1 - wy�wietlanie godziny
	 */

	public static void wyswietlGodzine(int a, int b) {
		System.out.println("Jest godzina " + a + ":" + b);
	}

	public static boolean czyGodzinaPoprawna(int a, int b) {
		if (a >= 0 && a <= 23 && b >= 0 && b < 60) {
			return true;
		}

		else
			return false;
	}

	public static int wyswietlGodzineISprawdz(int a, int b) {
		if (czyGodzinaPoprawna(a, b)) {
			wyswietlGodzine(a, b);
		} else {
			System.out.println("B��d, z�y format godziny");
		}
		return -1;
	}

	// REKKURENCJA I ITERACJE - OBLICZANIE SILNI

	// OBLICZENIE SILNI - ITERACYJNIE

	public static int silniaIteracja(int n) {
		if (n == 0) {
			return 1;
		} else {
			int silnia = 1;
			for (int i = 2; i <= n; i++) {
				silnia = silnia * i;
			}
			return silnia;
		}
	}

	public static int silniaRekurencja(int n) {
		if (n == 0) {
			return 1;
		} else {
			int wynik = 1;
			wynik = silniaRekurencja(n - 1) * n;
			return wynik;
		}
	}

	// ITERACYJNE ODWRACANIE ELEMENT�W TABLICY:

	public static void odwrocTabliceIteracyjnie(int[] tablica) {
		int poczatkowy = 0;
		int koncowy = tablica.length - 1;
		while (poczatkowy < koncowy) {
			int pomoc = tablica[poczatkowy];
			tablica[poczatkowy] = tablica[koncowy];
			tablica[koncowy] = pomoc;
			poczatkowy++;
			koncowy--;
		}
	}

	// REKURENCYJNE ODWRACANIE TABLICY:

	// NIE DZIALA!!!!!!!!!!!!!!
	public static void odwrocTabliceRekurencyjnie(int[] tablica) {
		int pomoc = 0;
		int poczatkowy = 0;
		int koncowy = tablica.length - 1;

		if (poczatkowy < koncowy) {
			int[] nowaTablica;
			pomoc = tablica[poczatkowy];
			tablica[poczatkowy] = tablica[koncowy];
			tablica[koncowy] = pomoc;
			nowaTablica = Arrays.copyOfRange(tablica, poczatkowy, koncowy - 1);
			odwrocTabliceRekurencyjnie(nowaTablica);
		}

	}

	public static void wyswietlTablice(int[] tablica) {
		for (int x : tablica) {
			System.out.println(x);
		}
	}

	// PRACA DOMOWA ZADANIE 2 - CIAG FIBBONACCIEGO
	// ITERACYJNIE:

	public static void fiboIteracyjnie(int n) {

		if (n == 0) {
			System.out.println("0");
		} else if (n == 1) {
			System.out.println("1");
		} else if (n > 1) {
			int a = 1;
			int i = 1;
			int j = 1;
			int temp;
			System.out.println(i);
			while (a < n) {
				System.out.println(j);
				temp = j;
				j = i + j;
				i = temp;
				a++;
			}
		}
	}

	public static int fiboRekurencyjnie(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else
			return fiboRekurencyjnie(n - 2) + fiboRekurencyjnie(n - 1);
	}
}
