package Zaj3Samochod;

public class Zajecia3Sam {

	public static void main(String[] args) {

		/* PROSTOK¥T */
		String a = "kot"; // sposób deklaracji dla typów prymitywnych
		String b = new String("kotek"); // sposób deklaracji dla obiektów
		System.out.println(a + ", " + b);

		Prostokat prostokat; // tworzymy referencjê, obiekt jeszcze nie istnieje
		prostokat = new Prostokat(); // tworzymy obiekt typu Rectangle

		System.out.println(prostokat + "\n");

		Prostokat prostokat2 = new Prostokat(199, 123, "niebieski");

		System.out.println(prostokat2 + "\n");

		/*
		 * Rectangle proba1=new Rectangle(-10,-20,null);
		 * System.out.println(proba1);
		 */

	}

}
