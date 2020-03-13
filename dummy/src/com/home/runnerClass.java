package com.home;

import java.lang.reflect.Method;

public class runnerClass {

	public static void main1(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("com.home.TestClass");
		Method [] m = c.getDeclaredMethods();
		
		for(Method method : m) {
			System.out.println(method.getName());
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		apple a1 = new apple("Fruit","Round");
		apple a2 = new apple("Fruit","Round");

		grapes b = new grapes("Fruit","Round");
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(b));

		
		System.out.println(a1 == a2);
		System.out.println(a1);
	
	}
}
