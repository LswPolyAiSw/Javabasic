package sequence;

import java.util.Scanner;

public class Sequence01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("변수 a에 넣을 숫자 : ");
		int a = scanner.nextInt();
		
		
		System.out.print("변수 b에 넣을 숫자 : ");
		int b = scanner.nextInt();
		
		
		System.out.printf("변수 a의 값 = %d", a);
		System.out.printf("\n변수 b의 값 = %d", b);
	}

}
