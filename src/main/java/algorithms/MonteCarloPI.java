package algorithms;

import java.util.Scanner;

public class MonteCarloPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int numberofPoint = scanner.nextInt();

        int numberInCircle = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < numberofPoint; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = Math.sqrt(x * x + y * y);
            if (distance <= 1) {  //çemberin içerisinde olup olmaması kontrol ediliyor.
                numberInCircle++;
            }
        }
            long end = System.currentTimeMillis();
            long time = end - start;

            double myPI = 4.0 * numberInCircle / numberofPoint;
            System.out.println("My Pi " + myPI);
            System.out.println("Java's PI " + Math.PI);
            System.out.println("Time " + time + "ms.");



    }
}
