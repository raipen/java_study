package com.knu.ji1.changsu3;
import java.util.Scanner;

public class MyBankAccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyBankAccount bank[] = {new MyBankAccount("ABC", 10000,sc),new MyBankAccount("XYZ", 10000,sc)};
		while(true) {
			System.out.print("통합 은행계좌 관리 프로그램\r\n"
					+"---------------------------\r\n"
					+ "메뉴를 선택하세요.(0: ABC bank, 1: XYZ bank, 2: 전체 계좌조회, 3: 종료) >>");
			int a = sc.nextInt();
			switch(a) {
			case 0: case 1:
				bank[a].select();
				break;
			case 2:
				System.out.println("-----------------------------------------------\r\n"
						+ "ABC bank Bank의 잔액: "+bank[0].readBalance()+"\r\n"
						+ "XYZ bank Bank의 잔액: "+bank[1].readBalance()+"\r\n"
						+ "전체 통장 잔액은 "+(bank[0].readBalance()+bank[1].readBalance())+"입니다.");
				break;
			case 3:
				System.out.println("-----------------------------------------------\r\n"
						+ "통합 은행계좌 관리 프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			} 
		}
	}
}