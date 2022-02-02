package com.knu.ji1.baekjoon1874;

import java.util.Scanner;

class Stack{
	int[] arr;
	int top;
	int size;
	
	Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	boolean isFull() {
		return top==size-1;
	}
	boolean isEmpty() {
		return top==-1;
	}
	
	void push(int a) {
		if(isFull()){
			System.out.println("isFull");
			System.exit(0);
		}
		this.arr[++this.top] = a;
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("isEmpty");
			System.exit(0);
		}
		return this.arr[this.top--];
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("isEmpty");
			System.exit(0);
		}
		return this.arr[this.top];
	}
}

class result{
	boolean isPossible = true;
	char[] log;
	private Stack s;
	private int logIndex = 0;
	private int cur = 1;
	
	result(Scanner scan) {
		int T = scan.nextInt();
		this.log = new char[T*2]; 
		this.s = new Stack(T);
		while(T--!=0&&this.isPossible)
			this.print(scan.nextInt());
	}
	
	private void print(int a) {
		while(this.s.isEmpty()||a>this.s.peek()) {
			this.s.push(this.cur++);
			this.log[this.logIndex++] = '+';
		}
		if(a<this.s.peek()) {
			this.isPossible = false;
			return;
		}
		this.s.pop();
		this.log[this.logIndex++] = '-';
	}
	
	void printLog() {
		if(this.isPossible)
			for(char i :this.log)
				System.out.println(i);
		else
			System.out.println("NO");
	}
}


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		result r = new result(scan);
		
		r.printLog();
		scan.close();
	}
}
