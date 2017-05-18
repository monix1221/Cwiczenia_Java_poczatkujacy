package MojeCwiczeniaZajecia3;

public class MojeZajecia3_cwiczenia {

	public static void main(String[] args) {

		/*
		 * int a=8; System.out.println("Pole kwadratu to: " +
		 * PierwszaKlasaM.obliczPoleKwadratu(a));
		 * 
		 * PierwszaKlasaM.wyswietlPoleKwadratu(a);
		 * 
		 * int b=-6; System.out.println(PierwszaKlasaM.czyWiekszeOdZera(b));
		 * //sprawdzenie czy a jest wi�ksze od zera
		 * PierwszaKlasaM.obliczPoleISprawdz(b);
		 */

		/*
		 * 1. Napisz funkcj�, przyjmuj�c� jako argumenty godzin� oraz minuty,
		 * oraz wy�wietlaj�c� "Jest godzina: hh:mm.". Za pomoc� drugiej funcji
		 * sprawd� czy podane liczby s� poprawne, je�eli nie, zamiast komunikatu
		 * o godzinie, wy�wietl, �e podane liczby s� b��dne.
		 */

		/*
		 * int a=6, b=32; PierwszaKlasaM.wyswietlGodzine(a, b);
		 * System.out.println(PierwszaKlasaM.czyGodzinaPoprawna(a, b));
		 * PierwszaKlasaM.wyswietlGodzineISprawdz(a, b);
		 */

		// SILNIA ITERACYJNIE:

		int b = 3;
		System.out.println("Silnia iteracyjnie wynosi: " + PierwszaKlasaM.silniaIteracja(b));
		System.out.println("Silnia rekurencyjnie wynosi: " + PierwszaKlasaM.silniaRekurencja(b));

		/*
		 * 2. Napisz funkcj� reverse(int[] array), kt�ra rekurencyjnie odwraca
		 * kolejno�� wyst�powania liczb w jednowymiarowej tablicy.
		 * Arrays.copyOfRange(oldArray, startIndex,endIndex) pozwala na na
		 * stworzenie nowej tablicy, na podstawie element�w ze starej.
		 */
		/*
		 * int[] tablica={1,2,3,4,5,6};
		 * 
		 * PierwszaKlasaM.wyswietlTablice(tablica);
		 * PierwszaKlasaM.odwrocTabliceRekurencyjnie(tablica);
		 * System.out.println("\n"); PierwszaKlasaM.wyswietlTablice(tablica);
		 */

		// Zadanie - praca domowa - Fibbonacci:
		int a = 6;
		PierwszaKlasaM.fiboIteracyjnie(a);

		for (int i = 0; i < a; i++) {
			System.out.println(PierwszaKlasaM.fiboRekurencyjnie(i));
		}
	}

}
