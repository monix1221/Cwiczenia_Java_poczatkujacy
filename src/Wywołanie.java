public class Wywo�anie {

	public static void main(String[] args) {

		/*
		 * int[] tablica={1,2,3,4,5}; Metody.reverse(tablica);
		 * 
		 * for(int x:tablica){ System.out.println(x); }
		 */
		// System.out.println("Dodawanie iteracja dla " +n+ " wynosi: " +
		// Metody.dodawanieIteracja(n));
		// System.out.println("Dodawanie iteracja dla " +n+ " wynosi: " +
		// Metody.dodawanieRekurencja(n));

		int n = 6;
		System.out.println("Ci�g Fibbonaciego (iteracyjnie) z n = " + n + " element�w: ");
		Metody.fiboIteracyjnie(n);

		System.out.println("Ostatni wyraz ci�gu Fibbonaciego (rekurencyjnie) z n = " + n + " element�w to: ");
		System.out.println(Metody.fiboRekurencyjnie(n));

		System.out.println("Ci�g Fibbonaciego (rekurencyjnie) z n = " + n + " element�w: ");
		Metody.wypiszFibo(n);
	}
}