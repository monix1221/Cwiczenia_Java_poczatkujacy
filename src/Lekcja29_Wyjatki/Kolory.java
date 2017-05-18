package Lekcja29_Wyjatki;

public class Kolory {

	public enum Kolor {
		CZERWONY, ZIELONY, NIEBIESKI, ¯Ó£TY
	};

	public static void main(String[] args) {

		Kolor kolor = Kolor.¯Ó£TY;

		switch (kolor) {
		case CZERWONY:
			System.out.println("Kolor czerwony!");
			break;

		case NIEBIESKI:
			System.out.println("Kolor niebieski!");
			break;
		case ZIELONY:
			System.out.println("Kolor zielony!");
			break;
		default:
			System.out.println("Nie znam tego koloru:(");
			break;
		}

	}

}
