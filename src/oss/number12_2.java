package oss;

import java.util.Scanner;

public class number12_2 {

	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		String s = sc.next();
		float num2 = sc.nextFloat();
		float result = 0;
		switch(s)
		{
		case "+" :
			result = num1+num2; 
			System.out.println(num1+s+num2+"�� ������� "+result);
			break;
		case "-":
			result = num1-num2; 
			System.out.println(num1+s+num2+"�� ������� "+result);
			break;
		case "*":
			result = num1*num2; 
			System.out.println(num1+s+num2+"�� ������� "+result);
			break;
		case "/":			
				if(num2==0)
				System.out.println("0���� ���� �� �����ϴ�");
			else
			result = num1/num2;
			System.out.println(num1+s+num2+"�� ������� "+result);
			break;
		default:
			System.out.println("+,-,*,/ �Ͱ��� �����ڰ� �ƴմϴ�.");
		}
	}
}

