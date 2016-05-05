package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/9.
 */
public class Test03 {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[][]{{1, 0, 3}, {4, 5, 6}, {7, 8, 9}};

        setzero(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }

            System.out.println("\n");
        }
    }

    public static void setzero(int[][] matrix) {
        boolean[] raw = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    raw[i] = true;
                    column[j] = true;
                }
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (raw[i] == true || column[j] == true) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
