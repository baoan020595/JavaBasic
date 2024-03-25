package Toantu;

public class Toantu4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean checkValue = (a>1) & (b<2);
        boolean checkValue1 = (a>1) || (b>2);
        String s = (a % b ==0) ? "a khong chia het cho b" : "a chia het cho b";
        String text1 = "Selenium";
        String text2 = "Selenium";
        String btnColor = "#1234";
        String btnColor1 = "#1234";
        System.out.println(s);
        System.out.println(a+b*b+a/2);
        System.out.println(checkValue);
        System.out.println(checkValue1);
        System.out.println((text1 == text2) & (btnColor1 == btnColor));
    }
}
