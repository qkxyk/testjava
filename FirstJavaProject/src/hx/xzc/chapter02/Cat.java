package hx.xzc.chapter02;

public class Cat extends Animal implements IRun,IEat {
	public void shout() {
		System.out.println("喵喵");
	}
	public void eat() {
		System.out.println("猫吃老鼠");
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println("猫爬树");
	}
}
