package Lekcja22;

public class FiguraTest {

	public static void main(String[] args) {

		// Figura fig = new Figura();
		// nie mo�na tworzy� obiekt�w klasy abstrakcyjnej

		Ko�o ko�o = new Ko�o();
		Ko�o ko�o2 = new Ko�o(50);
		Prostok�t prost = new Prostok�t();
		Prostok�t prost2 = new Prostok�t(3, 7, "Be�owy", true);

		// tworzymy tablic� o typie Figura z 4 elementami
		Figura[] figury = new Figura[4];
		figury[0] = ko�o;
		figury[1] = ko�o2;
		figury[2] = prost;
		figury[3] = prost2;
		// figury[4]=fig;

		/*
		 * for(Figura x:figury){ System.out.println(x); }
		 */

		/*
		 * for(int i=0; i<figury.length; i++){
		 * 
		 * if(figury[i] instanceof Ko�o){ System.out.println(((Ko�o)
		 * figury[i]).obliczPole()); } if(figury[i] instanceof Prostok�t){
		 * System.out.println(((Prostok�t) figury[i]).obliczPole()); }
		 * 
		 * }
		 */

		for (int i = 0; i < figury.length; i++) {
			System.out.println(figury[i].obliczPole());
			figury[i].draw();
		}

		// System.out.println(((Ko�o) figury[0]).obliczPole());

		/*
		 * for(int i=0; i<figury.length; i++){
		 * System.out.println(figury[i].obliczPole()); }
		 */

	}

}
