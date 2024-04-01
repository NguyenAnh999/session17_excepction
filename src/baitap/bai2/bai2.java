package baitap.bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("mời bạn nhập vào số phần tử muốn thêm");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("   mời bạn nhập phần tử thứ"+(i+1));
            arr[i]=new Scanner(System.in).nextInt();
        }
        // kiểm tra ngoại lệ mảng rỗng
            checkEmpty(arr);
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.println("số lơn nhất là: "+max);

    }
    public static void checkEmpty(int[] arr) throws IsNoElement {
        if (arr.length == 0) {
            throw new IsNoElement("mảng của bạn không có phần tử nào, không thể tìm max");
        }
    }

}
