package kopo.ac.kr.day01;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
//		직사각형의 가로 세로 길이 구하기
		
//		가로 세로 정의
//		double w = 2.2;
//		double l = 10.0;
//		
//		System.out.printf("직사각형의 넓이는 %.1f cm입니다.", w * l );
		
		
		// 입력된 정수가 짝수인지 홀수인지 조건 연산자를 사용 하여 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		int i = sc.nextInt();
//		
//		if(i % 2 == 0) {
//			System.out.print("짝수입니다\n");
//		}
//		else {
//			System.out.print("홀수입니다\n");
//		}
		
//		원의 반지름을 입력 받아 넓이를 구하여 출력
//		
//		Scanner sc = new Scanner(System.in);
//		
//		final double PI = 3.14;
//		double r = sc.nextDouble();
//		
//		System.out.printf("원의 넓이는 %.2f cm입니다", PI * r * r);
		
		
//		2개의 변수에 있는 숫자를 입력 받아 swapping한 결과
		
//		Scanner sc = new Scanner(System.in);
//		
//		int i = sc.nextInt();
//		int j = sc.nextInt();
//		int temp = 0;
//		
//		temp = i;
//		i = j;
//		j = temp;
//		
//		System.out.println("swap 결과");
//		System.out.printf("i의 값 = %d\n", i);
//		System.out.printf("j의 값 = %d\n", j);
		
		
//		입력 받은 데이터 입력 후, 반복 유효 묻기
		
		Scanner sc = new Scanner(System.in);
		int loop = 1;
		
		while (loop == 1) {
			System.out.print("숫자를 입력하세요 : ");
			int a = sc.nextInt();
			
			System.out.printf("입력한 숫자는 %d입니다\n", a);
			
			System.out.println("다시 입력 하시겠습니까? 예) 0, 1");
			loop = sc.nextInt();
		}
		System.out.println("수고 하셨습니다.");
	}
}
