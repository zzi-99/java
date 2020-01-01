package day01;

import java.util.Scanner;

public class Same {

	public static void main(String[] args) {
		
System.out.print("2자리수 정수 입력(10~99) >>");
Scanner sc=new Scanner(System.in);//입력받음
int num1=sc.nextInt();//정수형으로 받음
int num2=num1/10;//십의 자리
int num3=num1%10;//일의 자리
if(num2==num3)//십의 자리와 일의 자리가 같으면
	System.out.println("10자리와 1의 자리가 같습니다.");
else//다르면
	System.out.println("10자리와 1의 자리가 다릅니다.");
	}

}
