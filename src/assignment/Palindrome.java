package assignment;
import java.util.Scanner;

public class Palindrome {

    static boolean palindromeCheck(int num) {
        int last_digit, reverse_num = 0, temp=num;
        while (temp != 0) {
            last_digit = temp % 10;
            reverse_num = reverse_num*10 + last_digit;
            temp /= 10;
        }
        return reverse_num == num;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        if (palindromeCheck(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
