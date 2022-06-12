package assignment.function;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = obj.nextInt();
        System.out.print("Enter second number: ");
        int num2 = obj.nextInt();
        System.out.print("Enter third number: ");
        int num3 = obj.nextInt();

        System.out.println("The largest number is " + max(num1, num2, num3));
        System.out.println("The smallest number is " + min(num1, num2, num3));
    }

    static int max(int a, int b, int c) {
        if (a>=b && b>=c) {
            return a;
        } else if (b>=c && c>=a) {
            return b;
        } else if (c>=b && b>=a) {
            return c;
        }
        return -1;
    }

    static int min(int a, int b, int c) {
        if (a<=b && b<=c) {
            return a;
        } else if (b<=c && c<=a) {
            return b;
        } else if (c<=a && a<=b) {
            return c;
        }
        return -1;
    }
}
