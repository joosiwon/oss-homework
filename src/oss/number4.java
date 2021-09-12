package oss;

import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {
		System.out.println("정수 3개를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		
		if (num1>num2 && num1>num3) // num1 이 최댓값
		{
			if(num2>=num3)
				System.out.println("중간값은" + num2);
			else 
				System.out.println("중간값은" + num3);
		}
		else if (num2>num1 && num2>num3) // num2 가 최댓값
		{
			if(num1>=num3)
				System.out.println("중간값은" + num1);
			else 
				System.out.println("중간값은" + num3);
		}
		else if (num3>num2 && num3>num1) // num3 이 최댓값
		{
			if(num1>=num2)
				System.out.println("중간값은" + num1);
			else 
				System.out.println("중간값은" + num2);
		}
		
		
	}

}
