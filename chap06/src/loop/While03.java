package loop;

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, i = 1, num = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			
			if(num % 2 == 0) {
				System.out.println(">> 짝수입니다");
			}else {
				System.out.println(">> 홀수입니다");
			}
			
			System.out.println("계속 하시겠습니까? (0-멈춤 / 1-계속)");
			num = sc.nextInt();
			if (num == 0) {
				System.out.println("종료");
				break;
			} else if (num == 1) {
				continue;
			}
		}
	}

}
