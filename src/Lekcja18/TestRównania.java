package Lekcja18;

import java.util.Scanner;

public class TestRównania {

	public static void main(String[] args) {

		System.out.println("Podaj parametry a, b i c: ");
		Scanner skaner = new Scanner(System.in); // słówko new wywołuje
													// konstruktor i tworzy nowy
													// obiekt

		int a = skaner.nextInt();
		int b = skaner.nextInt();
		int c = skaner.nextInt();

		RównanieKwadratowe r = new RównanieKwadratowe(a, b, c);
		System.out.println(r.rozwiąż());

		System.out.println(r);

		r.setA(100);
		r.setB(-20);
		System.out.println(r.rozwiąż());
		System.out.println(r);

	}
}
