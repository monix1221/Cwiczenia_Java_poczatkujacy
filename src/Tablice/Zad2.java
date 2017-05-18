package Tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {

		System.out.println("Podaj liczbe elementów tablicy ");
		Scanner wejscie = new Scanner(System.in);

		int n = wejscie.nextInt();

		System.out.println("Poda³eœ " + n);

		int[] tablica = new int[n];

		for (int j = 0; j < n; j++) {

			int numer = j + 1;
			tablica[j] = numer;
			System.out.println(tablica[j]);
		}

		System.out.println(Arrays.toString(tablica));
	}

}
