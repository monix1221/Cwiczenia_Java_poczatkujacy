package Tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Tab6 {

	public static void main(String[] args) {

		/*
		 * Napisz program, kt�ry b�dzie znajdowa� najwi�ksz� warto�� z podanych
		 * przez u�ytkownika pomiar�w (dodatnie liczby typu double) a nast�pnie
		 * poda ich sum� i �redni� arytmetyczn�. Wcze�niej u�ytkownik deklaruje
		 * ile liczb b�dzie chcia� wpisa�.
		 * 
		 */

		Scanner wejscie = new Scanner(System.in);

		System.out.print("Dzie� dobry!\nPodaj liczb� element�w tablicy ");
		int n = wejscie.nextInt();

		double[] tablica = new double[n];

		for (int i = 0; i < tablica.length; i++) {
			Scanner wejDwa = new Scanner(System.in);
			System.out.print("Podaj " + (i + 1) + " element tabicy ");
			double liczba = wejDwa.nextDouble();
			tablica[i] = liczba;

		}
		System.out.println("Twoja tablica to: " + Arrays.toString(tablica));

		for (int i = 0; i < tablica.length; i++) {
			double zmiana = tablica[i];
			if (zmiana > tablica[i]) {
				zmiana = tablica[i];
			} else {
				System.out.println("Najwiekszy element tablicy to: " + zmiana);
			}
		}

	}

}
