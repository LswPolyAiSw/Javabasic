package select;

import java.util.Scanner;

public class StringConV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0;
		
		int max = 0;

		System.out.print("숫자를 입력하세요 : ");
		a = Integer.parseInt(sc.next());
		b = Integer.parseInt(sc.next());
		c = Integer.parseInt(sc.next());
		
		if(a > max) {
			max = a;
		}
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.printf("가장 큰 수는 %d입니다", max);
	}

}
