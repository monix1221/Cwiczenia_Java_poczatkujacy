package Lekcja27;

import java.util.ArrayList;
import java.util.Random;

public class Totek {

	public static int[] losuj(int k, int n) {
		Random crazy = new Random();
		ArrayList<Integer> pula = new ArrayList<Integer>(n);
		int wylosowane[] = new int[k];

		for (int i = 1; i <= n; i++) {
			pula.add(i);
		}
		int counter = n;

		for (int i = 0; i < k; i++) {
			int index = crazy.nextInt(n);
			wylosowane[i] = pula.get(index);
			pula.remove(index);
			n--;
		}
		return wylosowane;
	}

	ArrayList<Integer> lista = new ArrayList<Integer>();

}
