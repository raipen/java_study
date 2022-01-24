package com.knu.ji1.oop;

class cal{
	static int base = 20;
	int left,right;
	public cal() {};
	public cal(int _left,int _right) {
		left = _left;
		right = _right;
	}
	public void sum() {
		System.out.println(this.base+this.left+this.right);
	}
	public void sub() {
		System.out.println(this.left-this.right);
	}
}

class Math2 extends cal{
	int mid;
	public Math2(int _left,int _right,int _mid) {
		super(_left,_right);
		this.mid = _mid;
	}
	public void mul() {
		System.out.println(this.base+this.left*this.right*this.mid);
	}
}

public class Main {
	public static void main(String[] args) {
		Math2 c = new Math2(3,5,7);
		Math2.base = 30;
		c.sum();
		c.mul();
		System.out.println(Math2.base);
	}
}
