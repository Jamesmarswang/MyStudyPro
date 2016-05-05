package JavaproTest.SaiMaCode;

import java.util.Scanner;

/**
 * Created by Hyman on 2015/9/18.
 */
public class Test01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = null;
        while (sc.nextLine() != "null") {
            line = sc.nextLine();
        }

        System.out.println(line);
//        int   x1 = sc.nextInt();
//        int  x2 = sc.nextInt();
//        int y1 = sc.nextInt();
//        int y2 = sc.nextInt();


//        System.out.println(Math.sqrt(Math.abs(x1-x2)+Math.abs(y1-y2)));

    }

    public static int list(int[] array) {
        int[] lis = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[i] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int max = 0;
        for (int k = 0; k < lis.length; k++) {
            if (lis[k] > max) {
                max = lis[k];
            }

        }
        return max;
    }

}
