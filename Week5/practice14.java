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

class Oval implements Shape2 {
	private int a,b;
	
	public Oval(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public void draw() {
		System.out.println(a+"x"+b+"에 내접하는 타원입니다.");
	}
	
	public double getArea() {
		return PI*a*b;
	}
}

class Rect2 implements Shape2 {
	private int width;
	private int height;
	
	Rect2(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public void draw() {
		System.out.println(width+"X"+height+"크기의 사각형 입니다.");
	}
}

public class practice14 {
	public static void main(String[] args) {
		Shape2[] list=new Shape2[3];
		list[0]=new Circle2(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect2(10,40);
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("면적은 "+list[i].getArea());
	}
}
