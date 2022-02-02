package com.raipen.javatutorials.eclipse;
import java.util.Scanner;

public class Num1 {
	public static int check(int k,int num,int[] array) {
	      for(int i=0; i<num; i++) {
	         if(k==array[i]) {
	            return 0;
	         }
	      }
	      return 1;
	   }
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int a= scan.nextInt();
      int[] lotto = new int[6];
      if(a<1||a>5) {
      System.out.println("Please input a number between 1 and 5!");
      System.out.println("Exit.");
      }   
      else {
         for(int i=0; i<a; i++) {
          int r = (int)(Math.random() * 45 + 1);
             if(check(r,a,lotto)==1) {
                lotto[i]=r;
             }
             else 
                continue;
         }
      }
      scan.close();
    }
}
