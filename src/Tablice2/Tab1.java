package Tablice2;

public class Tab1 {

	public static void main(String[] args) {

		int[] tablicaLiczb = new int[10];
		for (int i = 0; i < tablicaLiczb.length; i++) { // co siê stanie gdy i
														// zaczniemy od 1?
			tablicaLiczb[i] = i;
		}
		for (int i = 0; i < tablicaLiczb.length; i++) {
			System.out.print(tablicaLiczb[i] + " ");
		}

	}

}
