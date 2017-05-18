package Lekcja29_Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dzielenie {

	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);

		boolean isNotCorrect = true;

		do {
			try {

				System.out.println("Wprowadz licznik: ");
				int l = skaner.nextInt();
				System.out.println("Wprowadz mianownik: ");
				int m = skaner.nextInt();
				System.out.println("Wynik dzielenia " + l + " / " + m + " = " + l / m);
				isNotCorrect = false;
			} catch (ArithmeticException ae) {
				// ae.printStackTrace();
				System.err.println("Wyj¹tek! Dzielenie przez zero!");
				skaner.nextLine();
			} catch (InputMismatchException ime) {
				// ime.printStackTrace();
				System.err.println("Wyj¹tek! Z³e dane wejœciowe");
				skaner.nextLine();
			}
		} while (isNotCorrect);

		skaner.close();
	}

}
