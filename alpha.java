package day02;

import java.util.Scanner;

public class alpha {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("소문자 알파벳 하나를 입력하시오>>");
  String s = sc.next();
  if(s.length() != 1) {
   System.out.print("알파벳 하나만 입력해야 합니다!");
   sc.close();
   return;
  }
  
  char c = s.charAt(0);
  if (c < 'a' || c > 'z') {
   System.out.println("소문자 알파벳이 아닙니다.");
   sc.close();
   return;
  }
  
  for (char i=c; i>='a'; i--) {
   for (char j='a'; j<=i; j++)
    System.out.print(j);
   System.out.println();
  }
  
  sc.close();
 }
}
