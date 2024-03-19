package loop;

import java.util.Scanner;

public class Star03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("별 갯수를 입력 해주세요 : ");
		num = sc.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

