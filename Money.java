package day01;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
	System.out.print("원화를 입력하세요.");
	Scanner sc=new Scanner(System.in);//입력받음
	int won=sc.nextInt();//정수형으로 받음
	float dollar=won/1100;//1100로 나누어서 달러를 구함
	System.out.println(won+"원은  $"+dollar+"입니다.");
	
	}

}
