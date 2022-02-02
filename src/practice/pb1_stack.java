package practice;

import java.util.Scanner;

class Stack2{
   int top, size, topStr;
   int[] stack;
   char[] stack2;
   
   public Stack2(int size) {
      this.top = -1;
      this.size = size;
      this.topStr =- 1;
      this.stack = new int[size];
      this.stack2 = new char[size*2];
   }
   
   public void push(int data) {
      stack[++top] = data;
      stack2[++topStr] = '+';
   }
   
   public void pop() {
      if(isEmpty()) {
         System.out.println("empty");
         System.exit(0);
      }
      stack[top--] = 0;
      stack2[++topStr] ='-';
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
   
   public char[] retStr() {
      return stack2;
   }
}

public class pb1_stack {
   public static void seq(int size,Scanner sc) {
      boolean res = true;
      int val=1, n;
      Stack2 s1 = new Stack2(size);
      
      for(int i=0; i<size; i++) {
         n = sc.nextInt();
         
         if(s1.top()==n) s1.pop();
         else if(s1.top()<n) {
            while(s1.top()<n) {
               if(val>n) res = false;
               s1.push(val++);
            }
            s1.pop();
         }
      }
      
      char[] t = s1.retStr();
      if(res) 
         for(int i=0; i<s1.topStr; i++) System.out.println(t[i]);
      else System.out.println("NO");
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      
      seq(size,sc);
      sc.close();
   }
}