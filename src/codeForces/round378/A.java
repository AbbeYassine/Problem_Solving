package codeForces.round378;

import java.util.Scanner;

/**
 * Created by Abbes on 31/10/2016.
 */
public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String mot = in.next();
        int res = 0;
        int i = 0;
        while (i < mot.length()) {
            int cpt = 1;
            while (i < mot.length() && (mot.charAt(i) != 'A' && mot.charAt(i) != 'E' && mot.charAt(i) != 'I' && mot.charAt(i) != 'O'
                    && mot.charAt(i) != 'U' && mot.charAt(i) != 'Y')) {
                cpt++;
                i++;
            }
            if (res < cpt) {
                res = cpt;
            }
            i++;
        }

        System.out.println(res);


    }
}
