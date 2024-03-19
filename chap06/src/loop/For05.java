package loop;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, num = 0;

		String format = "1부터 %d까지의 합은 %d입니다";
		
		System.out.print("양의 숫자를 입력해주세요 : ");
		num = sc.nextInt();
		
		
		while(num <= 0) {
			System.out.print("양의 정수가 아닙니다 다시 입력하세요 : ");
			num = sc.nextInt();    
		}
		
		for(int i = 1; i <= num ; i++) {
				sum += i;
		}
			System.out.println(sum);
		}
		
	}

