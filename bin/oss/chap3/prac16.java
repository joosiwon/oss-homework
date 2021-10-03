package chap3;
import java.util.Scanner;
public class prac16 {
    public static void main(String[] args) {
        String str[] = {"가위", "바위", "보"};
        String user; // 사용자가 선택한것 저장
        String com; // 컴퓨터가 선택한것 저장
        int n; //컴퓨터가 선택하는 것
        System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
        do {
            System.out.print("가위 바위 보! >> ");
            Scanner sc = new Scanner(System.in);
            user = sc.next();
            if(user.equals("그만")) break;
            n = (int)(Math.random()*3);
            com=str[n];
            if(user.equals("가위")) {
                if(str[n].equals("가위")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
                    continue;
                }
                else if(str[n].equals("바위")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
                    continue;
                }
                else if(str[n].equals("보")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
                    continue;
                }
            }
            else if(user.equals("바위")) {
                if(str[n].equals("가위")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
                    continue;
                }
                else if(str[n].equals("바위")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
                    continue;
                }
                else if(str[n].equals("보")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
                    continue;
                }
            }
            else if(user.equals("보")) {
                if(str[n].equals("가위")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
                    continue;
                }
                else if(str[n].equals("바위")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
                    continue;
                }
                else if(str[n].equals("보")) {
                    System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
                    continue;
                }
            }
            System.out.print("사용자 = "+user+" , 컴퓨터 = "+com+" ");
        }while(true);
        System.out.println("게임을 종료합니다...");
            }


    }

