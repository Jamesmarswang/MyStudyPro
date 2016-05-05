package JavaproTest.TestPackage;

import java.util.*;

/**
 * Created by Hyman on 2015/5/12.
 * Map集合可以存储键-值对的元素
 *Map与Collection集合的区别：
 *      1.Map存储元素是成对出现的
 *      2.Collection集合存储元素是单独出现的，Collection的儿子是唯一的，List是可重复的
 *    注意：
 *    Map集合的数据只跟键有关系跟值无关Collection是只针对元素有效
 */
public class MapClassDemo01 {
    public static void main(String[] args){
//        Map<String,String> m = new HashMap<String, String>();
//        System.out.println("map"+m);
//        m.put("邓超","孙俪");
//        m.put("郭靖","黄蓉");
//        m.put("杨康","穆念慈");
//        m.put("陈玄风","梅超风");
//
//        System.out.println("-------------------");
//        Set<Map.Entry<String,String>> set = m.entrySet();
//
//        for (Map.Entry<String,String> em : m.entrySet()) {
//            String key = em.getKey();
//            String value = em.getValue();
//            System.out.println(key+"=="+value);
//        }

        //HashMap是基于哈希表的Map接口实现，哈希值用来保证其键的唯一性（HashCode和equals方法实现）

//        HashMap<String,String> hm =  new HashMap<String, String>();
////        String key1 = "it001";
////        String value1 = "马云";
//        hm.put("it001","马云");
//        hm.put("it002","马华腾");
//        hm.put("it001","张朝阳");
//        hm.put("it001","离漫天");
//        hm.put("it001","罗曼");

//        TreeMap<Integer,String> thm = new TreeMap<Integer, String>();
//        Scanner sc = new Scanner(System.in);
//         ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String, String>>();
//         HashMap<String,String> hm1 = new HashMap<String, String>();

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(30);
//        list.add(20);
//        list.add(14);
//        list.add(54);
//        System.out.println("list;"+list);
//        Collections.sort(list);
//        System.out.println("排序后"+list);
//
//        System.out.println(Collections.binarySearch(list,20));
        ArrayList<String> array = new ArrayList<String>();
        String[] colors = {"黑桃","方块","红桃","梅花"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10",
                             "J","Q","K"};
        for (String color : colors) {
            for (String number : numbers){
                array.add(color.concat(number));
            }
        }

        array.add("小王");
        array.add("大王");
        System.out.println(array);

        ArrayList<String> fengqingyang = new ArrayList<String>();
        ArrayList<String> liugeng = new ArrayList<String>();
        ArrayList<String> liuyi = new ArrayList<String>();
        ArrayList<String> diPai = new ArrayList<String>();

        for (int i=0;i<array.size();i++){
            if (i >= array.size()-3) {
                diPai.add(array.get(i));
            }
            if (i % 3 == 0) {
                    fengqingyang.add(array.get(i));
            } else if (i % 3==1) {
                liugeng.add(array.get(i));
            } else if (i % 3==3) {
                liuyi.add(array.get(i));
            }

        }

        lookPoker("风清扬",fengqingyang);
        lookPoker("灵庆圩",liugeng);
        lookPoker("那款",liuyi);
        lookPoker("底牌",diPai);
    }

    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name + "的牌是：");
        for (String s:array)
        {
            System.out.println(s);
        }
    }
}

