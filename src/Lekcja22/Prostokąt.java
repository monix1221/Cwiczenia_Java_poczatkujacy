package Lekcja22;

public class Prostok¹t extends Figura {

	private double bokA;
	private double bokB;

	public Prostok¹t() {
		this(1.0, 1.0);
	}

	public Prostok¹t(double a, double b) {

		this(a, b, "Zielony", false);
	}

	public Prostok¹t(double a, double b, String k, boolean w) {
		super(k, w);
		bokA = a;
		bokB = b;
	}

	public double obliczObwód() {
		return 2 * bokA + 2 * bokB;
	}

	public double obliczPole() {
		return bokA * bokB;
	}

	public String toString() {
		return "Nazwa: " + getClass().getName() + ", Bok a: " + bokA + ", Bok b: " + bokB + ",\nObwód: " + obliczObwód()
				+ ", Pole: " + obliczPole() + ", " + super.toString();
	}

	public static void main(String[] args) {

		Prostok¹t prostok = new Prostok¹t(2, 3, "¿ó³ty", true);
		System.out.println(prostok);

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

}
