// 실습 1-8
// 직각 이등변 삼각형을 출력하는 프로그램

import java.util.Scanner;

public class TriangleLB {

    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLW(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRW(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void spira(int n) {
        int hol = 1;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= ((((n - 1) * 2) + 1) / 2) - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= hol; k++) {
                System.out.print(num);
            }

//            for (int l = ((n - 1) * 2) + 1; l > ((((n - 1) * 2) + 1) / 2) + i; l--) {
//                System.out.print(" ");
//            }

            num++;
            hol += 2;
            System.out.println();
        }
    }


    public static void main(String[] args) {

//        Scanner stdIn = new Scanner(System.in);
//
//        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
//        System.out.print("몇 단 삼각형 입니까?");
//        int n1 = stdIn.nextInt();
//        triangleLB(n1);
//
//        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
//        System.out.print("몇 단 삼각형 입니까?");
//        int n2 = stdIn.nextInt();
//        triangleLW(n2);
//
//        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
//        System.out.print("몇 단 삼각형 입니까?");
//        int n3 = stdIn.nextInt();
//        triangleRB(n3);
//
//        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
//        System.out.print("몇 단 삼각형 입니까?");
//        int n4 = stdIn.nextInt();
//        triangleRW(n4);

        spira(5);


    }
}
