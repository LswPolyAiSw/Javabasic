package loop;

import java.util.Scanner;

public class For01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, num = 0;
		String format = "1부터 %d까지의 합은 %d입니다";
		
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num ; i++) {
			sum += i;
		}
		System.out.printf(format, num, sum);
		
		
	}

}
