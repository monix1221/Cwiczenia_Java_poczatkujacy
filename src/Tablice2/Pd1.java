package Tablice2;

import java.util.Scanner;

public class Pd1 {

	public static void main(String[] args) {
		/*
		 * HW 1. Zadanie z if Napisz program, kt�ry na podstawie wpisanych przez
		 * u�ytkownika odpowiedzi zgaduje o jakiej liczbie my�la�. Liczby
		 * pochodz� z przedzia�u [1, 1 000 000]. Program pyta: Czy to liczba
		 * [n]? A u�ytkownik wpisuje opowiednio: - m- liczba jest mniejsza od
		 * podanej - w- liczba jest wi�ksza od podanej - r- liczba jest r�wna
		 * podanej i tak w k�ko a� u�ytkownik wpisze "r", czyli program
		 * odgadnie liczbe. Po zgadni�ciu program ma wy�wietla�:
		 * "Liczba o kt�rej my�la�e� to: [n]". Program ma wykonywa� si� w p�tli.
		 * Do por�wnywania wpisanych przez u�ytkownika warto�ci z mo�liwymi
		 * odpowiedziami u�yj .equals().
		 */

		Scanner wejscie = new Scanner(System.in);
		System.out.println("Pomy�l o liczbie z zakresu (1;1000000) ");
		System.out.print("Czy ta liczba to:  ");

		// System.out.println("Podales " + liczba);

		int losowy = (int) (Math.random() * 1000000);

		System.out.println(losowy);
		System.out.println("Je�eli tak, wpisz r. Je�eli mniejsza, wpisz m, je�eli wieksza wpisz w");
		int a = 1;
		int b = 1000000;

		String odpowiedz = wejscie.nextLine();

		do {

			if (odpowiedz.equals("m")) {

				b = losowy;
				losowy = (int) (Math.random() * (b - a + 1) + a);

				System.out.println("Czy ta liczba to:  " + losowy);
				System.out.print("Podaj odpowiedz r, m lub w: ");
			}

			else if (odpowiedz.equals("w")) {
				a = losowy;

				losowy = (int) (Math.random() * (b - a + 1) + a);
				System.out.println("Czy ta liczba to:  " + losowy);
				System.out.print("Podaj odpowiedz r, m lub w: ");
			}

			else if (odpowiedz.equals("r")) {
				System.out.println("Zgad�em, ta liczba to " + losowy);
				break;
			}

			odpowiedz = wejscie.nextLine();
		} while (true);

	}
}
