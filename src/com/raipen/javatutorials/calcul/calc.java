package com.raipen.javatutorials.calcul;

class calculator{
	static int a = 3;
	int k=7;
	
	public void set(int k) {
		this.k = k;
	}
	public void sum() {
		System.out.println(this.k+a);
	}
	
}

public class calc {
	
	
	public static void main(String[] args) {
		calculator x = new calculator();
		calculator.a = 6;
		x.sum();
		x.set(5);
		x.sum();
	}
}
