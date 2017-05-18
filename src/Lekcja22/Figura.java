package Lekcja22;

public abstract class Figura implements Areable, Drawable {

	String kolor;
	boolean wype³nienie;

	Figura() {
		this("czarny", false);
	}

	Figura(String k, boolean w) {
		kolor = k;
		wype³nienie = w;
	}

	public String toString() {
		return "Kolor: " + kolor + ", wype³nienie: " + wype³nienie;
	}

	public static void main(String[] args) {

	}

	// w nadklasie ta metoda zdefiniowana tylko po to, ¿eby by³a,
	// bo w podklasach i tak bêdzie nadpisywana
	// ta metoda siê nigdy nie wykona dla podklas (bo bêdzie nadpisana), wykona
	// siê tylko dla obiektór Figura

	/*
	 * public double obliczPole() {
	 * 
	 * return 2.0; }
	 */

	/*
	 * public abstract double obliczPole();
	 * 
	 * 
	 * public abstract double obliczObwód();
	 */

}
