package Tablice;

import java.util.Arrays;

public class Tab4 {

	// przyk³ad z³ego kopiowania tablicy - nie skopiuje siê

	public static void main(String[] args) {

		int[] tablica = { 1, 4, 2, 7, 3 };
		int[] kopia = new int[5];

		kopia = tablica; // odwo³anie do tego samego miejsca w pamiêci, wiêc siê
							// nie skopiuje
		tablica[0] = 1000;

		System.out.println(Arrays.toString(tablica));
		System.out.println(Arrays.toString(kopia));
	}

}
