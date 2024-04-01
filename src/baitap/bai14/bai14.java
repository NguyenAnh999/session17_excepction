package baitap.bai14;

import baitap.bai2.IsNoElement;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào số phần tử muốn thêm");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("   mời bạn nhập phần tử thứ"+(i+1));
            arr[i]=new Scanner(System.in).nextInt();
        }
        // kiểm tra ngoại lệ mảng rỗng
        checkEmpty(arr);
        int total=0;
        for (int i = 0; i < arr.length; i++) {
           total+=arr[i];
        }
        System.out.println("trung bình cộng của mảng là: "+total/n);
        sc.close();
        System.exit(0);
    }
    public static void checkEmpty(int[] arr) throws IsNoElement {
        if (arr.length == 0) {
            throw new IsNoElement("mảng của bạn không có phần tử nào, không thể tính tổng");
        }
    }
}
