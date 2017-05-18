package Lekcja27;

import java.util.Arrays;
import java.util.Scanner;

public class TotekTest {

	public static void main(String[] args) {
		/*
		 * int n=20; Random numerek = new Random(); int index =
		 * numerek.nextInt(n);
		 * 
		 * System.out.println(index);
		 * 
		 * 
		 * ArrayList<Integer> pulka = new ArrayList<Integer>();
		 * 
		 * for(int i=1;i<=n;i++){ pulka.add(i); }
		 * 
		 * for(Integer a:pulka){ System.out.println(a+" "); }
		 */

		Scanner skaner = new Scanner(System.in);
		System.out.println("Wprowadz liczbe wylosowanych liczb");
		int k = skaner.nextInt();
		System.out.println("Wprowadz zakres liczb");
		int n = skaner.nextInt();

		int[] wyniki;
		wyniki = Totek.losuj(k, n);
		Arrays.sort(wyniki);
		System.out.println(Arrays.toString(wyniki));

	}

}
