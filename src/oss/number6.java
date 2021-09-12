package oss;

import java.util.Scanner;

public class number6 { // 오류 3이하일때 대처가 안됌

	public static void main(String[] args) {
	
		System.out.println("1부터 99 사이의 정수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num>=10&&num<=99) {
		int num10 = num/10; // 10의 자리수
		int num1 = num%10; // 1의 자리수
		
		
		
		if(num10%3==0&&num1%3==0)
		{
			System.out.println("박수짝짝");
			
		}
		else if(num10%3==0||num1%3==0)
		{
			System.out.println("박수짝");
		}
		else 
			System.out.println("박수x");

}
		else if(num<10&&num>=1&&num%3==0)
			System.out.println("박수짝");
		else if(num<10&&num>=1&&num%3!=0)
			System.out.println("박수x");
		
		else
			System.out.println("1부터 99사이의 정수가 아닙니다.");
		
	}
}
