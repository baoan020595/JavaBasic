package Toantu;

public class Toantu3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        boolean checkValue = (a<1) || (b>2);
        String s =(a % b ==0)? "a chia het cho b" : "a khong chia het cho b";
        System.out.println(s);
        System.out.println(checkValue);
    }
}
