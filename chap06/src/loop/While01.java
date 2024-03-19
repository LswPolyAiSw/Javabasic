package loop;

import java.util.Scanner;

public class While01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, i = 1, num = 0;
		String format = "1부터 %d의 합은 %d입니다";
		
		System.out.print("숫자를 입력 하세요 : ");
		num = sc.nextInt();
		
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.printf(format, num, sum);
		
		
		
	}

}
