package Week4;

public class Book1 {
	String title;
	String author;
	public Book1(String t) { 
	title = t; author = "���ڹ̻�";
	}
	public Book1(String t, String a) { 
	title = t; author = a;
	}
	
	public static void main(String args[]) {
		Book1 littlePrince = new Book1("�����", "�������丮");
		Book1 loveStory = new Book1("������");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
