package codeForces.round378;

import java.util.Scanner;

/**
 * Created by Abbes on 31/10/2016.
 */
public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];


        int maxi = 0;
        int max =0;
        int sumL =0;
        int sumR =0;
        boolean verif = true;
        for (int i = 0; i < n; i++) {
            l[i] = in.nextInt();
            r[i] = in.nextInt();
            sumL += l[i];
            sumR +=r[i];

        }
        max = Math.abs(sumL - sumR);
        for(int i=0;i<n;i++){
            int sumLtemp = sumL - l[i] +r[i];
            int sumRtemp = sumR - r[i] + l[i];
            if(max<Math.abs(sumLtemp-sumRtemp)){
                max = Math.abs(sumLtemp-sumRtemp);
                maxi = i+1;
            }
        }
        System.out.println(maxi);

    }


}
