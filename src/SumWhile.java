// 실습 1-4
// 1부터 n까지의 정수 합 구하기 - while문 반복

import java.util.Scanner;

public class SumWhile {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("n값을 입력해주세요!");
        int n = stdIn.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n) {
           sum += i;
           i++;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("i의 값은 " + i);

        // 사전 조건에서는 1부터 n까지의 합은
        // 1부터 n까지의 숫자를 모두 더하고
        // i의 값은 n+1이 된다


    }

}
