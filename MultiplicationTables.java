import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String args[]) {

		int a, b, c, d;

		Scanner in = new Scanner(System.in);

		a = 1;
		b = 9;

		for (c = a; c <= b; c++) {
			for (d = 1; d <= 9; d++) {
				System.out.println(c + "*" + d + " = " + (c * d));

			}
		}
	}
}
