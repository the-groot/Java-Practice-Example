package Week9;

import javax.swing.*;
import java.awt.*;

public class practice04 extends JFrame {
	Color[] color= {Color.RED, Color.ORANGE, Color.YELLOW,Color.GREEN,Color.CYAN,
			Color.BLUE,Color.MAGENTA,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
	
	Container c=getContentPane();
	JButton btn[]=new JButton[10];
	
	public void setting() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new GridLayout(1,10));
		setSize(600,300);
		setVisible(true);
	}
	public void CreateButton() {
		for(int i=0; i<10; i++) {
		btn[i]=new JButton(Integer.toString(i));
		btn[i].setBackground(color[i]);
		c.add(btn[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		practice04 p=new practice04();
		p.setting();
		p.CreateButton();
	}
}


