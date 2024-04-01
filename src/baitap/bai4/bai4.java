package baitap.bai4;

import java.text.ParseException;
import java.util.Arrays;

public class bai4 {
    public static void main(String[] args) {
        String[] strArr={"s","1","s","1","s","1","s","1","s","1","s","1",};
        int[] intArr=new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                try{
                    intArr[i]=Integer.parseInt(strArr[i]);
                }catch (NumberFormatException e){
                    System.err.println("số thứ"+(i+1)+" số nguyên");
                    intArr[i]=79234789;
                }catch (Exception er) {
                    System.out.println("lỗi");
                }
        }
        System.out.println(Arrays.toString(intArr));
    }
}
