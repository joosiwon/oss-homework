package oss;

import java.util.Scanner;


public class number2 {
	public static void main(String[] args) {
		
	
		System.out.println("2�ڸ��� ���� �Է�(10~99)");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num>=10&&num<=99)
		{
			if(num % 10 == num / 10) {
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			}
			else
			{
				System.out.println("NO! 10�� �ڸ��� 1�� �ڸ��� �����ʽ��ϴ�.");
			}
				
		}
		else
			System.out.println("���ڸ� ������ �ƴմϴ�.");
		
	
		
	}

}
