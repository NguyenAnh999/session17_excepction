package baitap.bai9;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {

        System.out.println("mòi bạn nhập vào số n (số fibonacci thứ n)");
        Scanner sc = new Scanner(System.in);
        int n = fibonacci(sc.nextInt());
        sc.close();
        System.out.println("số fibonacci bạn muốn tìm là "+n);
    }

    public static int fibonacci(int n) throws IsNotFibonacci {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            throw new IsNotFibonacci("bạn phải nhập vào 1 số nguyên dương");
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
}