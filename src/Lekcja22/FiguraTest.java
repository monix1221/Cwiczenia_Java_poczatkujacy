package Lekcja22;

public class FiguraTest {

	public static void main(String[] args) {

		// Figura fig = new Figura();
		// nie mo¿na tworzyæ obiektów klasy abstrakcyjnej

		Ko³o ko³o = new Ko³o();
		Ko³o ko³o2 = new Ko³o(50);
		Prostok¹t prost = new Prostok¹t();
		Prostok¹t prost2 = new Prostok¹t(3, 7, "Be¿owy", true);

		// tworzymy tablicê o typie Figura z 4 elementami
		Figura[] figury = new Figura[4];
		figury[0] = ko³o;
		figury[1] = ko³o2;
		figury[2] = prost;
		figury[3] = prost2;
		// figury[4]=fig;

		/*
		 * for(Figura x:figury){ System.out.println(x); }
		 */

		/*
		 * for(int i=0; i<figury.length; i++){
		 * 
		 * if(figury[i] instanceof Ko³o){ System.out.println(((Ko³o)
		 * figury[i]).obliczPole()); } if(figury[i] instanceof Prostok¹t){
		 * System.out.println(((Prostok¹t) figury[i]).obliczPole()); }
		 * 
		 * }
		 */

		for (int i = 0; i < figury.length; i++) {
			System.out.println(figury[i].obliczPole());
			figury[i].draw();
		}

		// System.out.println(((Ko³o) figury[0]).obliczPole());

		/*
		 * for(int i=0; i<figury.length; i++){
		 * System.out.println(figury[i].obliczPole()); }
		 */

	}

}
