package com.knu.ji1.tuto;

import java.util.Scanner;

public class tuto {
	public static int[] createNumArray() {
		int[] lotto= new int[6];
		for(int i = 0;i<6;i++) {
			int r;
			do {
				r = (int) (Math.random() *45 +1);
			}while(isContain(lotto,r));
			lotto[i] = r;
		}
		return lotto;
	}
	
	public static boolean isContain(int[] lotto,int n) {
		for(int i: lotto)
			if(i==n) 
				return true;
		return false;
	}
	
	public static void printLotto(int n,int[] lotto) {
		System.out.print("Lotto ["+n+"]: ");
		for(int i: lotto) {
			System.out.print(i+" ");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		System.out.print("Lotto 수행 회수(1~5):");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a<1||a>5) {
			System.out.println("Please input a number between 1 and 5!\nExit.");
			return;
		}
		for(int i=0;i<a;i++) {
			int[] lotto = createNumArray();
			printLotto(i,lotto);
		}
		scan.close();
    }
}