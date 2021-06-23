// 중간값을 찾아주는 프로그램
public class Median {

    static int med3(int a, int b ,int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a >= c) {
                return c;
            } else {
                return a;
            }
        }
        // b > a
        else if (c > b) {
            return b;
        } else if (a >= c) {
            return a;
        } else {
            return c;
        }

    }

    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // a＞b＞c
        System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // a＞b＝c
        System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // a＞c＞b
        System.out.println("med3(3,2,3) = " + med3(3, 2, 3)); // a＝c＞b
        System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // c＞a＞b
        System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // a＝b＞c
        System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // a＝b＝c
        System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // c＞a＝b
        System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // b＞a＞c
        System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // b＞a＝c
        System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // b＞c＞a
        System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // b＝c＞a
        System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // c＞b＞a
    }
}