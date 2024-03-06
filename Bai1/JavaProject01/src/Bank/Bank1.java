package Bank;

public class Bank1 {
    static String Name = "TP bank";
    static int Phone = 240923;
    static String Address = "Đà Nẵng";
    static int age = 30;
    static float InterestRate = 72.5F;

    public static void getBank1Infor() {
        System.out.println("Name: "+Name);
        System.out.println("Phone: "+Phone);
        System.out.println("Address: "+Address);
        System.out.println("Age: "+age);
        System.out.println("InterestRate: "+InterestRate);
    }
    public static float getInterestRate(){
        return InterestRate;
    }
}
