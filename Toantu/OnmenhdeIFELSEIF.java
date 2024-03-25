package Toantu;

public class OnmenhdeIFELSEIF {
    public static void main(String[] args) {
        int a = 30;
        if (a % 2 ==0){
            System.out.println("Số chẵn 1");
        } else if (a % 4 + 1 ==0) {
            System.out.println("Số chẵn 2");
        } else if (a % 3 == 0) {
            System.out.println("Số lẻ 3 ");
        } else {
            System.out.println("Số lẻ 4");
        }
    }
}
