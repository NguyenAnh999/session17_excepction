package baitap.bai15;

public class bai15 {
    public static void main(String[] args) {
        try {
            checkTriangle(0, 1, 2);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }

    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException{
        //  TriangleCheckedException checkedException  = new TriangleCheckedException();
        if (a<=0 ||b<=0 ||c <= 0){
            throw new IllegalTriangleException("Canh tam giac phai lon hon 0");
        }
        if (a+b <=c || b+c <=a ||a+c<=b){
            throw new IllegalTriangleException("Tong 2 canh ko phai lon hon canh con lai");
        }
        System.out.printf("3 canh %s, %s, %s laf 3 canh cua 1 tam giac ",a,b,c);
    }

}
