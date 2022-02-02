package com.knu.ji1.changsu3;
import java.util.Scanner;

public class MyBankAccount {
	private String bankName;
	private int money;
	private Scanner sc;
	
	public MyBankAccount(String bankName, int initMoney, Scanner scanner) {
		this.bankName = bankName;
		this.money = initMoney;
		this.sc = scanner;
	}
	
	//입금기능
	public void deposit(int money) {
		if(money<10000||money%10000!=0) {
			System.out.println("10000원 단위의 금액을 입력하세요");
		}else {
			this.money +=money;
			this.showBalance();
		}
	}
	//출금 기능
	public void withdraw(int money) {
		if(money<10000||money%10000!=0) {
			System.out.println("10000원 단위의 금액을 입력하세요");
		}else if(this.money<money) {
			System.out.println("----------------------------\r\n"
					+ "잔액이 모자랍니다.");
		}else {
			this.money -=money;
			this.showBalance();
		}
	}
	//잔액 조회
	public void showBalance() {
		System.out.println("----------------------------\r\n"
				+ this.bankName+"Bank의 잔액: "+this.money);
	}
	//잔액 읽기
	public int readBalance() {
		return this.money;
	}
	
	public void select() {
		while(true) {
			System.out.print("-----------------------------------------------\r\n"
				+ this.bankName+" Bank 현금 입출금 프로그램\r\n"
				+ "1.입금\r\n"
				+ "2.출금\r\n"
				+ "3.계좌조회\r\n"
				+ "4.종료\r\n"
				+ ">>");
			switch(sc.nextInt()) {
			case 1:
				System.out.print("입금금액: ");
				this.deposit(sc.nextInt());
				break;
			case 2:
				System.out.print("출금금액: ");
				this.withdraw(sc.nextInt());
				break;
			case 3:
				this.showBalance();
				break;
			case 4:
				System.out.println(this.bankName+"Bank 종료합니다.");
				return;
			default:
				System.out.println("--------------------------------\r\n"
						+ "잘못된 입력입니다. 다시 입력하세요.");
			}
		}
	}
}
