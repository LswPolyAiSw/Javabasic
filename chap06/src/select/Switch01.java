package select;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();

		switch (num % 2) {
		case  0:
			System.out.println("짝수 입니다");
			break;
		case 1:
			System.out.println("홀수 입니다");
			break;
		default:
			System.out.println("올바른 숫자를 입력하세요");
			break;
		}

	}

}
