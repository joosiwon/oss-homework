package oss;

import java.util.Scanner;

public class number12 {

	public static void main(String[] args) {
		System.out.println("연산");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		String s = sc.next();
		float num2 = sc.nextFloat();
		
		if(s.equals("+"))
		{
			float result = num1+num2; 
			System.out.println(num1+s+num2+"의 계산결과는 "+result);
		}
			else if(s.equals("-"))
		{
			float result = num1-num2; 
			System.out.println(num1+s+num2+"의 계산결과는 "+result);
		}
		
		else if(s.equals("*"))
		{
			float result = num1*num2; 
			System.out.println(num1+s+num2+"의 계산결과는 "+result);
		}
		
		else if(s.equals("/"))
		{
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다");
			}
			else
			{
			float result = num1/num2;
			System.out.println(num1+s+num2+"의 계산결과는 "+result);
			}
		}
		else 
			System.out.println("+,-,*,/ 와같은 연산자가 아닙니다.");
	}
}
