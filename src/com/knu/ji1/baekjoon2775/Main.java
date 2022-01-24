package com.knu.ji1.baekjoon2775;

import java.util.Scanner;

public class Main {

	public static int t(int k,int n) {
	    return k==0 ? n : n == 1? 1 : t(k - 1, n) + t(k, n - 1);
	}
	
	public static void main(String[] args) {
		int k, n;
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
	    while (T--!=0) {
	    	k = scan.nextInt();
	    	n = scan.nextInt();
	        System.out.println(t(k,n));
	    }
	}
}
