package Week10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class practice04 extends JFrame {
	String text="Love Java";
	JLabel la=new JLabel(text);
	Container c=getContentPane();
	
	practice04() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		
		
		
		la.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,100);
		setVisible(true);
		
		la.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_LEFT)
			{
				
				text=text.substring(1)+text.substring(0,1);
				la.setText(text);
			}
		}
	}
	
	
	public static void main(String[] args) {
		new practice04();
	}
}
