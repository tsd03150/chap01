// 연습문제 1-9
// 정수 a,b를 포함한 그 사이의 모든 정수의 합을 구하는 프로그램
import java.util.Scanner;

public class TestQ9 {

    static int sumOf(int a, int b) {
        int sum = 0;

        if (a > b) {
            for (;b <= a; b++) {
                sum += b;
            }
        } else if (b > a) {
            for (; a <= b; a++) {
                sum += a;
            }
        } else {
            sum = a;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a를 입력해주세요 >> ");
        int num1 = stdIn.nextInt();
        System.out.print("b를 입력해주세요 >> ");
        int num2 = stdIn.nextInt();

        System.out.println(num1+" 과 "+num2+"를 포함한 사이의 합은 " + sumOf(num1,num2) +"입니다.");




    }
}
