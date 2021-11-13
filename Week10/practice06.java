package Week10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;

public class practice06 extends JFrame {
	
	JLabel la=new JLabel("c");
	practice06() {
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c=getContentPane();
		c.setLayout(null);
		
		la.setSize(200,20);
		la.setLocation(100,100);
		c.add(la);
		
		la.addMouseListener(new MyMouseListener2());
		
		la.setFocusable(true);
		la.requestFocus();
		
		setVisible(true);
		setSize(500,500);
	}
	
	class MyMouseListener2 implements MouseListener{
		int x,y;
		
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {
			x=(int)((Math.random()*10000)%300);
			y=(int)((Math.random()*10000)%300);
			System.out.println("x:"+x+"y:"+y);
			System.out.println("클릭됨");
			la.setLocation(x,y);
		}
	}
	
	
	public static void main(String[] args) {
		new practice06();
	}
}
