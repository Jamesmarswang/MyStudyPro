package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/8.
 */
public class Test02 {
    public static void main(String[] args) {

        int[][] arr;
        arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }

    }

    public static void rotate(int[][] matrix, int n) {
        for (int layer = 0; layer < n / 2; ++layer) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;

                //存储上边
                int top = matrix[first][i];

                //左到上
                matrix[first][i] = matrix[last - offset][first];

                //下到左
                matrix[last - offset][first] = matrix[last][last - offset];

                //右到下
                matrix[last][last - offset] = matrix[i][last];

                //上到右
                matrix[i][last] = top;
            }
        }
    }


}
