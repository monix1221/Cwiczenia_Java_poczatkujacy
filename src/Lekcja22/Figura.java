package Lekcja22;

public abstract class Figura implements Areable, Drawable {

	String kolor;
	boolean wype�nienie;

	Figura() {
		this("czarny", false);
	}

	Figura(String k, boolean w) {
		kolor = k;
		wype�nienie = w;
	}

	public String toString() {
		return "Kolor: " + kolor + ", wype�nienie: " + wype�nienie;
	}

	public static void main(String[] args) {

	}

	// w nadklasie ta metoda zdefiniowana tylko po to, �eby by�a,
	// bo w podklasach i tak b�dzie nadpisywana
	// ta metoda si� nigdy nie wykona dla podklas (bo b�dzie nadpisana), wykona
	// si� tylko dla obiekt�r Figura

	/*
	 * public double obliczPole() {
	 * 
	 * return 2.0; }
	 */

	/*
	 * public abstract double obliczPole();
	 * 
	 * 
	 * public abstract double obliczObw�d();
	 */

}
