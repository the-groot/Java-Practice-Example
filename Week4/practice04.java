package Week4;

public class practice04 {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public practice04(int x,int y,int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	protected int square() {
		return width*height;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	protected boolean contains(practice04 r) {
		if((x<=r.x && r.x<=x+width) && (y<=r.y && r.y<=y+height) ) {
			return true;
		}
		
		else
			return false;
		
	}
	
	public static void main(String args[]) {
		practice04 r=new practice04(2,2,8,7);
		practice04 s=new practice04(5,5,6,6);
		practice04 t=new practice04(1,1,10,10);
		
		r.show();
		System.out.println("s의면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		
	}
}
