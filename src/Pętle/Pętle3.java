package Pêtle;

public class Pêtle3 {

	public static void main(String[] args) {

		int i = 1;
		int temp;
		int j = 1;
		int a = 1;
		System.out.println(i);

		for (; a < 10;) {

			System.out.println(j);
			temp = j;
			j = j + i;
			i = temp;
			a++;

		}

	}

}
