public class Wywo³anie {

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
		System.out.println("Ci¹g Fibbonaciego (iteracyjnie) z n = " + n + " elementów: ");
		Metody.fiboIteracyjnie(n);

		System.out.println("Ostatni wyraz ci¹gu Fibbonaciego (rekurencyjnie) z n = " + n + " elementów to: ");
		System.out.println(Metody.fiboRekurencyjnie(n));

		System.out.println("Ci¹g Fibbonaciego (rekurencyjnie) z n = " + n + " elementów: ");
		Metody.wypiszFibo(n);
	}
}