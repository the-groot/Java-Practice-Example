package Week5;

class Point{
	private int x,y;
	
	protected void set(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	protected void showPoint() {
		System.out.println("("+x+","+y+")");
		
	}
}

class ColorPoint extends Point{
	private String color;
	
	protected void setColor(String color) {
		this.color=color;
	}
	
	protected void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p=new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint c=new ColorPoint();
		c.set(3, 5);
		c.setColor("blue");
		c.showColorPoint();
		
	}
}
