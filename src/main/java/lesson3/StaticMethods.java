package lesson3;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StaticMethods {

	// beginer level
	public static int[] mass(int[] array) {
		for (int index = 0; index < array.length; index++) {
			array[index] = array[index] * 3;
		}
		return array;
	}

	public static boolean ten(int value1, int value2) {
		if (value1 == 10)
			return true;
		if (value2 == 10)
			return true;
		if (value1 + value2 == 10)
			return true;
		else {

			return false;
		}
	}

	public static boolean multiple(int value) {
		if (value < 0 || value % 3 == 0 || value % 5 == 0)
			return true;

		else {
			return false;
		}
	}

	public static int numberOfArray(int[] array, int value1) {
		int retValue = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] == value1)
				;
			retValue = array[index];
			break;
		}
		return retValue;
	}

	public static String swCa(int value) {
		String str = null;
		switch (value) {
		case 1:
			return str = "Failed";
		case 2:
			return str = "Unsatisfactory";
		case 3:
			return str = "Satisfactorily";
		case 4:
			return str = "Good";
		case 5:
			return str = "Excelent";
		}
		return str;
	}

	public static void even() {
		for (int index = 0; index <= 50; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	public static int mAx(int[] array) {
		int max = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > max) {
				max = array[index];
			}
		}
		return max;

	}

	public static String strNunb(String str, int n) {
		String end = "";
		for (; n > 0; n--) {
			end = end + str.substring(0, n);
		}
		return end;
	}

	public static float extract(int value1, int value2) {
		float intermediate1 = value1;
		float intermediate2 = value2;
		float result = intermediate1 / intermediate2;
		return result;

	}

	public static void stars() {
		Random random = new Random();
		int rand = random.nextInt(9) + 1;
		for (int index1 = 1; index1 <= rand; index1++) {
			for (int index2 = 1; index2 < index1; index2++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int index3 = 0; index3 < rand; index3++) {
			for (int index4 = index3; index4 < rand; index4++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

	// Pre-intermediate level
	public static boolean goToFilm(boolean sheSmile, boolean heSmile) {
		boolean result = false;
		if (sheSmile == heSmile)
			return true;
		else
			return result;

	}

	public static String changeString(String str) {
		String end = "";
		char[] res = str.toCharArray();
		char temp = res[0];
		res[0] = res[res.length - 1];
		res[res.length - 1] = temp;
		end = new String(res);
		return end;
	}

	public static boolean sumOr(int value1, int value2) {
		boolean answer = false;
		if (value1 == 21 || value2 == 21 || value1 + value2 == 21) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

	public static void arr(int[] array) {
		int intermediate = 0;
		for (int index = 0; index <= array.length - 1; index++) {
			intermediate++;
		}
		double b = intermediate;
		int halfOfArray = (int) Math.round(b / 2);
		for (int index2 = halfOfArray - 1; index2 < array.length; index2++) {
			System.out.print(array[index2] + "" + " ");

		}
		System.out.println("");
	}

	public static boolean favourNumInArray(int[] array) {
		boolean answer = true;
		int exseption = 0;
		for (int index = 0; index < array.length; index++) {
			exseption = array[index];
			System.out.println(exseption);
			if (exseption == 7 || exseption == 9) {
				answer = false;
				break;
			} else {
				answer = true;
			}
		}
		return answer;
	}

	public static void sumAVG(int[] array) {
		int sum = 0;
		int indexOfAVG = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
			indexOfAVG = index + 1;
		}
		System.out.println("This is the sum of all elements of the array = " + sum);
		System.out.println("The arifmetic average all elements of the array = " + sum / indexOfAVG);
	}

	public static int[] maxMin(int[] array) {
		int maxIndex = 0;
		int minIndex = 0;
		for (int index = 0; index < array.length; index++) {
			if (array[index] > maxIndex) {
				maxIndex = index;
			}
			if (array[index] < minIndex) {
				minIndex = index;
			}
		}
		for (int c = 0; c < array.length; c++) {
			if (c == minIndex || c == maxIndex) {
				array[c] = array[c] * 2;
			}
		}
		return array;
	}

	public static void fibonachi() {
		int value1 = 1;
		int value2 = 1;
		int value3;
		System.out.print(value1 + " " + value2 + " ");
		for (int index = 3; index <= 100; index++) {
			value3 = value1 + value2;
			System.out.print(value3 + " ");
			value1 = value2;
			value2 = value3;
		}
		System.out.println();
	}

	public static void multiplicationTable() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public static void verify(int number, int count) {
		int temp = number;
		int sum = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		if (number > 0) {
			do {
				array.add(temp % 10);
				temp /= 10;

			} while (temp > 0);

			for (int index : array) {
				sum += index;
			}
			if (sum == count) {
				System.out.println("The sum of the number was counted right");
			} else {
				System.out.println("The sum of teh number was counted wrong");
			}
		} else {
			System.out.println("The number is negative");
		}
	}

	public static void quadEqu(double variable1, double variable2, double variable3) {
		double result = variable2 * variable2 - 4 * variable1 * variable3;
		if (result > 0) {
			double root1, root2;
			root1 = (-variable2 - Math.sqrt(result)) / (2 * variable1);
			root2 = (-variable2 + Math.sqrt(result)) / (2 * variable1);
			System.out.println("The roots of the equation: root1 = " + root1 + ", root2 = " + root2);
		} else if (result == 0) {
			double root;
			root = -variable2 / (2 * variable1);
			System.out.println("The equation have just one root: root = " + root);
		} else {
			System.out.println("The equation haven't roots.");
		}
	}

	public static void testDiagonal() {
		String[][] arrayString = { { "T", " ", " ", " " }, { " ", "e", " ", " " }, { " ", " ", "s", " " },
				{ " ", " ", " ", "t" } };
		for (int index = 0; index < arrayString.length; index++) {
			for (int jndex = 0; jndex < arrayString[index].length; jndex++) {
				System.out.print(arrayString[index][jndex] + "\t");
			}
			System.out.println("Соломія");
		}

	}
	// Intermediate(midle) level

	public static void interactiveVerify() {
		Scanner longnteger = new Scanner(System.in);
		System.out.println("Please enter positive integer ");
		int number = longnteger.nextInt();
		System.out.println("Enter the sum of the digits of this number ");
		Scanner countInteger = new Scanner(System.in);
		int count = countInteger.nextInt();
		int tempoprary = number;
		int sum = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		if (number > 0) {
			do {
				array.add(tempoprary % 10);
				tempoprary /= 10;

			} while (tempoprary > 0);

			for (int index : array) {
				sum += index;
			}
			if (sum == count) {
				System.out.println("The sum of the number was counted right");
			} else {
				System.out.println("The sum of teh number was counted wrong");
			}
		} else {
			System.out.println("The number is negative");
		}
	}

	public static void luckyTicket() {
		int sumLyckyTicket = 0;
		for (int index = 1001; index < 1000000; index++) {
			int number1 = 1000000 % 10;
			int number2 = 100000 % 10;
			int number3 = 10000 % 10;
			int number4 = 1000 % 10;
			int number5 = 100 % 10;
			int number6 = 10 % 10;
			if ((number1 + number2 + number3) == (number4 + number5 + number6)) {
				sumLyckyTicket++;
			}
		}
		System.out.println("The count of the Lucky Tickets equals = " + sumLyckyTicket);
	}

	public static int[] returnsArray(int[] array) {
		for (int index = 0; index < array.length / 2; index++) {
			int temporary = array[index];
			array[index] = array[array.length - index - 1];
			array[array.length - index - 1] = temporary;
		}
		return array;
	}
	
	
	
}
