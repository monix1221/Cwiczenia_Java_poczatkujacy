package Lekcja29_Wyjatki;

public class Wyliczeniowy {

	public enum DzieñTygodnia {

		PONIEDZIA£EK(1, "pon"), WTOREK(2, "wt"), ŒRODA(3, "œr"), CZWARTEK(4, "czw"), PI¥TEK(5, "pt"), SOBOTA(6,
				"sb"), NIEDZIELA(7, "ndz");
		private int numer;
		private String skrót;

		private DzieñTygodnia(int n, String s) {
			numer = n;
			skrót = s;
		}

		public String toString() {
			return numer + " dzieñ tyogdnia: " + super.toString() + ", skrót: " + skrót;
		}

		public void komentuj() {
			if (this == DzieñTygodnia.PI¥TEK)
				System.out.println("Jak pi¹tek to super, idzie weekend!!!!");

			else if (this == DzieñTygodnia.PONIEDZIA£EK)
				System.out.println("Nie lubiê poniedzia³ków :-(");
		}

	}

	public static void main(String[] args) {

		// for (DzieñTygodnia d: DzieñTygodnia.values()){
		// System.out.println(d);
		// }

		// porównywanie:
		DzieñTygodnia dzisiaj = DzieñTygodnia.PI¥TEK;
		DzieñTygodnia popo = DzieñTygodnia.PONIEDZIA£EK;

		dzisiaj.komentuj();
		popo.komentuj();

		DzieñTygodnia wtorek = DzieñTygodnia.valueOf("WTOREK");
		// metoda valieOf zamienia obiekt tekstowy typu string na obiekt Enum

	}

}
