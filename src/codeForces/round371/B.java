package codeForces.round371;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by Abbes on 14/10/2016.
 */
public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int[] list = new int[n+1];
        int k =0;
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            int j=0;
            while (j<k && list[j]<p){
                j++;
            }
            if(j==k || list[j]!=p){
                k++;
                for(int d=k;d>j;d--){
                    list[d] = list[d-1];
                }
                list[j]=p;

            }
        }




        if (k > 3) {
            System.out.println("NO");
        } else if (k < 3) {
            System.out.println("YES");
        } else {

            if (list[0] - list[1] == list[1] - list[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}
