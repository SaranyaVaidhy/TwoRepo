package org.staticc1key;

public class Stringlitrial {
	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		String s3="Programme";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println("*********************");
		String s4 = new String("Selenium");
		String s5 = new String("Selenium");
		String s6 = new String("Project");
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		System.out.println("*********************");
		String concat = s1.concat(s3);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));
		System.out.println("*********************");
		StringBuilder s8= new StringBuilder("Selenium");
		StringBuilder s9= new StringBuilder("Project");
		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(s9));
		
		StringBuilder append = s8.append(s9);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
		
		
		
		
		
		
		
		
		
	}

}
