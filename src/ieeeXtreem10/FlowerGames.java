package ieeeXtreem10;

import java.util.Scanner;

/**
 * Created by Abbes on 22/10/2016.
 */
public class FlowerGames {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            long n = in.nextLong();
            String string = Long.toBinaryString(n);
            int length = string.length();
            long p = (long)Math.pow(2,length-1);
            System.out.println(2*(n-p)+1);
        }
    }
}
