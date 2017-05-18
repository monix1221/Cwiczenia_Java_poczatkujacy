package Lekcja29_Wyjatki;

public class Wyliczeniowy {

	public enum Dzie�Tygodnia {

		PONIEDZIA�EK(1, "pon"), WTOREK(2, "wt"), �RODA(3, "�r"), CZWARTEK(4, "czw"), PI�TEK(5, "pt"), SOBOTA(6,
				"sb"), NIEDZIELA(7, "ndz");
		private int numer;
		private String skr�t;

		private Dzie�Tygodnia(int n, String s) {
			numer = n;
			skr�t = s;
		}

		public String toString() {
			return numer + " dzie� tyogdnia: " + super.toString() + ", skr�t: " + skr�t;
		}

		public void komentuj() {
			if (this == Dzie�Tygodnia.PI�TEK)
				System.out.println("Jak pi�tek to super, idzie weekend!!!!");

			else if (this == Dzie�Tygodnia.PONIEDZIA�EK)
				System.out.println("Nie lubi� poniedzia�k�w :-(");
		}

	}

	public static void main(String[] args) {

		// for (Dzie�Tygodnia d: Dzie�Tygodnia.values()){
		// System.out.println(d);
		// }

		// por�wnywanie:
		Dzie�Tygodnia dzisiaj = Dzie�Tygodnia.PI�TEK;
		Dzie�Tygodnia popo = Dzie�Tygodnia.PONIEDZIA�EK;

		dzisiaj.komentuj();
		popo.komentuj();

		Dzie�Tygodnia wtorek = Dzie�Tygodnia.valueOf("WTOREK");
		// metoda valieOf zamienia obiekt tekstowy typu string na obiekt Enum

	}

}
