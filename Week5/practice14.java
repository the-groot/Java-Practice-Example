package Week5;

interface Shape2{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("--- 다시 그립니다.");
		draw();
	}
}

class Circle2 implements Shape2{
	private int radius;
	
	Circle2(int radius){
		this.radius=radius;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
}

public class practice14 {
	public static void main(String[] args) {
		Shape2 donut=new Circle2(10);
		donut.redraw();
		System.out.println("면적은 "+donut.getArea());
	}
}
