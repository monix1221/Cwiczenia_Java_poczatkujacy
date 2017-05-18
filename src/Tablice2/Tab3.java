package Tablice2;

public class Tab3 {

	public static void main(String[] args) {

		int[][] tablica = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[0].length; j++) { // czemu [0], a nie
															// [1]?
				System.out.print(tablica[i][j] + "\t");
			}
			System.out.println(""); // czemu tu, a nie wy¿ej?
		}

	}

}
