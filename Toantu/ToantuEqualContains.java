package Toantu;

public class ToantuEqualContains {
    public static void main(String[] args) {
        int age = 30;
        String name = "Auto";
        String message = "Add Category successful.";
        if (age > 40 && (name.equals("Auto") || message.contains("success"))){
            System.out.println("Thỏa điều kiện");
        }
    }
}
