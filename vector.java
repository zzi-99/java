package day02;

import java.util.Scanner;
import java.util.Vector;
 
public class vector {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vector<Double> v = new Vector<Double>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            v.add(sc.nextDouble()); 
        }
        double max = v.get(0);
        for(int i=0; i<v.size(); i++){
            if(v.get(i)>max){
                max=v.get(i);
            }
        }
        System.out.println("���� ū ���� "+ max);
         
    }
 
}