package assignment;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = obj.nextInt();
        int a=0,b=1,temp;

        System.out.print(String.format("%d %d ", a, b));
        for (int i=0; i<range; i++) {
            int c = a+b;
            System.out.print(c + " ");

            temp = b;
            b = c;
            a = temp;
        }
    }
}
