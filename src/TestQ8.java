// 연습문제 1-8
// 가우스의 덧셈

import java.util.Scanner;

public class TestQ8 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 >> ");
        int n = stdIn.nextInt();
        System.out.println("1부터 " + n + "까지의 합을 구하는 가우스 덧셈" );


        System.out.print((int)((1+n)*(n/2.0)));


    }


}
