import java.util.Scanner;

// 실습 1-3
// 숫자를 입력받아서 양수인지, 음수인지, 0인지를 알려주는 프로그램
public class JudgeSign {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 >> ");
        int num = stdIn.nextInt();

        if (num > 0) {
            System.out.println("양수 입니다!");
        } else if (num < 0) {
            System.out.println("음수 입니다!");
        } else {
            System.out.println("0 입니다!");
        }

        if (num == 1) {
            System.out.println(num);
        } else if (num == 2) {
            System.out.println(num);
        } else if (num == 3) {
            System.out.println(num);
        } // else문 생략


    }
}
