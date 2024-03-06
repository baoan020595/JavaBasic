public class Variables {
    int gender = 1;
    static String name = "Bao An";
    static int age = 30;
    static Variables staticVariables = new Variables();
    public static void main(String[] args){
        System.out.println("Gender: " + staticVariables.gender);
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
    }
}
