package Ball.JavaBasic.Variables;

public class Sinhvien {
    public String ten;
    private int tuoi;
    public Sinhvien(String ten){
        this.ten = ten;
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi;
    }
    public void showStudent(){
        System.out.println("Ten :" + ten);
        System.out.println("Tuoi :" + tuoi);
    }
    public static void main(String[] args){
        Sinhvien sv = new Sinhvien("Bao An");
        sv.setTuoi(30);
        sv.showStudent();
    }
}
