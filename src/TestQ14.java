// 연습문제 1-14
// 입력한 수를 한변으로 하는 정사각형을 출력하는 프로그램
import java.util.Scanner;

public class TestQ14 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 : ");
        int length = stdIn.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
