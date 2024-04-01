package baitap.bai8;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        // tìm số nguyên tố { sai thì kết thúc chương trình}
        System.out.println("mời bạn nhập số muốn tìm");
        int a = new Scanner(System.in).nextInt();
        checkNumber(a);
        System.out.println("số "+a+" là số nguyên tố");
    }
    public static int checkNumber(int a) throws IsNotPrimeNumber{
        boolean isPrimeNumber = true;
        for (int i = 3; i < a; i++) {
            if (a%i==0){
                isPrimeNumber=false;
            }
        }
        if (a<1){
            isPrimeNumber=false;
        }
        if (isPrimeNumber){
            return a;
        }else {
            throw new IsNotPrimeNumber("đây không phải số nguyên tố");
        }
    }
}
