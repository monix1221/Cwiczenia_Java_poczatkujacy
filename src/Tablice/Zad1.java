package Tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {

		// program pobiera od u¿ytkownika imiona i wpisuje je do tablicy

		Scanner wpisz = new Scanner(System.in);

		String[] tablica = new String[5];

		for (int i = 0; i < tablica.length; i++) {
			System.out.println("Podaj imie " + (i + 1));
			String imie = wpisz.nextLine();
			tablica[i] = imie;
		}

		System.out.println("Utworzono nastepujaca tablice: " + Arrays.toString(tablica));

	}

}
