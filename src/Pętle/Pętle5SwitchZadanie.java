package Pêtle;

import java.util.Scanner;

public class Pêtle5SwitchZadanie {

	public static void main(String[] args) {
		/*
		 * 3. Wczytaj zmienn¹ a z zakresu <1,5>. Wypisz s³ownie co to za liczba.
		 * Je¿eli liczba jest spoza zakresu wyœwietl stosown¹ informacjê.
		 */

		Scanner wejscie = new Scanner(System.in);
		System.out.println("Podaj liczbe ");
		// System.out.print("Poda³eœ ");
		int liczba = wejscie.nextInt();

		switch (liczba) {

		case 1:
			System.out.println("jeden");
			break;
		case 2:
			System.out.println("dwa");
			break;
		case 3:
			System.out.println("trzy");
			break;
		case 4:
			System.out.println("cztery");
			break;
		case 5:
			System.out.println("piêæ");
			break;
		default:
			System.out.println("Nie podales liczby z zakresu. Podaj jeszcze raz");
		}

	}

}
