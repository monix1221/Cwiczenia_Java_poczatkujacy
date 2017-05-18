package Lekcja22;

public class MojeKo³o extends Ko³o {

	public MojeKo³o(double r) {
		super(r);
	}

	/*
	 * public double obliczPole(){ double r = getPromieñ(); return 1000*r; }
	 */

	public static void main(String[] args) {

		MojeKo³o mk = new MojeKo³o(10);
		System.out.println("Promieñ: " + mk.getPromieñ());
		System.out.println("Pole: " + mk.obliczPole());
	}

}
