package day01;

import java.util.*;

public class Subject {
	

	public static void main(String[] args) {
		
	String course[]={"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
	int score[]={95, 88, 76, 62, 55};
	
	System.out.print("���� �̸�>>");
	
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	
	for(int i=0;i<5;i++) {
	if(name.equals(course[i])) {
		System.out.println(course[i]+"�� ������ "+score[i]+"�Դϴ�");
	   break;
	}
	else
		System.out.print("�����");
	break;
	}
	}

}
