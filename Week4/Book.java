package Week4;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	void show() {System.out.println(title+" "+author);}
	
	
	public Book(String title, String author) {
		this.title=title; 
		this.author=author;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book=new Book[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title=sc.nextLine();
			System.out.print("저자>>");
			String author=sc.nextLine();
			book[i]=new Book(title,author);
		}
		
		for(int i=0; i<book.length; i++)
			System.out.println("("+book[i].title+","+book[i].author+")");
		sc.close();
	}

}
