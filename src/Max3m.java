// 실습 1-2

public class Max3m {

    // 세 개의 정수를 입력 받아서 MAX값 찾는 메서드
    static int max3(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    // 네 개의 정수를 입력 받아서 MAX값 찾는 메서드
    static int max4(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;
    }

    // 세 개의 정수를 입력 받아서 MIN값 찾는 메서드
    static int min3(int a, int b, int c) {
        int min = a;

        if (min > b) {
            min = b;
        }

        if (min > c) {
            min = c;
        }
        return min;
    }

    // 네 개의 정수를 입력 받아서 MAX값 찾는 메서드
    static int min4(int a, int b, int c, int d) {
        int min = a;

        if (min > b) {
            min = b;
        }

        if (min > c) {
            min = c;
        }

        if (min > d) {
            min = d;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(min3(3,2,1));
        System.out.println(min3(3,2,2));
        System.out.println(min3(3,2,1));
        System.out.println(min3(3,3,1));
        System.out.println(min3(3,2,2));
        System.out.println(min3(3,2,1));
        System.out.println(min3(3,3,3));
        System.out.println(min3(3,3,2));
        System.out.println(min3(3,2,1));
        System.out.println(min3(3,2,2));
        System.out.println(min3(3,2,1));
        System.out.println(min3(3,3,2));
        System.out.println(min3(3,2,1));
        System.out.println(min4(4,3,2,1));
        System.out.println(min4(1,1,1,4));
    }


}
