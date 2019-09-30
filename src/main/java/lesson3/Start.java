package lesson3;

public class Start {
	public static void main(String[] args) {

		String str = new String("Test");
		int[] array = new int[] { 1, 3, 5, 7, 9 };
		int testNumber1 = 5;
		int testNumber2 = 4;
		int testNumber3 = 0;
		int arrNumb = 12345;
		int testNumber4 = 15;

		// beginer level
		StaticMethods st = new StaticMethods();

		st.mass(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(st.ten(testNumber1, testNumber2));
		System.out.println(st.multiple(testNumber1));
		System.out.println(st.numberOfArray(array, testNumber3));
		System.out.println(st.swCa(testNumber2));
		st.even();
		System.out.println(st.mAx(array));

		System.out.println(st.strNunb(str, testNumber2));
		System.out.println(st.extract(testNumber1, testNumber2));
		st.stars();

		// Pre-intermediate level
		System.out.println(st.goToFilm(false, true));
		System.out.println(st.changeString(str));
		System.out.println(st.sumOr(testNumber1, testNumber2));
		st.arr(array);
		System.out.println(st.favourNumInArray(array));
		st.sumAVG(array);
		st.maxMin(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		st.fibonachi();

		// TODO
		st.multiplicationTable();
		st.verify(arrNumb, testNumber4);
		st.quadEqu(testNumber1, testNumber2, testNumber3);
		st.testDiagonal();
		// Intermediate(midle) level
	}

}
