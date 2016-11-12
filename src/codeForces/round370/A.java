package codeForces.round370;
import java.util.Scanner;

/**
 * Created by Abbes on 12/10/2016.
 */
public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = in.nextInt();
        }


        for (int i = 0; i <n-1; i++) {
            System.out.print((tab[i+1]+tab[i])+" ");
        }
        System.out.println(tab[n-1]);
    }

}
