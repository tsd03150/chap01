// 세 개의 정수를 입력 받아서 MAX값 찾는 프로그램


import java.util.Scanner;

public class Max3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("첫번째 값을 입력해주세요. >> "); int a = stdIn.nextInt();
        System.out.print("두번째 값을 입력해주세요. >> "); int b = stdIn.nextInt();
        System.out.print("세번째 값을 입력해주세요. >> "); int c = stdIn.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("최대값은 " + max +" 입니다.");
    }
}
