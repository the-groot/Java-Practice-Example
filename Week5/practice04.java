package Week5;

import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()
		+"�� �ٲߴϴ�");
		System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
		double val=sc.nextDouble();
		double res=convert(val);
		System.out.println("��ȯ ���:"+res+getDestString()+"�Դϴ�");
		sc.close();
	}
}

class Km2Mile extends Converter{
	
	
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
	
	Km2Mile(double ratio){
		this.ratio=ratio;
	}
	
}

public class practice04 {
	public static void main(String[] args) {
		Km2Mile toMile=new Km2Mile(1.6);
		toMile.run();
	}
}
