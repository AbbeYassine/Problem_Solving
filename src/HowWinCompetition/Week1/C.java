package HowWinCompetition.Week1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Abbes on 02/11/2016.
 */
public class C {
    static Scanner newInput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new Scanner(new File("prepare.in"));
        } else {
            return new Scanner(System.in);
        }
    }

    static PrintWriter newOutput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new PrintWriter("prepare.out");
        } else {
            return new PrintWriter(System.out);
        }
    }

    public static void main(String[] args) throws IOException {
        try (Scanner in = newInput(); PrintWriter out = newOutput()) {
            int n = in.nextInt();

            int[] t = new int[n];
            int[] p = new int[n];
            int maxT = 0;
            int maxP = 0;
            int maxiP = 0;
            int maxiT = 0;
            int res = 0;
            boolean verifT = false; //Verifier passer au moins une fois Theory
            boolean verifP = false; //Verifier passer au moins une fois Practice

            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
                if (p[i] > maxP) {
                    maxP = p[i];
                    maxiP = i;
                }
            }
            for (int i = 0; i < n; i++) {
                t[i] = in.nextInt();
                if (t[i] > maxiT) {
                    maxT = t[i];
                    maxiT = i;
                }
                if (p[i] > t[i]) {
                    verifP = true;
                    res += p[i];
                } else if (p[i] < t[i]) {
                    verifT = true;
                    res += t[i];
                } else {
                    if (!verifP) {
                        res += p[i];
                        verifP = true;
                    } else {
                        res += t[i];
                        verifT = true;
                    }
                }
            }


            if (!verifP) {
                res = res - t[maxiP] + maxP;
            }
            if (!verifT) {
                res = res - p[maxiT] + maxT;
            }
            out.println(res);

        }
    }
}
