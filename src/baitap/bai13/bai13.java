package baitap.bai13;

import baitap.bai10.NegativeNumbers;
import baitap.bai6.IsNotZero;

public class bai13 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        checkInt(num1,num2);
        int result = gcd(num1, num2);
        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là " + result + ".");
    }
    public static void checkInt(int b,int a)throws AllNotZero{
        if (b==0&&a==0){
            throw new AllNotZero("1 trong 2 số phải khác 0");
        }
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
