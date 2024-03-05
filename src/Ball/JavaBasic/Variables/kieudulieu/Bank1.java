package Ball.JavaBasic.Variables.kieudulieu;

public class Bank1 {
    static int VAT = 1000;
    static String Bankname = "TP";
    static String Address = "K35/43 Dương Đình Nghệ";
    static String Phone = "240923";
    static float Interest_Rate = 2.4F;
    public static void getBank1Info(){
        System.out.println(Bank1.Bankname);
        System.out.println(Bank1.Address);
        System.out.println(Bank1.Phone);
        System.out.println(Bank1.Interest_Rate);
    }
    public static float getInterestRate(){
        return Interest_Rate;
    }

}
