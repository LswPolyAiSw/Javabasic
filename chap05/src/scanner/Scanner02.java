package scanner;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("원의 반지름을 입력해주세요 : ");
		int r = scanner.nextInt();
		
		System.out.printf("원의 넓이는 %.1f cm입니다", r * r * 3.14);
	}

}