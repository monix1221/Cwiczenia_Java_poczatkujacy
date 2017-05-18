package Lekcja22;

public class Prostok�t extends Figura {

	private double bokA;
	private double bokB;

	public Prostok�t() {
		this(1.0, 1.0);
	}

	public Prostok�t(double a, double b) {

		this(a, b, "Zielony", false);
	}

	public Prostok�t(double a, double b, String k, boolean w) {
		super(k, w);
		bokA = a;
		bokB = b;
	}

	public double obliczObw�d() {
		return 2 * bokA + 2 * bokB;
	}

	public double obliczPole() {
		return bokA * bokB;
	}

	public String toString() {
		return "Nazwa: " + getClass().getName() + ", Bok a: " + bokA + ", Bok b: " + bokB + ",\nObw�d: " + obliczObw�d()
				+ ", Pole: " + obliczPole() + ", " + super.toString();
	}

	public static void main(String[] args) {

		Prostok�t prostok = new Prostok�t(2, 3, "��ty", true);
		System.out.println(prostok);

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

}
