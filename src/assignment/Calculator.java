package assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the operator: ");
        char op = obj.next().charAt(0);

        System.out.print("Enter 1st number: ");
        int a = obj.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = obj.nextInt();

        switch (op) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println((float)a/b);
                break;
            default:
                System.out.println("Enter the correct operator!!");
                break;
        }

    }
}
