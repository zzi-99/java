package day01;

import java.util.*;

public class Subject {
	

	public static void main(String[] args) {
		
	String course[]={"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
	int score[]={95, 88, 76, 62, 55};
	
	System.out.print("과목 이름>>");
	
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	
	for(int i=0;i<5;i++) {
	if(name.equals(course[i])) {
		System.out.println(course[i]+"의 점수는 "+score[i]+"입니다");
	   break;
	}
	else
		System.out.print("없어요");
	break;
	}
	}

}
