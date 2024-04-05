package classTest;

// 클래스 Circle 선언
class Circle {
	public static final double radius = 0;
	final double PI = 3.14;
	double getArea() {
		return PI * radius * radius;
	}
	
	void show(double radius, double area) {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, area);
	}
}