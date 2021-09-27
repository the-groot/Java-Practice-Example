package Week5;

class Point2{
	private int x,y;
	
	Point2(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	protected void showPoint() {
		System.out.println("("+x+","+y+")");
		
	}
}

class ColorPoint2 extends Point2{
	private String color;
	
	ColorPoint2(int x, int y,String color) {
		super(x,y);
		this.color=color;
	}
	
	protected void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}


public class SuperEx {

	public static void main(String[] args) {
		ColorPoint2 cp=new ColorPoint2(3,5,"black");
		cp.showColorPoint();

	}

}
