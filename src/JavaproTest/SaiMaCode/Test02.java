package JavaproTest.SaiMaCode;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Hyman on 2015/9/18.
 */
public class Test02 {
    public static void main(String[] args) {
        calThnumuser("E:\\高低风险替换策略研究_更改频繁活动点算法之后\\联通原始数据\\联通_删除过多通话次数之后\\");
    }

    public static void calThnumuser(String path) {
        String[] files = new File(path).list();
        System.out.println("总的文件数：" + files.length);
        Set<BigInteger> set = new HashSet<BigInteger>();
        List<BigInteger> list = new ArrayList<BigInteger>();
        BufferedReader br = null;
        for (String file : files) {
            try {
                br = new BufferedReader(new FileReader(path + file));
                String line = null;
                while ((line = br.readLine()) != null) {
                    String id = line.substring(0, line.indexOf("\t"));

                    BigInteger ID = new BigInteger(id.trim());//堆内存会出现溢出
                    set.add(ID);
                    list.add(ID);
//                    System.out.println(ID+"->"+id);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(file+"处理完成！");

        }
        try {
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("SET集合的输出：" + set.size());
        System.out.println("LIST集合的输出：" + list.size());
    }
}
