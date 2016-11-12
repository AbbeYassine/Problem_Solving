package codeForces.round372;
import java.util.Scanner;

/**
 * Created by Abbes on 11/10/2016.
 */
public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();

        int out = 1;
        int item = in.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int newItem = in.nextInt();
            if (newItem - item <= c) {
                out++;
            } else {
                out = 1;
            }
            item = newItem;
        }
        System.out.println(out);
    }

}
