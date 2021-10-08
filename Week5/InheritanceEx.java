package Week5;

class People{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
	}
}

class new_people extends People{
	public void set() {
		age=30;
		name="ȫ�浿";
		height=175;
		//weight=99;
		setWeight(99);
	}
}


public class InheritanceEx {
	public static void main(String[] args) {
		new_people s=new new_people();
		s.set();
	}
}
