package Ball.JavaBasic.Variables.kieudulieu;

public class Bank2 {
    static String name = "TP";
    static String address = "K35/43 Dương Đình Nghệ";
    static String phone = "240923";
    static float Laisuat = 2.4F;
    public static void getBank2Info(){
        System.out.println(Bank2.name);
        System.out.println(Bank2.address);
        System.out.println(Bank2.phone);
        System.out.println(Bank2.Laisuat);
    }
    public static float getLaisuat(){
        return Laisuat;
    }
}
