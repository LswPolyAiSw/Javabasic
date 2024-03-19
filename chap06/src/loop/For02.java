package loop;

import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, num = 0;

		String format = "5개의 숫자의 합은 %d입니다";

		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			sum += num;
		}
		System.out.printf(format, sum);
	}

}
