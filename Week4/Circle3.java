package Week4;

public class Circle3 {
	int radius;
	public Circle3(int radius) {
	this.radius = radius;
	}
	public double getArea() {
	return 3.14*radius*radius;
	}
	
	public static void main(String args[]) {
		Circle3 [] c;
		c = new Circle3[5];
		for(int i=0; i<c.length; i++)
		c[i] = new Circle3(i);
		for(int i=0; i<c.length; i++)
		System.out.print((int)(c[i].getArea()) + " ");
	}
}
