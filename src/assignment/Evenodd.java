package assignment;

import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if (num < 0) {
            System.out.println("Enter a positive integer!!");
        } else if (num % 2 == 1) {
            System.out.println(num + " is odd.");
        } else {
            System.out.println(num + " is even.");
        }
    }
}
