package Ball.JavaBasic.Variables;

public class Ball {
    int tuoi = 30;
    static int age = 30;
    static String name = "Bao An";
    public static void main(String[] args){
        Ball staticBall = new Ball();
        System.out.println("Tuoi " + staticBall.tuoi);
        System.out.println("Ten cua tui la: " + name);
        System.out.println("Tuoi cua tui la: " + age);
    }
}
