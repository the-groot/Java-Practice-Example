package Week10;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class practice02 extends JFrame {

	private Container c=getContentPane();
	
	public practice02() {
		setTitle("드래깅동안 YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setBackground(Color.GREEN);
		
		MyMouseListener listener=new MyMouseListener();
		c.addMouseMotionListener(listener);
		setSize(300,150);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseMotionListener{
		
		public void mouseDragged(MouseEvent e) {
			c.setBackground(Color.YELLOW);
		}
		public void mouseMoved(MouseEvent e) {
			c.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String[] args) {
		new practice02();
	}
}
