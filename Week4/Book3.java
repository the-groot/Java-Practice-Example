package Week4;

import java.util.Scanner;

public class Book3 {
	String title, author;
	
	public Book3(String title, String author) {
	this.title = title;
	this.author = author;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book3 [] book = new Book3[2]; // Book �迭 ����
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<book.length; i++) {
		System.out.print("����>>");
		String title = scanner.nextLine();
		System.out.print("����>>");
		String author = scanner.nextLine();
		book[i] = new Book3(title, author); // �迭 ���� ��ü ����
		}
		for(int i=0; i<book.length; i++)
		System.out.print("(" + book[i].title + ", " + book[i].author + ")");
		scanner.close();

	}

}
