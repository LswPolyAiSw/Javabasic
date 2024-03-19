package loop;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, num = 0;

		String format = "%d * %d = %d\n";
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			sum = num * i;
			System.out.printf(format, num, i, sum);
		}
	}

}
