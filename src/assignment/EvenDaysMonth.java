package assignment;

import java.util.Scanner;
public class EvenDaysMonth {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int monthNum, count=0;
        int monthDays[] = {};
        for (int i=1; i<=13; i++) {
            if (i==2) {
                monthDays[i] = 28;
            } else if (i%2 == 1) {
                monthDays[i] = 30;
            } else if (i%2 == 0) {
                monthDays[i] = 31;
            }
        }
        System.out.print("Enter the number of month: ");
        monthNum = obj.nextInt();
        for (int i=1; i<=monthDays[monthNum]; i++) {
            if (i%2 == 0) {
                count++;
            }
        }
        System.out.println("The number of days Kunal can go out is " + count);
    }
}
