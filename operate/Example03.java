package operate;

public class Example03 {

	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		x += 2;
		System.out.println(x);
		x *= 2;
		System.out.println(x);
		x -= 2;
		System.out.println(x);
		
		int a = 5;
		System.out.println(a++);
		// 1번 출력은 5,2번 출력은 왜 7일까?
		System.out.println(++a);
	
	}

}
