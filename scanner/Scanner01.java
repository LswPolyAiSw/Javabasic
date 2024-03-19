package scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		int a = scanner.nextInt();
		
		System.out.print("실수를 입력해주세요 : ");
		double b = scanner.nextDouble();
		
		double sum = a + b;
		double sum1 = a - b;
		double sum2 = a * b;
		double sum3 = a / b;
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sum1);
		System.out.println(a + " * " + b + " = " + sum2);
		System.out.println(a + " / " + b + " = " + sum3);
		
	}

}
