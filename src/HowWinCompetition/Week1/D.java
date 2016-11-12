package HowWinCompetition.Week1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Abbes on 02/11/2016.
 */
public class D {
    static Scanner newInput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new Scanner(new File("team.in"));
        } else {
            return new Scanner(System.in);
        }
    }

    static PrintWriter newOutput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new PrintWriter("team.out");
        } else {
            return new PrintWriter(System.out);
        }
    }

    public static void main(String[] args) throws IOException {

        try (Scanner in = newInput(); PrintWriter out = newOutput()) {


            int[] Andrew = new int[3];
            int[] peter = new int[3];
            int[] paul = new int[3];
            for (int i = 0; i < 3; i++) {
                Andrew[i] = in.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                peter[i] = in.nextInt();
            }
            for (int i = 0; i < 3; i++) {
                paul[i] = in.nextInt();
            }
            int s = 0;
            int[] tab = new int[27];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (i != j && i != k && j != k)
                            tab[s] = Andrew[i] * Andrew[i] + peter[j] * peter[j] + paul[k] * paul[k];
                        s++;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < tab.length; i++) {
                if (max < tab[i]) {
                    max = tab[i];
                }
            }
            out.println(Math.sqrt(max));


        }
    }
}
