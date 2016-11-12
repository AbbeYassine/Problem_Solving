package codeForces.round371;
import java.util.Scanner;

/**
 * Created by Abbes on 13/10/2016.
 */
public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l1 = in.nextLong();
        long r1 = in.nextLong();
        long l2 = in.nextLong();
        long r2 = in.nextLong();
        long k = in.nextLong();
        long max = 0;
        long min = 0;
        max = l1 > l2 ? l1 : l2;
        min = r1 < r2 ? r1 : r2;

        if (min < max) {
            System.out.println(0);
        } else {
            if (k >= max && k <= min)
                System.out.println(min - max);
            else
                System.out.println(min - max + 1);
        }

    }
}
