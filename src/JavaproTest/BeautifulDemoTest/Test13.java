package JavaproTest.BeautifulDemoTest;

import java.util.Scanner;

/**
 * Created by Hyman on 2015/9/14.
 */
public class Test13 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        System.out.println(getValue(s));
    }

    public static int getValue(int n){

        int flag = 0;
        if (n <=1){
            flag = 1;
        }

        if (n >=2){
            flag = n*getValue(n-1);
        }
        return flag;
    }

}
