package Lekcja22;

public /* final */ class Ko�o extends Figura {

	private double promie�;

	public Ko�o() {
		this(1.0);
	}

	public Ko�o(double r) {
		this(r, "Granatowy", true);
	}

	public Ko�o(double r, String k, boolean w) {
		super(k, w);
		promie� = r;

	}

	public double getPromie�() {
		return promie�;
	}

	public final double obliczObw�d() {
		return 2 * Math.PI * promie�;
	}

	public final double obliczPole() {
		return Math.PI * Math.pow(promie�, 2);
	}

	public String toString() {
		return "Nazwa: " + getClass().getName() + ", Promie�: " + promie� + ", pole: " + obliczPole() + ",\nobw�d: "
				+ obliczObw�d() + ", " + super.toString();
	}

	public static void main(String[] args) {

		Ko�o ko�o = new Ko�o(100, "Zielony", false);
		System.out.println(ko�o);

	}

	@Override
	public void draw() {
		System.out.println("Rysuj� ko�o! Haha!");

	}

}
