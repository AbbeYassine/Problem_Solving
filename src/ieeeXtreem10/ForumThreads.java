package ieeeXtreem10;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Abbes on 22/10/2016.
 */
public class ForumThreads {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (in.hasNext()) {
            int a = in.nextInt();
            int p = in.nextInt();

            int[] tab = new int[p];
            for (int i = 0; i < p; i++) {
                tab[i] = in.nextInt();
            }
            int[] pages = new int[p / a + 1];
            int indice = 0;
            for (int i = 0; i < p; i++) {

                if (tab[i] == 0) {
                    if (pages[indice] >= a) {
                        indice++;
                    }
                    tab[i] = -1 * (indice + 1);
                    pages[indice]++;
                } else {
                    int k = i;
                    while (tab[k] > 0) {
                        k = tab[k] - 1;
                    }
                    pages[-1 * (tab[k]) - 1]++;
                }

            }

            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= indice; i++) {
                if (min > pages[i]) {
                    min = pages[i];
                }
                if (max < pages[i]) {
                    max = pages[i];
                }
            }
            int res = Math.abs(max - a) > Math.abs(min - a) ? Math.abs(max - a) : Math.abs(min - a);
            System.out.println(res);


        }
    }


}


