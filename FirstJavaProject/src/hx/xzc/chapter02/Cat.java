package hx.xzc.chapter02;

public class Cat extends Animal implements IRun,IEat {
	public void shout() {
		System.out.println("����");
	}
	public void eat() {
		System.out.println("è������");
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println("è����");
	}
}
