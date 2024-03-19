package loop;

import java.util.Scanner;

public class DoWhile01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, num = 0;
		
		System.out.print("숫자를 입력해주세요 : ");
		num = sc.nextInt();
		
		do {
			sum += num;
			System.out.print("숫자를 입력해주세요 : ");
			num = sc.nextInt();
		}while(num != 0);
		System.out.println(sum);
	}
}
