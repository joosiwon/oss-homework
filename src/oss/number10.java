package oss;

import java.util.Scanner;

public class number10 {
	
	public static void main(String[] args) {
		System.out.println("첫번째 원의 중심과 반지름 입력");
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius1 = sc.nextDouble();
		System.out.println("두번째 원의 중신과 반지름 입력");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double radius2 = sc.nextDouble();
		
		double result=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		
         if(result <= radius1+radius2)
         {
        	 System.out.println("두 원은 서로 겹친다.");
         }
         
         else
        	 System.out.println("두 원은 서로 겹치지 않는다");
  
         

	}

}
