// 실습 1C-2
// 두자리의 양수만 입력받는 프로그램

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("두자리의 양수만 입력해주세요 >> ");
            num = stdIn.nextInt();

        } while (num < 10 || num > 99);

        System.out.println("입력한 값은 두 자리 양수 " + num +"입니다");


    }
}
