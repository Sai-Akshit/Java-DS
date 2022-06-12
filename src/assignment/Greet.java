package assignment;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = obj.nextLine();
        System.out.println(String.format("Hello, %s hope you have a good day.", name));
    }
}
