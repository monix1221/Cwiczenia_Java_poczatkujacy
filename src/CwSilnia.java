import java.util.Scanner;

public class CwSilnia {
	static Scanner wejscie = new Scanner(System.in);

	static long obliczSilnia(int n) {
		long silnia = 1;
		for (int i = 1; i <= n; i++) {
			silnia = silnia * i;
		}
		return silnia;
	}

	public static void main(String[] args) {

		System.out.println("Podaj liczne n ");
		int n = wejscie.nextInt();
		System.out.println("Silnia z " + n + " wynosi " + obliczSilnia(n));

	}
}
