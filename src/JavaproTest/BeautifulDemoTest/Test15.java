package JavaproTest.BeautifulDemoTest;

import java.util.Scanner;

/**
 * Created by Hyman on 2015/9/25.
 * 各种排序算法的实现：自我编程实现
 */
public class Test15 {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 5, 7, 8, 4};
//        BubbleSort1(arr);
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println("===================");

//        InsertSort2(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] line = new String[n];
//        input.close();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            line[i] = input.nextLine();
        }

        for (String lin : line) {
            System.out.println(lin);
        }

        input.close();
    }

    public static void BubbleSort1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void BubbleSort2(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int BinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        int mid = 0;

        while (mid <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int OrdinarySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            } else {
                return -1;
            }
        }

        return -1;
    }


    public static void InsertSort1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void InsertSort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp > arr[j]) {
                    arr[j + 1] = arr[j];
                }
            }
            arr[j + 1] = temp;
        }
    }


    public static void SelectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    int temp = arr[j];
                    arr[j] = max;
                    max = temp;
                }
            }
            arr[i] = max;
        }
    }

    //Shell排序
    public static void ShellSort(int[] arr) {
        int i = 0;
        int j = 0;
        int temp = 0;
        int gap = arr.length;

        do {
            gap = gap / 3 + 1;
            for (i = gap; i < arr.length; i++) {
                if (arr[i] < arr[i - gap]) {
                    temp = arr[i];
                    for (j = i - gap; arr[j] > temp; j -= gap) {
                        arr[j + gap] = arr[j];
                    }
                    arr[j + gap] = temp;
                }
            }
        } while (gap > 1);
    }

}


//堆排序

class HeapSortDemo {

    public void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[j] = arr[i];
        arr[i] = temp;
    }


    public void HeapAdjust(int[] arr, int s, int n) {
        int i = 0;
        int temp = arr[s];
        for (i = 2 * s; i <= n; i *= 2) {
            if (i < n && arr[i] < arr[i + 1]) {
                i++;
            }
            if (temp >= arr[i]) {
                break;
            }

            arr[s] = arr[i];
            s = i;
        }

        arr[s] = temp;
    }

    public void HeapSort(int[] arr, int n) {
        int i = 0;
        for (i = n / 2; i > 0; i--) {
            HeapAdjust(arr, i, n);
        }

        for (i = n; i > 1; i--) {
            Swap(arr, 1, i);
            HeapAdjust(arr, i, i - 1);
        }
    }
}

class QuickSort1 {

    public void swap(int[] arr, int low, int high) {
        int temp = 0;

        temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    public int Partion(int[] arr, int low, int high) {
        int point = 0;
        point = arr[low];

        while (low < high) {
            while (low < high && arr[high] >= point) {
                high--;
            }

            swap(arr, low, high);

            while (low < high && arr[low] <= point) {
                low++;
            }

            swap(arr, low, high);
        }
        return point;
    }

    public void QSort(int[] arr, int low, int high) {
        int point = 0;
        if (low < high) {
            point = Partion(arr, low, high);
            QSort(arr, low, point - 1);
            QSort(arr, point + 1, high);
        }
    }

    public void QuickSort(int[] arr, int n) {
        QSort(arr, 0, n - 1);
    }
}



