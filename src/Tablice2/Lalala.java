package Tablice2;

import java.util.Arrays;

public class Lalala {

	public static void main(String[] args) {

		/*
		 * HW 2. Cztery dru�yny rozgrywa�y kolejno mecze. Wyniki przedstawione
		 * s� poni�ej: ��ci 2:5 Zieloni Czerwoni 4:8 Niebiescy Zieloni 5:2
		 * Czerwoni Niebiescy 1:1 ��ci Czerwoni 5:3 ��ci Niebiescy 4:2 Zieloni
		 * Korzystaj�c z dwuwymiarowej tablicy sprawd�, kt�ra dru�yna zaj�a
		 * kt�re miejsce i wypisz.
		 */

		System.out.println("Macierz wynik�w w kolejno�ci: czerwoni, zieloni, ��ci, niebiescy \n");
		// zwyciestwo daje 3 pkt, remis 1 punkt, pora�ka 0

		double[][] tablica = { { (double) 0, (double) 2 / 5, (double) 5 / 3, (double) 4 / 8 },
				{ (double) 5 / 2, (double) 0, (double) 5 / 2, (double) 2 / 4 },
				{ (double) 3 / 5, (double) 2 / 5, (double) 0, (double) 1 / 1 },
				{ (double) 8 / 4, (double) 4 / 2, (double) 1 / 1, (double) 0 } };

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[0].length; j++) {
				System.out.print(tablica[i][j] + "\t");
			}
			System.out.println("");
		}

		System.out.println(" ");

		// tutaj powstaje tablica jednowymiarowa z suma punktow druzyn

		System.out.println("Uzyskane wyniki w kolejno�ci (od g�ry): czerwoni, zieloni, ��ci, niebiescy \n");

		int[] tab = new int[4];

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[0].length; j++) {

				if (tablica[i][j] < 1) {
					tab[i] = tab[i] + 0;
				} else if (tablica[i][j] > 1) {
					tab[i] = tab[i] + 3;
				}

				else if (tablica[i][j] == 1) {
					tab[i] = tab[i] + 1;
				}
			}
		}

		for (int t : tab) {
			System.out.println(t);
		}

		// sortowanie tablicy z wynikami!!!!!!!!!!!!!!!

		// utworzy�am tablice skladajaca sie z sumy tablic z wynikami i nazwami
		// dru�yn

		// System.out.println(" \n");

		String[] tab3 = { "czerwoni", "zieloni", "zolci", "niebiescy" };
		/*
		 * Wypisanie zespo��w - niepotrzebne
		 *
		 * for (String t:tab3) { System.out.print(t+", "); }
		 * 
		 */

		System.out.println(" ");
		System.out.println("Dru�yny otrzyma�y nastepujaca ilosc punkt�w: ");
		String[] tab4 = new String[4];
		for (int i = 0; i < tab3.length; i++) {

			tab4[i] = tab[i] + " " + tab3[i];
			System.out.println(tab4[i] + " pkt, ");
		}

		// Posortowanie tablicy z wynikami:

		System.out.println("Dru�yny w kolejno�ci zaj�tego miejsca (od ostatniego)");
		Arrays.sort(tab4);
		System.out.println(Arrays.toString(tab4));
		// inny spos�b:

		System.out.println("Po   : " + Arrays.toString(tab4));

	}
}
