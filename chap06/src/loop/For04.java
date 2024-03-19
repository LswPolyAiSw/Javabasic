package loop;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 해주세요");
		int num = 0;
		
		num = sc.nextInt();
		
		int f = 1;
		
		for (int i = num; i >= 1; i--) {
			f *= i;
		}
		System.out.println(num + "! =" + f);
	}

}
