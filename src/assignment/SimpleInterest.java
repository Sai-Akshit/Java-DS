package assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int p,t,r,si;
        p = obj.nextInt();
        t = obj.nextInt();
        r = obj.nextInt();

        si = (p*t*r)/100;
        System.out.println(String.format("The simple interest for %d principal %d time %d ROI is %d", p,t,r,si));

    }
}
