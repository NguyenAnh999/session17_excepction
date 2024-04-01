package baitap.bai1;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Stack;

public class bai1 {
    /*Mục tiêu: luyện tập ném và bắt ngoại lệ
     *
     *Đề bài:  Viết một chương trình Java để tính tổng của hai số nguyên nhập vào
     * từ bàn phím. Nếu người dùng nhập vào một giá trị không phải số nguyên,
     *  chương trình sẽ hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.
     * */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //- Bước 1: Khai báo biến
        int a, b;
        //Bước 2: Lặp cho đến khi nhập đúng
        while (true) {
            try{
                System.out.println("mời bạn nhập số thứ nhất");
                a = Integer.parseInt(sc.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("số bạn nhập không phải là 1 số nguyên ");
            }catch (Exception er) {
                System.out.println("lỗi");
            }
        }
        while (true) {
            try{
                System.out.println("mời bạn nhập số thứ hai");
                b = Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.err.println("số bạn nhập không phải là 1 số nguyên ");
            }

        }
       // Bước 3: Tính tổng và hiển thị kết quả

        System.out.println("tổng của chúng là"+(a+b));
    }
}
