package ieeeXtreem10;

import java.util.Scanner;

/**
 * Created by Abbes on 22/10/2016.
 */
public class GameOfStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int G = in.nextInt();
            int s = 0;
            for (int j = 0; j < G; j++) {
                int number_pile = in.nextInt();
                for (int p = 0; p < number_pile; p++) {
                    s += (in.nextInt() - 1) / 2;
                }
            }
            if (s % 2 != 0) {
                System.out.println("Alice");
            }else {
                System.out.println("Bob");
            }
        }
    }
}
