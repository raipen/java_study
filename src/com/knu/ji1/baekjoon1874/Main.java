package com.knu.ji1.baekjoon1874;

class Stack{
	int[] arr;
	int top;
	int size;
	
	public Stack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int a) {
		if(isFull()){
			System.out.println("isFull\n");
			System.exit(0);
		}
		this.arr[++this.top] = a;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("isEmpty\n");
			System.exit(0);
		}
		return this.arr[this.top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("isEmpty\n");
			System.exit(0);
		}
		return this.arr[this.top];
	}
}

public class Main {
	public static void main(String[] args) {
		int[] result;
		if(makeResult(result)) {
			
		}
	}
}
