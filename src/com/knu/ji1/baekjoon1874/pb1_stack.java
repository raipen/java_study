package com.knu.ji1.baekjoon1874;

class Stack2{
   int top;
   int[] stack;
   int size;
   
   public Stack2(int size) {
      this.top = -1;
      this.size = size;
      this.stack = new int[size];
   }
   
   public void push(int data) {
      System.out.println(stack[top]);
      stack[++top] = data;
   }
   
   public int pop() {
      if(isEmpty()) {
         System.out.println("empty");
         System.exit(0);
      }
      return stack[top--];
   }
   
   public int top() {
      if(isEmpty()) {
         System.out.println("empty");
         System.exit(0);
      }
      return stack[top];
   }
   
   public boolean isFull() {
      return top==size-1;
   }
   
   public boolean isEmpty() {
      return top==-1;
   }
   
}

public class pb1_stack {
   public static void main(String[] args) {
      Stack2 s1 = new Stack2(5);
      s1.push(1);
   }

}