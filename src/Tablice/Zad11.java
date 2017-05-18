package Tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Zad11 {

	public static void main(String[] args) {

		// program pobiera od u¿ytkownika imiona i wpisuje je do tablicy. na
		// poczatku pyta sie o liczbe imione

		Scanner wpisz = new Scanner(System.in);

		System.out.println("Podaj ile chcesz miec elementow w tablicy");
		int n = wpisz.nextInt();
		String[] tablica = new String[n];

		for (int i = 0; i < tablica.length; i++)

		{
			System.out.print("Podaj imie " + (i + 1) + " ");
			String imie1 = wpisz.nextLine();
			System.out.println("Poda³eœ imie " + imie1);
			tablica[i] = imie1;

		}

		System.out.println("Utworzono nastepujaca tablice: " + Arrays.toString(tablica));

		/*
		 * System.out.
		 * println("Podaj numer indeksu tablicy (zaczyna 0), wiêc max to " +
		 * (n-1)); int numer = wpisz.nextInt(); System.out.println("Witaj "+
		 * tablica[numer]);
		 */
	}

}
