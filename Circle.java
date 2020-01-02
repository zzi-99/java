package day02;

import java.util.Scanner;

public class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double area() {
        return radius * radius * 3.14;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Circle c[] = new Circle[3];
        double max;
        int j = 0;
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius==>");
            Double x = s.nextDouble();
            Double y = s.nextDouble();
            int radius = s.nextInt();

            c[i] = new Circle(x, y, radius);
        }
        max = c[0].area();

        for (int i = 0; i < c.length; i++) {
            if (max < c[i].area()) {
                max = c[i].area();
                j = i;
            }
        }
        System.out.println("가장 큰 면적인 큰 원은" + "(" + c[j].x + "," + c[j].y + ")" + c[j].radius);
    }
} 
