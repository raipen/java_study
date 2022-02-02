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
	
	//�Աݱ��
	public void deposit(int money) {
		if(money<10000||money%10000!=0) {
			System.out.println("10000�� ������ �ݾ��� �Է��ϼ���");
		}else {
			this.money +=money;
			this.showBalance();
		}
	}
	//��� ���
	public void withdraw(int money) {
		if(money<10000||money%10000!=0) {
			System.out.println("10000�� ������ �ݾ��� �Է��ϼ���");
		}else if(this.money<money) {
			System.out.println("----------------------------\r\n"
					+ "�ܾ��� ���ڶ��ϴ�.");
		}else {
			this.money -=money;
			this.showBalance();
		}
	}
	//�ܾ� ��ȸ
	public void showBalance() {
		System.out.println("----------------------------\r\n"
				+ this.bankName+"Bank�� �ܾ�: "+this.money);
	}
	//�ܾ� �б�
	public int readBalance() {
		return this.money;
	}
	
	public void select() {
		while(true) {
			System.out.print("-----------------------------------------------\r\n"
				+ this.bankName+" Bank ���� ����� ���α׷�\r\n"
				+ "1.�Ա�\r\n"
				+ "2.���\r\n"
				+ "3.������ȸ\r\n"
				+ "4.����\r\n"
				+ ">>");
			switch(sc.nextInt()) {
			case 1:
				System.out.print("�Աݱݾ�: ");
				this.deposit(sc.nextInt());
				break;
			case 2:
				System.out.print("��ݱݾ�: ");
				this.withdraw(sc.nextInt());
				break;
			case 3:
				this.showBalance();
				break;
			case 4:
				System.out.println(this.bankName+"Bank �����մϴ�.");
				return;
			default:
				System.out.println("--------------------------------\r\n"
						+ "�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}
	}
}
