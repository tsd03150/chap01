// 실습 1-5
// 1부터 n까지의 정수 합 구하기 - for문 반복

import java.util.Scanner;

public class SumFor {

    public static void main(String[] args) {

        int sum = 0;

        Scanner stdIn = new Scanner(System.in);
        System.out.print("1부터 n까지의 합을 구하는 프로그램 입니다. n값을 입력해주세요 >> ");

        int n = stdIn.nextInt();
        String tmp = "";

        for (int i = 1; i <= n; i++) {
            sum += i;

            if (i == n) {
                tmp += i + " = ";
                break;
            }

            tmp += i + " + ";
        }

        System.out.println(tmp + sum);

    }

}
