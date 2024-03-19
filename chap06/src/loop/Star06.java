package loop;

import java.util.Scanner;

public class Star06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("별 갯수 입력 : ");
		num = sc.nextInt();

		
		for (int i = num - 1; i >= 0; i--) {

            // 왼쪽 공백을 출력
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }

            // b   별을 출력
            for (int k = 0; k <= 2 * i ; k++) {
                System.out.print("*");
            }

           
            System.out.println();
		}
			
//			
//			for (int j = num - i; j > 1; j--) {
//				System.out.print(" ");
//			}
//
//			
//			for (int k = 0; k <= i * 2; k++) {
//				System.out.print("*");
//			}
//			// 출력
//			System.out.println();
	}
}
