package loop;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, i = 1, num = 0;
		String format = "지금까지 입력한 숫자의 합은 %d입니다";
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		while(num != 0) {
			sum += num;
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
		}System.out.printf(format, sum);
	}
}
