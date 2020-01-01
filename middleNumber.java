package day01;

import java.util.Scanner;

public class middleNumber {

	public static void main(String[] args) {
	
		System.out.println("정수 3개 입력");
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && b>c)
			System.out.println("중간 값은"+b);
		else if(a<b && b<c)
			System.out.println("중간 값은 "+b);
		else if(b>a && a>c)
			System.out.println("중간 값은 "+a);
		else if(b<a && a<c)
			System.out.println("중간 값은 "+a);
		else if(b>c && c>a)
			System.out.println("중간 값은 "+c);
		else if(b<c && c<a)
			System.out.println("중간 값은 "+c);
		
		s.close();
	}

}
