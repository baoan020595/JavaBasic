package Ball.JavaBasic.Variables.kieudulieu;

public class PT2 {
    static float Laisuat = 2.4F;

    public static double Tinhlai(long sotiengui) {
        return ((sotiengui * Laisuat) / 100);
    }

    public static void main(String[] args) {
        System.out.println("Tiền lãi: " + Tinhlai(50000));
    }
}