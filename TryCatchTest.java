package exception;

public class TryCatchTest {
	public static void main(String[] args) {
		System.out.println("===== 프로그램 시작 =====");
//		arithmeticException();
//		indexException();
//		nullPointerException();
		numberFormatException();
		System.out.println("===== 프로그램 종료 =====");
	}
	
	public static void arithmeticException() {
		int a = 0, b = 0;
		
		try {
			int c = a / b;
		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
			e.printStackTrace();
		}
			
		
	}

	public static void indexException() {
		int[] array = { 0, 1, 2 };
		try {
			System.out.println(array[3]);
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void nullPointerException() {
		String str = null;
		try {
			str.charAt(1);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void numberFormatException() {
		String str = "123AA";
		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
