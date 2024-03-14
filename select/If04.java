package select;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		System.out.print("점수를 입력하세요 : ");
		total = sc.nextInt();
		
		if(total >= 90) {
			System.out.print("A");
		}else if(total >= 80){
			System.out.print("B");
		}else if(total >= 70){
			System.out.print("C");
		}else if(total >= 60){
			System.out.print("D");
		}else {
			System.out.print("F");
		}
	}

}
