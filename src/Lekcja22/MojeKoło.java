package Lekcja22;

public class MojeKo�o extends Ko�o {

	public MojeKo�o(double r) {
		super(r);
	}

	/*
	 * public double obliczPole(){ double r = getPromie�(); return 1000*r; }
	 */

	public static void main(String[] args) {

		MojeKo�o mk = new MojeKo�o(10);
		System.out.println("Promie�: " + mk.getPromie�());
		System.out.println("Pole: " + mk.obliczPole());
	}

}
