package select;

import java.util.Scanner;

public class Select01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자 입력 : ");
		
		num = sc.nextInt();
		
		if(num > 15) {
			System.out.println("숫자가 15 이상입니다");
		}else {
			System.out.println("숫자가 15 이하입니다");
		}
	}

}
