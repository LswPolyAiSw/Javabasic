package loop;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, num = 0;

		String format = "%d * %d = %d\n";

		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				sum = i * j;
				System.out.printf(format, i, j, sum);
			}
		}
	}

}
