package oss;

import java.util.Scanner;


public class number2 {
	public static void main(String[] args) {
		
	
		System.out.println("2자리수 정수 입력(10~99)");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num>=10&&num<=99)
		{
			if(num % 10 == num / 10) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			}
			else
			{
				System.out.println("NO! 10의 자리와 1의 자리가 같지않습니다.");
			}
				
		}
		else
			System.out.println("두자리 정수가 아닙니다.");
		
	
		
	}

}
