package codeForces.round378;

import java.util.Scanner;

/**
 * Created by Abbes on 31/10/2016.
 */
public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = in.nextInt();
        }
        int k = in.nextInt();
        int[] joke = new int[k];

        for (int i = 0; i < k; i++) {
            joke[i] = in.nextInt();
        }

        int index = 0;
        boolean verif = true;
        int j = 0;
        int i = 0;

        int sum = 0;
        int resi = 0;
        String[] res = new String[n];
        while (i < n && verif) {
            int proposition = joke[j];
            j++;
            sum = 0;
            int p = 0;
            int maxi = 0;
            int max = 0;
            int[] temp = new int[n];
            while (i < n && proposition > sum) {
                temp[p] = input[i];
                sum += input[i];
                if (max < temp[p]) {
                    max = temp[p];
                    maxi = p;
                }
                i++;
                p++;
            }
            if (sum > proposition || sum < proposition) {
                verif = false;
            } else {
                int length = p ;
                while (length > 1) {
                    if ((maxi+1) < length && temp[maxi + 1] < temp[maxi]) {
                        res[resi] = index + maxi + 1 + " R";
                        resi++;
                        temp[maxi] += temp[maxi + 1];
                    } else if (maxi > 0 && temp[maxi] > temp[maxi - 1]) {
                        res[resi] = index + maxi + 1 + " L";
                        temp[maxi-1] += temp[maxi];
                        maxi--;
                        resi++;
                    } else {
                        break;
                    }
                    for (int c = maxi + 1; c < length - 1; c++) {
                        temp[c] = temp[c + 1];
                    }

                    length--;
                }
                verif = length == 1;
                index++;

            }

        }
        if(verif){
            System.out.println("YES");
            for(int m =0;m<resi;m++){
                System.out.println(res[m]);
            }
        }else {
            System.out.println("NO");
        }


    }
}
