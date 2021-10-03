package chap3;
import java.util.Scanner;

public class prac6
{
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        {

            System.out.print("금액을 입력하시오 >> ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            for(int i=0; i<unit.length; i++) {
                System.out.println(unit[i]+"원 짜리 :"+a/unit[i]);
                a = a-unit[i]*(a/unit[i]);




            }
        }
    }
}