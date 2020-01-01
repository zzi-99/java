package day01;

import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		
		System.out.print("정수를 입력하세요>>");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) { 
			for(int j=1; j<n-i; j++) {
				System.out.print(" "); 
				} 
			for(int k=0; k<i*2+1; k++) { 
				System.out.print("*");
				}
			System.out.println();
			}

		
	
	}

}
