package Tablice2;

public class Tab4 {

	public static void main(String[] args) {

		/* 4. Stwórz tabliczkê mno¿enia 10x10 */

		int a = 11;
		int b = 11;

		int[][] tabliczka = new int[a][b];

		for (int i = 1; i < tabliczka.length; i++) {

			for (int j = 1; j < tabliczka[0].length; j++) {

				tabliczka[i][j] = i * j;
				System.out.print(tabliczka[i][j] + "\t");

			}
			System.out.println("  ");

		}

	}

}
