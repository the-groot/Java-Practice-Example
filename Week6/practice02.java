package Week6;

class Circle{
	int x,y,radius;
	Circle(int x, int y, int radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public String toString() {
		return " Circle("+x+","+y+")"+"������"+radius;
	}
	
	public boolean equals(Object obj) {
		Circle c=(Circle)obj;
		if(x==c.x && y==c.y) return true;
		else return false;
	}
	
}

public class practice02 {
	public static void main(String[] args) {
		Circle a=new Circle(2,3,5);
		Circle b=new Circle(2,3,30);
		System.out.println("�� a :"+a);
		System.out.println("�� b :"+b);
		
		if(a.equals(b))
			System.out.println("������");
		else
			System.out.println("���� �ٸ� ��");
		
	}
}
