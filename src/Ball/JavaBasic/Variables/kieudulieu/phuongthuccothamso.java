package Ball.JavaBasic.Variables.kieudulieu;

public class phuongthuccothamso {
    static float Interest_Rate = 7.3F;
    public static double tinhlai(long sotiengui){
        return ((sotiengui * Interest_Rate)/100);
    }

    public static void main(String[] args) {
        System.out.println("Tiền lãi 1 năm: " + tinhlai(50000));
    }
}
