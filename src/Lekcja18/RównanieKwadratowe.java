package Lekcja18;

public class RównanieKwadratowe {

	// Pola klasy:
	private int a;
	private int b;
	private int c;

	// Konstruktor:
	public RównanieKwadratowe(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}

	// metoda do rozwiązywania:

	public String rozwiąż() {
		String rozwiązanie = "";
		double delta;
		delta = (b * b - 4 * a * c);

		if (delta > 0) {
			delta = Math.sqrt(delta);
			double x1 = (-b - delta) / (2 * a);
			double x2 = (-b + delta) / (2 * a);
			rozwiązanie = "Rownianie posiada dwa pierwiastki rzeczywiste: " + x1 + " " + x2;
		} else if (delta == 0) {

			double x0 = (-b) / (2 * a);
			rozwiązanie = "Rownianie posiada jeden pierwiastek rzeczywisty: " + x0;
		} else {
			rozwiązanie = "Brak pierwiastków rzeczywistych";
		}
		return rozwiązanie;
	}

	public String toString() {
		return "Równanie kwadratowe: " + a + "x^2 + " + b + "x +" + c;
	}

	public static void main(String[] args) {

		RównanieKwadratowe równanie = new RównanieKwadratowe(1, 4, 1);
		System.out.println(równanie.rozwiąż());

	}

}
