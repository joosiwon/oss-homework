package oss;

import java.util.Scanner;

public class number8 {

public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
{
 if ((x>=rectx1 && x<= rectx2) && (y>=recty1 && y <= recty2))	
 		return true;
 		else return false;

}

	public static void main(String[] args) {
		System.out.println("점 (x1,y1)의 좌표를 입력하시오");
			Scanner sc = new Scanner(System.in);
			int x1 = sc.nextInt(); 
			int y1 = sc.nextInt();
			System.out.println("점 (x2,y2)의 좌표를 입력하시오");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			boolean Rect1 = inRect(x1,y1,100,100,200,200);
			boolean Rect2 = inRect(x2,y2,100,100,200,200);
			if (Rect1==true || Rect2 == true)
			{
				System.out.println("사각형과 충돌합니다.");
			}
			else 
			System.out.println("사각형과 충돌하지 않습니다");
			
			
			
		// TODO Auto-generated method stub

	}

}

