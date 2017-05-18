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
		 * //sprawdzenie czy a jest wiêksze od zera
		 * PierwszaKlasaM.obliczPoleISprawdz(b);
		 */

		/*
		 * 1. Napisz funkcjê, przyjmuj¹c¹ jako argumenty godzinê oraz minuty,
		 * oraz wyœwietlaj¹c¹ "Jest godzina: hh:mm.". Za pomoc¹ drugiej funcji
		 * sprawdŸ czy podane liczby s¹ poprawne, je¿eli nie, zamiast komunikatu
		 * o godzinie, wyœwietl, ¿e podane liczby s¹ b³êdne.
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
		 * 2. Napisz funkcjê reverse(int[] array), która rekurencyjnie odwraca
		 * kolejnoœæ wystêpowania liczb w jednowymiarowej tablicy.
		 * Arrays.copyOfRange(oldArray, startIndex,endIndex) pozwala na na
		 * stworzenie nowej tablicy, na podstawie elementów ze starej.
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
