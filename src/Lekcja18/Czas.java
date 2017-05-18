package Lekcja18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Czas {

	public static void main(String[] args) {
		/*
		 * System.currentTimeMillis();
		 * System.out.println(System.currentTimeMillis()); // ile milisekund
		 * up�yn�o od 1 stycznia 1970
		 * 
		 * System.out.println(System.currentTimeMillis()/(1000*3600*24*365.5));
		 * 
		 * //poni�ej wy�wietla up�yw czasu: //np. ile czasu trwa�o wykonanie
		 * jakiej� p�tli long t1=System.currentTimeMillis(); // 1E6 to 10 do
		 * pot�gi 6 for(int i=0; i<1E6; i++){ double x = Math.pow(Math.random(),
		 * Math.random()); } long t2=System.currentTimeMillis();
		 * System.out.println((t2-t1)/1000.0);
		 */

		// Date dzi� = new Date();
		/*
		 * System.out.println(dzi�); //DATA PO ANG
		 * System.out.printf("%tc",dzi�); //DATA PO POLSKU System.out.println();
		 * System.out.printf("%tr",dzi�);
		 */

		GregorianCalendar dzi� = new GregorianCalendar();
		System.out.printf("%tc \n", dzi�);

		int rok = dzi�.get(Calendar.YEAR);
		System.out.println(rok);
		// System.out.printf("%tc", dzi�);

		int dzie� = dzi�.get(Calendar.DAY_OF_MONTH);
		System.out.println(rok + " " + dzie�);

		GregorianCalendar urodziny = new GregorianCalendar(2016, Calendar.DECEMBER, 21);
		System.out.printf("%tc \n", dzi�);
		System.out.printf("%tc \n", urodziny);

		if (dzi�.before(urodziny)) {
			System.out.println("Czas kupi� prezent");
		}

	}

}
