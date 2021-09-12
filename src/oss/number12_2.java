package oss;

import java.util.Scanner;

public class number12_2 {

	public static void main(String[] args) {
		System.out.println("연산");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		String s = sc.next();
		float num2 = sc.nextFloat();
		float result = 0;
		switch(s)
		{
		case "+" :
			result = num1+num2; 
			System.out.println(num1+s+num2+"의 계산결과는 "+result);
			break;
		case "-":
			result = num1-num2; 
			System.out.println(num1+s+num2+"의 계산결과는 "+result);
			break;
		case "*":
			result = num1*num2; 
			System.out.println(num1+s+num2+"의 계산결과는 "+result);
			break;
		case "/":			
				if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
			result = num1/num2;
			System.out.println(num1+s+num2+"의 계산결과는 "+result);
			break;
		default:
			System.out.println("+,-,*,/ 와같은 연산자가 아닙니다.");
		}
	}
}

