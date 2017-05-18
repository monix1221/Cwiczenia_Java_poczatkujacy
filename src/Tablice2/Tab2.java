package Tablice2;

public class Tab2 {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;

		int[][] tablicaLiczb = new int[a][b]; // mo¿e byæ te¿: int
												// tablicaLiczb[][]

		for (int i = 0; i < tablicaLiczb.length; i++) {

			for (int j = 0; j < tablicaLiczb[0].length; j++) {
				tablicaLiczb[i][j] = i + j;
				System.out.print(tablicaLiczb[i][j] + "\t");
			}

			System.out.println(""); // czemu tu, a nie wy¿ej?
		}

	}

}
