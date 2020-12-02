import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SumEvenNumbers {
	public static void main(String args[]) {

		System.out.println("This program calculates the sum of the first " + "n consecutive even natural numbers.\n");

		Scanner s = new Scanner(System.in);
		System.out.print("Enter n:");
		readNum(s);

		s.close();
	}

	// read o positive natural number greater than 0
	public static void readNum(Scanner s) {
		if (!s.hasNextInt()) {
			System.out.println("\nYou must enter a integer number!");
			System.out.println("Enter the number: ");
			s.next();
			readNum(s);
		}
		int n = s.nextInt();
		if (n <= 0) {
			System.out.println();
			System.out.println("\nIt has to be greater than zero!");
			System.out.print("Re-type the number: ");
			readNum(s);
		}
		typeSum(n, s);
	}

	// calculates the sum
	public static void typeSum(int n, Scanner s) {
		int suma = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				suma = suma + i;
		}

		System.out.println("\nThe sum of first " + n + " consecutive even natural numbers is:");
		System.out.print(suma);
		System.out.println("\n\nIf you want to calculate another enter a number" 
				+ ", else enter a letter!");
		System.out.println("Enter n: ");
		if (!s.hasNextInt()) {
			endProgram(s);
		}
		readNum(s);
	}

	// ending program elegantly
	public static void endProgram(Scanner s) {
		System.out.println();
		System.out.println("If you want to exit the program, pres q!");
		String str = s.next();
		if (!str.contentEquals("q")) {
			endProgram(s);
		}
		System.out.println("Program terminated.");
		// delaying 5 seconds before closing the program
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.exit(0);
	}
}