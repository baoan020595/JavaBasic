public class Bien {
    public void sayHello(){
        int n = 10;
        System.out.println("Gia tri cua n la: " + n);
    }
    public static void main(String[] args){
        Bien bienlocal = new Bien();
        bienlocal.sayHello();
    }
}
