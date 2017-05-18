import java.util.Arrays;

public class Metody {

	public static void reverse(int[] arr) {
		int temp = 0;
		int from = 0;
		int to = arr.length;
		int[] newArr;
		if (from < to - 1) {
			temp = arr[from];
			arr[from] = arr[to - 1];
			arr[to - 1] = temp;
			newArr = Arrays.copyOfRange(arr, from + 1, to - 1);
			reverse(newArr);
		}
	}

	// Zadanie: dodawanie kolejnych liczb a¿ do n: np. dla n=3: wynik=1+2+3

	public static int dodawanieIteracja(int n) {
		if (n > 0) {
			int wynik = 0;
			for (int i = 0; i <= n; i++) {
				wynik = wynik + i;
			}
			return wynik;
		} else
			return -1;
	}

	public static int dodawanieRekurencja(int n) {
		if (n >= 0) {

			return n + dodawanieRekurencja(n - 1);
		} else
			return 0;
	}

	/*
	 * HW2 Stwórz dwie metody statyczne, licz¹ce ci¹g fibonacciego: jedna
	 * iteracyjnie (zwyk³a pêtla), druga rekurencyjnie.
	 */

	public static void fiboIteracyjnie(int n) {
		if (n == 0) {
			System.out.println("0");
		} else if (n == 1) {
			System.out.println("1");
		} else if (n > 1) {
			int i = 1;
			int j = 1;
			for (int a = 1; a <= n; a++) {
				System.out.println(i);
				int pomoc;
				pomoc = j;
				j = i + j;
				i = pomoc;
			}
		} else
			System.out.println("-1");
	}

	public static int fiboRekurencyjnie(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (n > 1) {
			return fiboRekurencyjnie(n - 2) + fiboRekurencyjnie(n - 1);
		} else
			return -1;
	}

	public static void wypiszFibo(int n) {

		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				System.out.println(fiboRekurencyjnie(i));
			}
		}

		else {
			System.out.println(fiboRekurencyjnie(n));
		}
	}

}
