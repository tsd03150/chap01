import java.util.Scanner;

// 실습 1-6
// 양수만 입력하기
// 만약 n의 값이 음수 일경우에는 계속 반복
// 한 번 실행하고 조건을 검사하는 do-while문 사용
public class SumForPos {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("숫자를 입력해주세요 >> ");
            n = stdIn.nextInt();

        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 " +n+"까지의 합은 " + sum + "입니다.");

    }
}
