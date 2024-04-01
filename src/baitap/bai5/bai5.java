package baitap.bai5;

public class bai5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 5, 67, 87, 9, 546};
        System.out.println("số "+ searchNumber(876876,arr)+" có tồn tại trong mảng");
    }

    public static int searchNumber(int number, int[] arr) throws NotFound {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return number;
            }
        }
        throw new NotFound("không tim thấy số của bạn");
    }
}
