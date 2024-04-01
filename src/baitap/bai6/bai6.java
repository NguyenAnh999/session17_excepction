package baitap.bai6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào số chia");
        int  a = sc.nextInt();
        System.out.println("mời bạn nhập vào số bị chia");
        int  b = sc.nextInt();
        try {
            checkInt(b);
            int c = a/b;
            System.out.println("thương của 2 số bạn vừa nhập là: "+c);
        } catch (IsNotZero e) {
            System.err.println(e.getMessage());
        }

    }


    public static void checkInt(int b) throws IsNotZero{
        if (b==0){
            throw new IsNotZero("số bị chia không thể bằng '0' ");
        }
    }
}
