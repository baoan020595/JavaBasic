package Ball.JavaBasic.Variables.kieudulieu;

public class phuongthucbank {
public static void main(String[] args){
    Bank1.getBank1Info();
    double Tongtien = (Bank1.getInterestRate()*100000)/100;
    System.out.println("Tổng tiền lãi: "+Tongtien);
}
}
