package Pêtle;

public class Petle1 {

	public static void main(String[] args) {

		// int a=4;

		/*
		 * while (a<10) { // bez a++? System.out.println(a); a++; }
		 */
		/*
		 * do{ System.out.println(a); a++; } while (a<10);
		 */

		/*
		 * do { System.out.println(a); a++; } while (a<10);
		 */

		/*
		 * 1. Napisz program, który wypisuje pierwsze 10 liczb ci¹gu
		 * Fibonacciego. (1,1,2,3,5,8,13)
		 */

		int a = 1;
		int b = 0;
		do {
			System.out.println(a);
			// a=a+a;

		} while ((a = a + a) < 10);

	}

}
