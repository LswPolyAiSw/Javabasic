package select;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		System.out.print("숫자를 입력 하세요");
		a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수입니다 : ");
		}else {
			System.out.println("홀수입니다 : ");			
		}
		
		
		
	}

}
