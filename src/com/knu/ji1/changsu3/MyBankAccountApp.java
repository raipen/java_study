package com.knu.ji1.changsu3;
import java.util.Scanner;

public class MyBankAccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyBankAccount bank[] = {new MyBankAccount("ABC", 10000,sc),new MyBankAccount("XYZ", 10000,sc)};
		while(true) {
			System.out.print("���� ������� ���� ���α׷�\r\n"
					+"---------------------------\r\n"
					+ "�޴��� �����ϼ���.(0: ABC bank, 1: XYZ bank, 2: ��ü ������ȸ, 3: ����) >>");
			int a = sc.nextInt();
			switch(a) {
			case 0: case 1:
				bank[a].select();
				break;
			case 2:
				System.out.println("-----------------------------------------------\r\n"
						+ "ABC bank Bank�� �ܾ�: "+bank[0].readBalance()+"\r\n"
						+ "XYZ bank Bank�� �ܾ�: "+bank[1].readBalance()+"\r\n"
						+ "��ü ���� �ܾ��� "+(bank[0].readBalance()+bank[1].readBalance())+"�Դϴ�.");
				break;
			case 3:
				System.out.println("-----------------------------------------------\r\n"
						+ "���� ������� ���� ���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			} 
		}
	}
}