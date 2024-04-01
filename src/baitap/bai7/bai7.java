package baitap.bai7;

import java.text.ParseException;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class bai7 {
    /*
    * Đề bài: Viết một chương trình Java để tìm số lớn nhất trong hai số
    * nguyên được nhập vào từ bàn phím. Nếu người dùng nhập vào một giá
    * trị không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và
    * yêu cầu người dùng nhập lại.

     * */
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("mời bạn nhập vào 2 số muốn so sánh");
        int a = getA();
        int b = getB();
        System.out.println("số lớn nhất là: "+Math.max(a,b));
    }
    public static int getA (){
     while (true){
         try{
             System.out.print("số a = ");
             return Integer.parseInt(sc.nextLine());
         }catch (NumberFormatException e){
             System.out.println(" số bạn nhâp phải là số nguyên nhập lại");
         }catch (Exception er) {
             System.out.println("lỗi");
         }
     }
    }



    public static int getB (){
      while (true){
          try{
              System.out.print("số b = ");
              return Integer.parseInt(sc.nextLine());
          }catch (NumberFormatException e){
              System.out.println("số bạn nhâp phải là số nguyên nhập lại ");
          }catch (Exception er) {
              System.out.println("lỗi");
          }
      }
    }

}
