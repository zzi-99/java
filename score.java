package day02;

import java.util.ArrayList;
import java.util.Scanner;
 
public class score{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arraylist = new ArrayList<String>();
        for(int i=0; i<10; i++){
            arraylist.add(sc.next());
        }
         
        for(int i=0; i<arraylist.size(); i++){
            switch(arraylist.get(i)){
                case "A":
                    System.out.println(4.0);
                    break;
                case "B":
                    System.out.println(3.0);
                    break;
                case "C":
                    System.out.println(2.0);
                    break;
                case "D":
                    System.out.println(1.0);
                    break;
                case "F":
                    System.out.println(0);
                    break;
                default:
                    System.out.println("�߸��� �� �Է�");
                    break;
            }
        }
    }
}