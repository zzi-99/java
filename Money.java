package day01;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
	System.out.print("��ȭ�� �Է��ϼ���.");
	Scanner sc=new Scanner(System.in);//�Է¹���
	int won=sc.nextInt();//���������� ����
	float dollar=won/1100;//1100�� ����� �޷��� ����
	System.out.println(won+"����  $"+dollar+"�Դϴ�.");
	
	}

}
