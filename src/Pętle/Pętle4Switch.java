package Pêtle;

public class Pêtle4Switch {

	public static void main(String[] args) {

		/*
		 * * Program wypisze czy podano liczbê parzyst¹ czy nieparzyst¹ *
		 * 
		 */

		int liczba = 5;
		switch (liczba) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("Liczba nieparzysta");
			// break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
			System.out.println("Liczba parzysta");
			break;
		default:
			System.out.println("Podaj liczbe z zakresu 1-10");

		}

	}

}
