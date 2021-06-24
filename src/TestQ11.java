// 연습문제 1-11

import java.util.Scanner;

public class TestQ11 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("양수만 입력해주세요 >> ");
            num = stdIn.nextInt();

        } while (num < 0);

        int i = 0;

        for (; num > 0; i++) {
            num/=10;
        }

        System.out.println("그 수는 " + i + "자리입니다.");

    }
}
