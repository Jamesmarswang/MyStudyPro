package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/25.
 */
public class Test14 {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7};

        int mid = binarySearch(arr,7);
        System.out.println(mid);
        System.out.println("====================");
        DirFind(arr, 7);
        System.out.println(DirFind(arr,4));

    }

    //二分查找算法

    public static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(mid <= high) {
            mid = (low + high) / 2;
            if (arr[mid] > target){
                high = mid - 1;
            }else if (arr[mid] < target){
               low = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;

    }

    //线性查找

    public static int DirFind(int[] arr,int target){
//        int i =0;
//        boolean flag = false;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == target)
                return i;
            else
                return -1;
        }
        return -1;
    }
}


