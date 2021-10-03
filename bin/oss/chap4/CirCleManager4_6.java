package chap4;

import java.util.Scanner;

class Circle
{
    private double x,y;
    private int radius;
    public Circle(double x, double y,int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show()
    {
        System.out.printf("(%d,%d)%d",x,y,radius);
    }
    public  int getRadius()
    {
        return  radius;
    }
}
public class CirCleManager4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3];
        int max = 0;
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>>");
            double x = sc.nextDouble(); // x 값이 읽기
            double y = sc.nextDouble();// y 값이 읽기
            int radius = sc.nextInt();// 반지름 읽기
            c[i] = new Circle(x, y, radius);  // circle 객체 생성

        }
        for (int i = 0; i < c.length; i++)

            if (max < c[i].getRadius())
            {
                max = c[i].getRadius();
             }
        for (int i = 0; i < c.length; i++) {
            if (max == c[i].getRadius()) {
                System.out.print("가장 면적인 큰 원은 ");
                c[i].show();
            }
        }

        sc.close();
    }

        }




