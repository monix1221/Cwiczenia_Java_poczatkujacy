package Lekcja22;

public /* final */ class Ko³o extends Figura {

	private double promieñ;

	public Ko³o() {
		this(1.0);
	}

	public Ko³o(double r) {
		this(r, "Granatowy", true);
	}

	public Ko³o(double r, String k, boolean w) {
		super(k, w);
		promieñ = r;

	}

	public double getPromieñ() {
		return promieñ;
	}

	public final double obliczObwód() {
		return 2 * Math.PI * promieñ;
	}

	public final double obliczPole() {
		return Math.PI * Math.pow(promieñ, 2);
	}

	public String toString() {
		return "Nazwa: " + getClass().getName() + ", Promieñ: " + promieñ + ", pole: " + obliczPole() + ",\nobwód: "
				+ obliczObwód() + ", " + super.toString();
	}

	public static void main(String[] args) {

		Ko³o ko³o = new Ko³o(100, "Zielony", false);
		System.out.println(ko³o);

	}

	@Override
	public void draw() {
		System.out.println("Rysujê ko³o! Haha!");

	}

}
