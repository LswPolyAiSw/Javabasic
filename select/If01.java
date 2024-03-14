package select;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0;
		int max = 0;
		String format = "가장 큰 수는 %d입니다";
		
		System.out.print("첫 번째 숫자 입력 : ");
		a = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		b = sc.nextInt();
		System.out.print("세 번째 숫자 입력 : ");
		c = sc.nextInt();
		
		if(a > max) {
			max = a;
		}
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.printf(format, max);
	}

}
