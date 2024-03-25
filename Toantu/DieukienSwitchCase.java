package Toantu;

public class DieukienSwitchCase {
    public static void main(String[] args) {
        String OS = "Win";
        switch (OS){
            case "Windows":
                System.out.println("Run on Windows");
                break;
            case "Mac":
                System.out.println("Run on Mac");
                break;
            case "Linux":
                System.out.println("Run on Linux");
                break;
            default:
                System.out.println("Don't run on any OS");
        }
    }
}
