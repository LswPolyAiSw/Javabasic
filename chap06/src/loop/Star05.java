package loop;

import java.util.Scanner;

public class Star05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("별 갯수 입력 : ");
		num = sc.nextInt();

		
		for (int i = 0; i < num; i++) {

			//루프1: 왼쪽 공백을 출력
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}

			//루프2: 별을 출력
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("*");
			}

			// 출력
			System.out.println();
		}
	}

}
