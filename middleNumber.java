package day01;

import java.util.Scanner;

public class middleNumber {

	public static void main(String[] args) {
	
		System.out.println("���� 3�� �Է�");
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && b>c)
			System.out.println("�߰� ����"+b);
		else if(a<b && b<c)
			System.out.println("�߰� ���� "+b);
		else if(b>a && a>c)
			System.out.println("�߰� ���� "+a);
		else if(b<a && a<c)
			System.out.println("�߰� ���� "+a);
		else if(b>c && c>a)
			System.out.println("�߰� ���� "+c);
		else if(b<c && c<a)
			System.out.println("�߰� ���� "+c);
		
		s.close();
	}

}
