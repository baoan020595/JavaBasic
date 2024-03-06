package Phuongthuc;

public class Nganhang {
    static int VAT = 10000;

    static String BankName = "TP BANK";
    static int BankPhone = 123456;
    static String Address = "K35/43 Dương Đình Nghệ";
    static float Interest_Rate = 2.4F;
    public static void getNganhangInfo(){
        System.out.println("Bank Name: "+BankName);
        System.out.println("Bank Phone: "+BankPhone);
        System.out.println("Address: "+ Address);
        System.out.println("Interest_Rate: "+Interest_Rate);
    }
    public static float getInterestRate(){
        return Interest_Rate;
    }
}
