package org.chinning;

import java.io.IOException;
import java.util.Scanner;

public class CustoExcep {
	
	public static void main(String[] args) {
	
		try {
			int age= 16;
			if(age<=18)  //16<18
			{ 
				throw new NotValiedAge("younger not allowed");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("The end");
	}

}
