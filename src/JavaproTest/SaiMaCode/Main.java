package JavaproTest.SaiMaCode;

import java.util.Scanner;

/**
 * Created by Hyman on 2015/9/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        String[] tokens = line.split(";");
        int[][] arr = new int[tokens.length][tokens[1].split(" ").length];
        for (int i = 0; i < tokens.length; i++) {
            String[] temp = tokens[i].trim().split(" ");
            for (int j = 0; j < temp.length; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }

        int tempValue = 0;
        int tempMax = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[0].length - 1; j++) {
                tempValue += (arr[i][j] + arr[i][j + 1]);
                tempValue += (arr[i + 1][j] + arr[i + 1][j + 1]);

                if (tempValue > tempMax) {
                    tempMax = tempValue;
                }

                tempValue = 0;
            }
        }

        System.out.println(tempMax);

    }
}
