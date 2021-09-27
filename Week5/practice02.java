package Week5;

class TV{
	private int size;
	public TV(int size) {this.size=size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV{
	private int color;
	ColorTV(int size, int color){
		super(size);
		this.color=color;
	}
	
	protected void printProperty() {
		System.out.print(getSize()+"인치 "+color+"컬러");
	}
	protected int getColor() {return color;}
	
	
}

class IPTV extends ColorTV{
	private String address;
	
	public IPTV(String address, int size, int color) {
		super(size,color);
		this.address=address;
	}
	
	protected void printProperty() {
		System.out.print("나의 IPTV는 "+address+"주소의 ");
		super.printProperty();
	}
}

public class practice02 {
	public static void main(String[] args) {
		IPTV iptv=new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}
}
