package Lekcja29_Wyjatki;

import java.util.Scanner;

public class Oceny {

	public static void main(String[] args) {
		// instrukcja switch case

		int ocena;
		int jedynki, dw�jki, tr�jki, czw�rki, pi�tki, sz�stki, inne;
		jedynki = dw�jki = tr�jki = czw�rki = pi�tki = sz�stki = inne = 0;
		Scanner skaner = new Scanner(System.in);
		System.out.println("Wprowadz oceny. \"q\" ko�czy wprowadzanie ");

		while (skaner.hasNextInt()) {
			ocena = skaner.nextInt();
			switch (ocena) {
			case 1:
				jedynki++;
				break;
			case 2:
				dw�jki++;
				break;
			case 3:
				tr�jki++;
				break;
			case 4:
				czw�rki++;
				break;
			case 5:
				pi�tki++;
				break;
			case 6:
				sz�stki++;
				break;
			default:
				inne++;
				break;

			}

		}

		System.out.println("Liczba jedynek: " + jedynki);
		System.out.println("Liczba sz�stek: " + sz�stki);
		System.out.println("Liczba innych: " + inne);

	}

}
