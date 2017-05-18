package Tablice;

import java.util.Arrays;
import java.util.Scanner;

public class Tab6 {

	public static void main(String[] args) {

		/*
		 * Napisz program, który bêdzie znajdowa³ najwiêksz¹ wartoœæ z podanych
		 * przez u¿ytkownika pomiarów (dodatnie liczby typu double) a nastêpnie
		 * poda ich sumê i œredni¹ arytmetyczn¹. Wczeœniej u¿ytkownik deklaruje
		 * ile liczb bêdzie chcia³ wpisaæ.
		 * 
		 */

		Scanner wejscie = new Scanner(System.in);

		System.out.print("Dzieñ dobry!\nPodaj liczbê elementów tablicy ");
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
