package select;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다");
		}else if(num == 0) {
			System.out.println("0입니다");
		}else {
			System.out.println("음수입니다");
		}
	}

}
