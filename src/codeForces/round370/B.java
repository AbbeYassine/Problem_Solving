

import java.util.Scanner;

/**
 * Created by Abbes on 14/10/2016.
 */
public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        if((Math.abs(x)+Math.abs(y))%2 !=0){
            System.out.print(-1);
        }else {
            System.out.print((Math.abs(x)+Math.abs(y))/2);
        }


    }
}
