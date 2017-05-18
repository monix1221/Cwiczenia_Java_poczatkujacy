package Lekcja29_Wyjatki;

import java.util.Scanner;

public class Oceny {

	public static void main(String[] args) {
		// instrukcja switch case

		int ocena;
		int jedynki, dwójki, trójki, czwórki, pi¹tki, szóstki, inne;
		jedynki = dwójki = trójki = czwórki = pi¹tki = szóstki = inne = 0;
		Scanner skaner = new Scanner(System.in);
		System.out.println("Wprowadz oceny. \"q\" koñczy wprowadzanie ");

		while (skaner.hasNextInt()) {
			ocena = skaner.nextInt();
			switch (ocena) {
			case 1:
				jedynki++;
				break;
			case 2:
				dwójki++;
				break;
			case 3:
				trójki++;
				break;
			case 4:
				czwórki++;
				break;
			case 5:
				pi¹tki++;
				break;
			case 6:
				szóstki++;
				break;
			default:
				inne++;
				break;

			}

		}

		System.out.println("Liczba jedynek: " + jedynki);
		System.out.println("Liczba szóstek: " + szóstki);
		System.out.println("Liczba innych: " + inne);

	}

}
