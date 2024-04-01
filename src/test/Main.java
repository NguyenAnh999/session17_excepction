package test;

import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//  checked  Exception lỗi trng lúc viết code
//  Unchecked Exception lỗi trong lúc chạy VD:  chia cho 0, cố gắng lấy phần tử nằm ngoài mảng
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            sfd.parse("12/12/2022");
//        } catch (ParseExceptionCustom e) {
//            throw new ParseExceptionCustom(e);
//        }

        try {
            checkEdge(0,0);
        } catch (EdgeExceptions e) {
            System.err.println(e.getMessage());
        }

    }
    public static void checkEdge(int a,int b) throws EdgeExceptions{
        if (a<=0||b<=0){
            throw new EdgeExceptions();
        }
    }
}
