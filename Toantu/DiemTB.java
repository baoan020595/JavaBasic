package Toantu;

public class DiemTB {
    public static void main(String[] args) {
        int TB = 7;
        if (TB > 7){
        System.out.println("Học sinh Giỏi");
            System.out.println("Hạnh kiểm Tốt");
    } else if (TB > 6 && TB < 8){
        System.out.println("Học sinh Khá");
            System.out.println("Hạnh kiểm khá");
    } else if (TB < 6 && TB > 5.5){
            System.out.println("Học sinh Trung Bình");
            System.out.println("Hạnh kiểm Trung bình");
        } else if (TB < 5) {
            System.out.println("Học sinh Yếu");
            System.out.println("Hạnh kiểm yếu");
        }
    }
}
