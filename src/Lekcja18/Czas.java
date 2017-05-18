package Lekcja18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Czas {

	public static void main(String[] args) {
		/*
		 * System.currentTimeMillis();
		 * System.out.println(System.currentTimeMillis()); // ile milisekund
		 * up³ynê³o od 1 stycznia 1970
		 * 
		 * System.out.println(System.currentTimeMillis()/(1000*3600*24*365.5));
		 * 
		 * //poni¿ej wyœwietla up³yw czasu: //np. ile czasu trwa³o wykonanie
		 * jakiejœ pêtli long t1=System.currentTimeMillis(); // 1E6 to 10 do
		 * potêgi 6 for(int i=0; i<1E6; i++){ double x = Math.pow(Math.random(),
		 * Math.random()); } long t2=System.currentTimeMillis();
		 * System.out.println((t2-t1)/1000.0);
		 */

		// Date dziœ = new Date();
		/*
		 * System.out.println(dziœ); //DATA PO ANG
		 * System.out.printf("%tc",dziœ); //DATA PO POLSKU System.out.println();
		 * System.out.printf("%tr",dziœ);
		 */

		GregorianCalendar dziœ = new GregorianCalendar();
		System.out.printf("%tc \n", dziœ);

		int rok = dziœ.get(Calendar.YEAR);
		System.out.println(rok);
		// System.out.printf("%tc", dziœ);

		int dzieñ = dziœ.get(Calendar.DAY_OF_MONTH);
		System.out.println(rok + " " + dzieñ);

		GregorianCalendar urodziny = new GregorianCalendar(2016, Calendar.DECEMBER, 21);
		System.out.printf("%tc \n", dziœ);
		System.out.printf("%tc \n", urodziny);

		if (dziœ.before(urodziny)) {
			System.out.println("Czas kupiæ prezent");
		}

	}

}
