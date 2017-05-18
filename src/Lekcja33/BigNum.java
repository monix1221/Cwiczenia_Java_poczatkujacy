package Lekcja33;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNum {

	public static void main(String[] args) {

		int i;
		long l;
		double d;

		i = 1000000000;
		l = 1000000000000000000L;
		d = 1E308;

		BigInteger bi1, bi2;
		BigDecimal bd;

		// bi1 = new BigInteger("1000000000000000000");
		bi2 = new BigInteger("1000000000000000000");

		/*
		 * // mno¿enie dwóch du¿ych liczb: (bo nie mo¿na przeci¹¿yæ *)
		 * System.out.println(bi1.multiply(bi2));
		 * System.out.println(bi1.add(bi2));
		 * System.out.println(bi1.subtract(bi2)); //odejmowanie
		 * System.out.println(bi1.divide(bi2));
		 */

		bi1 = BigInteger.valueOf(l);
		System.out.println(bi1);

	}

}
