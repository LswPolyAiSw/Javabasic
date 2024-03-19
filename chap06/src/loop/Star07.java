package loop;

import java.util.Scanner;

public class Star07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("별 갯수를 입력 해주세요 : ");
		num = sc.nextInt();
	
		for(int i = 1; i <= num; i++) {
			     for(int j = 0; j <  i; j++) {
			    	 System.out.print(" ");
			     }
			     for(int k = 0; k <= num - i; k++) {
			    	 System.out.print("*");
			     }
			     System.out.println();
		}
		
		
		
		
//		for(int i = 1; i <= num; i++) {
//			for(int j = 1; j <= num - i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		for(int i = num; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//		}
//			System.out.println("");
		

//		for (int i = 1; i <= num; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
	}
}
