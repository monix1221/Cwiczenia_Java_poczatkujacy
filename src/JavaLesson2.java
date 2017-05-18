import java.util.Scanner;

public class JavaLesson2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		// System.out.println("Wpisz numer: ");

		/*
		 * boolean numer1 = userInput.nextBoolean();
		 * 
		 * String numer=userInput.nextLine();
		 * 
		 * System.out.println("Wpisales " + numer1);
		 */

		// String nazwa=userInput.nextLine();
		// System.out.println("Podales " +nazwa);
		double losowy = (Math.random() * 11);
		System.out.println("Wylosowano " + losowy);

	}
}
