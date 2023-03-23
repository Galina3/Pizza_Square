package pizzaSquare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please write a diameter of pizza: ");
        double d = scanner.nextDouble();

        System.out.println(getSquarePizza(d));

    }
    //S = PI * (r ^ 2), PI = 3.141592653589793
    private static double getSquarePizza(double diameter){
        double radius = diameter / 2;
        return Math.PI * Math.pow(radius, 2);
    }
}
