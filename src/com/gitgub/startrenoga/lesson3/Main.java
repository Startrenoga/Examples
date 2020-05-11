package com.gitgub.startrenoga.lesson3;
import java.util.Scanner;

public class Main {

    public static double x1, x2;
    public static double a, b, c;

    public static void main(String[] args) {

        double Discr = Math.pow(b, 2) - (4 * a * c);

        if (Discr == 0) {
            x1 = (-b) / 2 * a;
            Scanner in = new Scanner(System.in);
            System.out.printf("x1 = x2 = %s", x1, x2);
            double a = in.nextDouble();
            double b = in.nextDouble();
            double c = in.nextDouble();

        } else if (Discr > 0) {
            double sqrtFromDiscr = Math.sqrt(Discr);
            x1 = (-b + sqrtFromDiscr) / (2 * a);
            x2 = (-b + sqrtFromDiscr) / (2 * a);
            System.out.println("x1 = %s, x2 = %s, x1, x2");

        } else {
            System.out.println("Нет целого решения так как дискриминант < 0");
        }
    }
}
