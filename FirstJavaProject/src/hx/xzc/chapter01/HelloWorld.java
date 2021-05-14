package hx.xzc.chapter01;

import hx.xzc.chapter02.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("hello world");
		Person p = new Person();
		p.setName("张三");
		System.out.println(p.getName());
		
		IRun cat1= new Cat();
		Animal cat2= new Cat();
		Cat cat3= new Cat();
		//cat1.run();
		//cat2.shout();
		//cat3.eat();
		//cat3.run();
		//cat3.shout();
		if(cat1 instanceof IRun) {
			System.out.println("是irun");
		}else {
			System.out.println("不是irun");
		}
		if(cat1 instanceof Animal) {
			System.out.println("是动物");
		}else {
			System.out.println("bushidongwu");
		}
		if(cat1 instanceof IEat) {
			System.out.println("shi eat");
		}else {
			System.out.println("bushi eat");
		}
		
	}
}
