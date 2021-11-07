package Week9;

import javax.swing.*;
import java.awt.*;

public class practice08 extends JFrame {
	
	Container c=getContentPane();
	JPanel north=new JPanel();
	JPanel center=new JPanel();
	JPanel south=new JPanel();
	
	
		public void setting() {
		
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new BorderLayout());
		
		setSize(400,400);
		setVisible(true);
		
		}		
	
		public void CreateNorthPanel() {

		north.setLayout(new FlowLayout());
		
		JButton first=new JButton("열기");
		JButton second=new JButton("닫기");
		JButton third=new JButton("나가기");
		
		north.add(first);
		north.add(second);
		north.add(third);
		north.setBackground(Color.gray);
		c.add(north,BorderLayout.NORTH);
		
		}
		
		public void CreateCenterPanel()
		{
			
			center.setLayout(null);
			center.setBackground(Color.white);
			
			
			for(int i=0; i<10; i++) {
				JLabel la=new JLabel("*");
				//la.setBackground(Color.red);
				la.setForeground(Color.red);
				//la.setOpaque(true);
				int x=(int)(Math.random()*400);
				int y=(int)(Math.random()*100)+100;
				la.setLocation(x,y);
				la.setSize(10,10);
				center.add(la);
			}
			c.add(center,BorderLayout.CENTER);
			
		}
		
		public void CreateSouthPanel() {
			
			south.setLayout(new FlowLayout());
			south.setBackground(Color.yellow);
			
			
			south.add(new JButton("Word Input"));
			south.add(new TextField(30));
			
			c.add(south,BorderLayout.SOUTH);
		}
		
	
	
	public static void main(String[] args) {
		practice08 p=new practice08();
		p.setting();
		p.CreateNorthPanel();
		p.CreateCenterPanel();
		p.CreateSouthPanel();
	}
}
