package Week5;

interface PhoneInterface2 {
	final int TIMEOUT=10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface2 {
	public void play();
	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface2 {
	@Override
	public void sendCall() {
		System.out.println("������������~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��.");
	}
	@Override
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("���ڿԾ��.");
	}
	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}


public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone p=new SmartPhone();
		p.printLogo();
		p.sendCall();
		p.play();
		System.out.println("3�� 5�� ���ϸ� "+p.calculate(3,5));
		p.schedule();
	}
}
