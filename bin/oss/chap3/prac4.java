package chap3;

import java.util.Scanner; //scanner 함수를 사용하기 위한 라이브러리

public class prac4 {
    public static void main(String[] args) {

        System.out.println("소문자 알파벳 하나를 입력하시오");
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // 문자열 입력받기
        char c = s.charAt(0); // 입력받은 문자열중에서 첫번째 문자를 c에 대입
        for (int i = 0; i<= c-'a';i++)
        {


            for(int j = 'a' ; j<= c-i;j++)
            {
                System.out.print((char)j); // j의 아스키코드 값을 문자로 출력하기 위함

            }
            System.out.println();
        }


    }
}