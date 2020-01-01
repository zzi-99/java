package day01;

import java.util.Scanner;


public class three {

	public static void main(String[] args) {
	System.out.println("양의 정수 10개를 입력하세요.");
	int arr[]=new int [10];
	
	for(int i=0;i<10;i++) {
	Scanner sc=new Scanner(System.in);
	arr[i]=sc.nextInt();
	
	}

	System.out.println("3의 배수는"); 
	
	for(int i=0;i<10;i++) {
	if(arr[i]%3==0)
		System.out.print(arr[i]+" ");
	}
	}

}
