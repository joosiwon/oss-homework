package oss;

import java.util.Scanner;

public class number10 {
	
	public static void main(String[] args) {
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�");
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double radius1 = sc.nextDouble();
		System.out.println("�ι�° ���� �߽Ű� ������ �Է�");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double radius2 = sc.nextDouble();
		
		double result=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		
         if(result <= radius1+radius2)
         {
        	 System.out.println("�� ���� ���� ��ģ��.");
         }
         
         else
        	 System.out.println("�� ���� ���� ��ġ�� �ʴ´�");
  
         

	}

}
