package practice;

import java.util.Scanner;

class stack {
   int top;
   int[] arr;
   int size;
   
   public stack(int size) {
      this.size = size;
      this.arr = new int[size];
      this.top = -1;
   }
   
   public boolean is_empty() {
      if (top == -1)
         return true;
      else return false;
   }
   
   public boolean is_full() {
      if(top == size-1)
         return true;
      else return false;
   }
   
   public void push(int item) {
      if(is_full())
         System.exit(0);
      
      arr[++top] = item;
   }
   
   public int pop() {
      if(is_empty())
         System.exit(0);
      
      return arr[top--];
   }
   
   public int peak() {
      if(is_empty())
         System.exit(0);
      
      return arr[top];
   }
}

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int size;
      int num;
      char res[] = new char[200000];
      int cnt = 1;
      int index = 0;
      
      size = scan.nextInt();
      stack s = new stack(size);
      
      while (size--!=0) {
         num = scan.nextInt();
         if(cnt <= num) {
            for(; cnt <= num; cnt++) {
               s.push(cnt);
               res[index++] = '+';
            }
            s.pop();
            res[index++] = '-';
         }
         else if (s.peak() == num) {
            s.pop();
            res[index++] = '-';
         }
         else {
            System.out.println("No");
            System.exit(0);
         }
      }
      
      for(int i = 0; i<index;i++) {
         System.out.println(res[i]);
      }
      
      scan.close();
   }
   
}