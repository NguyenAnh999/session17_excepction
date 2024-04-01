package baitap.bai3;

public class bai3 {
    public static void main(String[] args) {
        String[] strArr={"s","1","s","1","s","1","s","1","s","1","s","1",};
       int total=0;

        for (int i = 0; i < strArr.length; i++) {
            try {
                total+=Integer.parseInt(strArr[i]);
            }catch (NumberFormatException e){
                System.err.println("phần tử "+(i+1)+" không phải số nguyên");
            }catch (Exception er) {
                System.out.println("lỗi");
            }
        }
        System.out.println(total);
    }
}
