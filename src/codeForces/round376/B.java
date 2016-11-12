package codeForces.round376;

import java.util.Scanner;

/**
 * Created by Abbes on 16/10/2016.
 */
public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int day1 = in.nextInt();
        int i;
        for (i = 0; i < n - 1; i++) {
            int day2 = in.nextInt();
            if (day1 % 2 != 0) {
                day2 = day2 - 1;
            }
            day1 = day2;
            if (day1 < 0) {

                break;
            }
        }
        if (i == n - 1 && day1 % 2 == 0 && day1>=0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
