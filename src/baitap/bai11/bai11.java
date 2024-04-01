package baitap.bai11;
//Đề bài: Viết một chương trình Java để kiểm tra tính hợp lệ
// của một ngàytháng năm. Nếu ngày tháng năm không hợp lệ,
// chương trình sẽ hiển thị thông báo lỗi.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào ngày");
        int dd = Integer.parseInt(sc.nextLine());
        if (dd < 1 || dd > 31) {
            throw new InvalidDate("ngày không hợp lệ");
        }
        System.out.println("mời bạn nhập vào tháng");
        int MM = Integer.parseInt(sc.nextLine());
        if (MM < 1 || MM > 12) {
            throw new InvalidDate("tháng không hợp lệ");
        }
        System.out.println("mời bạn nhập vào năm");
        int yyyy = Integer.parseInt(sc.nextLine());
        if (yyyy < 1970 || yyyy > 2025) {
            throw new InvalidDate("năm không hợp lệ");
        }
        String date = dd + "/" + MM + "/" + yyyy;
        if (checkValid(date, dd, MM, yyyy)) {
            System.out.println("ngày hợp lệ");
        }
    }

    public static boolean checkValid(String date, int dd, int MM, int yyyy) throws InvalidDate {
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sfd.parse(date);
            return true;
        } catch (Exception e) {
            System.out.println("sai định dạng");
        }
        return false;
    }

}
