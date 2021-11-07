package Week9;

import javax.swing.*;
import java.awt.*;

public class practice06 extends JFrame {
	
	
	
	public practice06(){
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<20; i++) {
			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*200)+50;
			
			JLabel la=new JLabel();
			
			la.setLocation(x,y);
			la.setSize(10,10);
			la.setBackground(Color.blue);
			la.setOpaque(true);
			c.add(la);
			//c.add(new JLabel());
		}
		
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new practice06();
		
	}
}
