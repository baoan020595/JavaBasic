public class learnVariables {
    static int age = 32; //biến toàn cục
    public void sayHello(){
        int tuoi = 30; //biến cục bộ
        System.out.println(age);
        System.out.println("Tuoi la: " + tuoi);
    }
    public static void main(String[] args){
        System.out.println(age);

        //Cách 1
        learnVariables Bo = new learnVariables();
        Bo.sayHello();
        //Cách 2

    }
}
