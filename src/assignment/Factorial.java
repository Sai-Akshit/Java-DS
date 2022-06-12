package assignment;

import java.util.Scanner;
public class Factorial {

    static int factorial(int num) {
        int fact=1;
        for (int i=1; i<=num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: 33");
        int num = obj.nextInt();
        System.out.printf("The factorial of %d is %d.%n", num, factorial(num));
    }
}
