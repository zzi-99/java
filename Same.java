package day01;

import java.util.Scanner;

public class Same {

	public static void main(String[] args) {
		
System.out.print("2�ڸ��� ���� �Է�(10~99) >>");
Scanner sc=new Scanner(System.in);//�Է¹���
int num1=sc.nextInt();//���������� ����
int num2=num1/10;//���� �ڸ�
int num3=num1%10;//���� �ڸ�
if(num2==num3)//���� �ڸ��� ���� �ڸ��� ������
	System.out.println("10�ڸ��� 1�� �ڸ��� �����ϴ�.");
else//�ٸ���
	System.out.println("10�ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
	}

}
