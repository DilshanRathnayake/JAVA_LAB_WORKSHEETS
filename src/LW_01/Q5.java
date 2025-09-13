package LW_01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter outer circle radius: ");
        double outerCircleRadius = scanner.nextDouble();

        System.out.println("Enter inner circle radius: ");
        double innerCircleRadius = scanner.nextDouble();

        Circle outerCircle = new Circle(outerCircleRadius);
        Circle innerCircle = new Circle(innerCircleRadius);

        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();

        double outerCir = outerCircle.computeCircumference();
        double innerCir = innerCircle.computeCircumference();

        double shadeArea = outerCircleArea - innerCircleArea;


        System.out.println("Circumferences of outer circle : " + outerCir + " and " + " inner circle : " + innerCir);
        System.out.println("Shaded Area : " + shadeArea);
    }


}
