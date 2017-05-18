package Lekcja18;

public class Przekazywanie {

	/*
	 * //PUNKT 1
	 * 
	 * public static void podwojenie(int x){ x=x*2; System.out.println(x);
	 * 
	 * //gdy do procedury jest przekazywany typ prosty np. integer lub double,
	 * to //operacja dzieje sie na KOPII przekazanej zmiennej (a nie na tej
	 * zmiennej) }
	 */

	/*
	 * //PUNKT 2 - METODA ZADZIA�A NA OBIEKCIE NP. NA TABLICY
	 * 
	 * public static void podwojenie(int[] tab1, int[] tab2){ for(int i=0;
	 * i<tab1.length; i++){ tab2[i]=tab1[i]*2; }
	 * 
	 * }
	 */
	/*
	 * public static void podwojenie(Ko�o k){ double tempR = k.getPromien();
	 * tempR=tempR*2; k.setPromien(tempR); }
	 */

	// �REDNIAAAAAAAAA

	public static void �rednia(int... var) {
		double s = 0;
		for (int x : var) {
			s = s + x;
		}
		s = s / var.length;
		System.out.println("�rednia wynosi: " + s);
	}

	public static void main(String[] args) {

		/*
		 * //PUNKT 1 int x=10;
		 * 
		 * System.out.println("Warto�� x przed podwojeniem: "+x); podwojenie(x);
		 * System.out.println("Warto�� x po podwojeniu: "+ x); //warto�� x si�
		 * nie podwoi, bo podwoi sie tylko kopia x, a prymityw x zostanie bez
		 * zmian x=x*2; System.out.println("Warto�� x wynosi: "+ x);
		 */

		/*
		 * // PUNKT 2: int[] x = new int [1]; x[0]=10; int[] y = new int[1];
		 * podwojenie(x,y);
		 * System.out.println("wartosc x: "+x[0]+" wartosc y: "+y[0]);
		 */

		Ko�o ko�o = new Ko�o();
		System.out.println("wartosc promienia: " + ko�o.getPromien());

		// podwojenie(ko�o);
		System.out.println("wartosc promienia: " + ko�o.getPromien());

		�rednia(1, 2, 3, 4, 5, 34, 22);

	}

}
