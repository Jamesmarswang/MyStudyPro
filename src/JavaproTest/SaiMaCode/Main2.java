package JavaproTest.SaiMaCode;


import java.util.Scanner;
import java.util.HashMap;


/**
 * Created by Hyman on 2015/9/25.
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        String[] temp = line.trim().split(" ");
        int[] arr = new int[temp.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }

        HashMap<Integer, Integer> sumMap = new HashMap<Integer, Integer>();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                sumMap.put(i, arr[i]);
            }

        }
        System.out.println(sumMap.get(0));
    }

}
