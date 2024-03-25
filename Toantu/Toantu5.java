package Toantu;

public class Toantu5 {
    public static void main(String[] args) {
        String ActualText = "Login";
        String ExpectedText = "Logi";
        String s = (ActualText == ExpectedText) ? "Test case Passed" : "Test case Failed. Text trên button không đúng";
        System.out.println(s);
    }
}
