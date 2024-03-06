package Bank;

public class Phuongthuccothamso {
    static float Interest_Rate = 7.3F;
    public static double Tinhlai(long Sotiengui){
        return ((Sotiengui * Interest_Rate)/100);
    }

    public static void main(String[] args) {
        System.out.println("Tiền lãi 1 năm: "+Tinhlai(500000));
    }
}
