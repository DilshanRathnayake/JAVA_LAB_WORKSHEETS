package LW_03.Q3;

public class Main {
    public static void main(String[] args) {

        Bicycle b1 = new Bicycle("Lahiru", "0726848901");
        System.out.println(b1);

        Bicycle b2 = new Bicycle();
        b2.setOwnerDetails("Dilshan", "0715336438");
        System.out.println(b2);
    }
}
