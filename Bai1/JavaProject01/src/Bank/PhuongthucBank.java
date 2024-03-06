package Bank;

import Phuongthuc.Nganhang;

public class PhuongthucBank {
    public static void main(String[] args) {
        Nganhang.getNganhangInfo();
        double Tongtien =(Nganhang.getInterestRate() * 1000000)/100;
        System.out.println("Tổng tiền: "+Tongtien);
    }
}
