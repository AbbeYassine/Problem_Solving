package codeForces.round376;

import java.util.Scanner;

/**
 * Created by Abbes on 16/10/2016.
 */
public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mot = in.next();

        int res = 0;
        int currentPos = 0;
        for (int i = 0; i < mot.length(); i++) {
            int c = mot.charAt(i);
            int pos = c % 97;
            if (Math.abs(pos - currentPos)> 13) {
                res = res + (25 - Math.abs(pos-currentPos) + 1);
            } else {
                res = res + (Math.abs(pos - currentPos));
            }

            currentPos = pos;

        }
        System.out.println(res);

    }
}
