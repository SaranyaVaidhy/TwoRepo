package org.staticc1key;

public class Karmi {
   
	final int i=12;
	
	public void jump1() {
		System.out.println("hello"+i);
	

	}
	public static void main(String[] args) {
		Karmi n = new Karmi();
		n.jump1();
		CompanyTitle.stu();
		//calling static method of other class
		System.out.println(CompanyTitle.a);
		//calling static variable of other class
	}

}
