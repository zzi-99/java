package day01;

import java.util.Scanner;


public class three {

	public static void main(String[] args) {
	System.out.println("���� ���� 10���� �Է��ϼ���.");
	int arr[]=new int [10];
	
	for(int i=0;i<10;i++) {
	Scanner sc=new Scanner(System.in);
	arr[i]=sc.nextInt();
	
	}

	System.out.println("3�� �����"); 
	
	for(int i=0;i<10;i++) {
	if(arr[i]%3==0)
		System.out.print(arr[i]+" ");
	}
	}

}
