package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/7.
 * 字符串压缩算法
 */
public class Test01 {
    public static void main(String[] args) {


        System.out.println(getString("aaadvdvdvddd"));
    }

    public static String getString(String str) {
        StringBuffer sb = new StringBuffer();
        char last = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                sb.append(last);
                sb.append(count);
                count = 1;

                last = str.charAt(i);
            }
        }

        sb.append(last);
        sb.append(count);

        return sb.toString();
    }

}

