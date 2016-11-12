package HowWinCompetition.Week1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Abbes on 03/11/2016.
 */
public class E {

    static Scanner newInput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new Scanner(new File("chairs.in"));
        } else {
            return new Scanner(System.in);
        }
    }

    static PrintWriter newOutput() throws IOException {
        if (System.getProperty("JUDGE") != null) {
            return new PrintWriter("chairs.out");
        } else {
            return new PrintWriter(System.out);
        }
    }

    public static void main(String[] args) throws IOException {

        try (Scanner in = newInput(); PrintWriter out = newOutput()) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            double res = (double) a / 2 + (double) b / 2 + (double) c / 2;
            out.println(res / 3);

        }
    }
}
