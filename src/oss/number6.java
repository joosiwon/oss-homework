package oss;

import java.util.Scanner;

public class number6 { // ���� 3�����϶� ��ó�� �ȉ�

	public static void main(String[] args) {
	
		System.out.println("1���� 99 ������ ������ �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num>=10&&num<=99) {
		int num10 = num/10; // 10�� �ڸ���
		int num1 = num%10; // 1�� �ڸ���
		
		
		
		if(num10%3==0&&num1%3==0)
		{
			System.out.println("�ڼ�¦¦");
			
		}
		else if(num10%3==0||num1%3==0)
		{
			System.out.println("�ڼ�¦");
		}
		else 
			System.out.println("�ڼ�x");

}
		else if(num<10&&num>=1&&num%3==0)
			System.out.println("�ڼ�¦");
		else if(num<10&&num>=1&&num%3!=0)
			System.out.println("�ڼ�x");
		
		else
			System.out.println("1���� 99������ ������ �ƴմϴ�.");
		
	}
}
