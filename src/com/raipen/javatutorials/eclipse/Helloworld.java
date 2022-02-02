package com.raipen.javatutorials.eclipse;

import java.util.*;

public class Helloworld {
	
	public static void asdf(String a) {
		a = a.concat("123");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		String a = "asdf";
		Scanner s = new Scanner(System.in);
		asdf(a);
		System.out.println(a+s.nextInt());
		s.close();
	}
}
