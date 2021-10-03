package chap3;

public class prac12 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);

            } catch (NumberFormatException e) {  //정수형만 찾는 함수
                continue;
            }
        }
        System.out.println(sum);
    }
}
