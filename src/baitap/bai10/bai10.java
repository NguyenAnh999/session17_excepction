package baitap.bai10;

import baitap.bai6.IsNotZero;

import java.util.Scanner;
public class bai10 {
    static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("mòi bạn nhập vào độ dài bán kính");
        Scanner sc = new Scanner(System.in);
        double r=0;
        while (true){
             r = sc.nextFloat();
            try {
                checkInt(r);
                break;
            } catch (NegativeNumbers e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("diện tích hình tròn là: "+r*r*PI);

    }

    public static void checkInt(double b) throws NegativeNumbers {
        if (b<0){
            throw new NegativeNumbers("độ dài bán kính không được âm mời nhập lại");
        }
    }
}
