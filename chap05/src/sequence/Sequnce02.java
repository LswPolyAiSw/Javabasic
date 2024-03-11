package sequence;

import java.util.Scanner;

public class Sequnce02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("금액을 입력하세요 : ");
		int amount = scanner.nextInt();
		
		int num500 = amount / 500;
		int num5 = amount % 500;
		int num100 = num5 / 100;
		
		System.out.printf("500원 짜리 동전 갯수 %d개\n", num500);
		System.out.printf("100원 짜리 동전 갯수 %d개", num100);
		
	}

}
