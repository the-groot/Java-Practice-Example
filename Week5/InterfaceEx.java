package Week5;

interface PhoneInterface{
	final int TIMEOUT=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

class SamsungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("�츮������");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	public void flash() {System.out.println("��ȭ�⿡ ���� �������ϴ�.");}
}

interface MP3Interface{
	public void play();
	public void stop();
}





public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone p=new SamsungPhone();
		p.printLogo();
		p.sendCall();
		p.receiveCall();
		p.flash();
	}
}
