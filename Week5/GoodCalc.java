package Week5;

abstract class Calculator{
	int a,b;
	
	public abstract int add(int a,int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
	
}


public class GoodCalc extends Calculator {
	double sum=0.0;
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
	}
	public double average(int[] a) {
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum/(double)a.length;
	}
	public static void main(String[] args) {
		GoodCalc g=new GoodCalc();
		System.out.println(g.add(2, 3));
		System.out.println(g.subtract(5, 3));
		System.out.println(g.average(new int[] {2,3,4}));
	}
}
