
public class Silnia {

	public static void main(String[] args) {
		int n = 4;

		System.out.println("Silnia z " + n + " wynosi " + obliczSilnia(n));
	}

	public static long obliczSilnia(int n) // metoda

	{
		long silnia = 1;

		for (int i = 1; i <= n; i++) {
			silnia = silnia * i;
		}
		return silnia;

	}

}
