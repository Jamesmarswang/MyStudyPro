package JavaproTest.TestPackage;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 总结：
 * （1）登陆注册案例
 * （2）Set集合
 *      1.Set集合特点：无序，唯一
 *      2.HashSet集合（掌握）：A.底层数据是哈希表 B.哈希表底层依赖两个方法：HashCode()和equals()
 *                                                  执行顺序：首先比较哈希值是否相等
 *                                                      相同：继续执行equals（）方法
 *                                                      返回true：元素重复了，不添加
 *                                                      返回False：直接把元素加到集合
 *                              C.如何保证元素的唯一性
 *                              由Hashcode(）和equals()方法保证的
 *       3.TreeSet集合
 *          A。底层实现数据结构为红黑树（是一个平衡二叉树）
 *          B.保证元素的排序方式
 *              a.自然排序（元素具备比较性）
 *              b.集合具备比较性（比较器排序）
 *       4.案例
 *       A。获取无重复的随机数
 *       B.键盘输入学生信息
 *
 *   （3）Colection集合总结
 *          Collection
 *           |--List 有序可重复
 *              |--ArrayList 底层数据结构是数据：查询快，增删慢，线程不安全，效率高
 *              |--Vector 底层数据结构是数组:查询快，增删慢，线程安全，效率低
 *              |--LinkedList 底层数据结构是链表，查询慢，增删快，线程不安全，效率高
            |--Set
                |--HashSet底层数据结构为哈哈希表
                |--TreeSet底层数据结构是哈希表和链表
 */
public class Hello {
    public static void main(String[] args){
        Set<Stu> ts = new TreeSet<Stu>(new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                int num = o1.getSum()-o2.getSum();
                int num2 = num==0?o1.getChinese()-o2.getChinese():num;
                int num3 = num2==0?o1.getEnglish()-o2.getEnglish():num2;
                int num4 = num3==0?o1.getMath()-o2.getMath():num3;
                int num5 = num4==0?o1.getName().compareTo(o2.getName()):num4;
                return num5;
            }
        });
     for(int i=0;i<=5;i++)
     {
         Scanner s = new Scanner(System.in);
         System.out.println("请输入第"+i+"个学生的姓名：");
         String name = s.nextLine();
         System.out.println("请输入第"+i+"个学生的语文成绩：");
         String chineseString = s.nextLine();
         System.out.println("请输入第"+i+"个学生的数学成绩：");
         String mathString = s.nextLine();
         System.out.println("请输入第"+i+"个学生的英语成绩：");
         String EnglishString = s.nextLine();

         Stu st = new Stu();
         st.setName(name);
         st.setChinese(Integer.parseInt(chineseString));
         st.setEnglish(Integer.parseInt(EnglishString));
         st.setMath(Integer.parseInt(mathString));

         ts.add(st);
     }
        System.out.println("学生信息录入完毕!");
        System.out.println("学生成绩从高到低排序如下：");
        System.out.println("姓名\t语文成绩\t数学成绩\t语文成绩");
        for (Stu s : ts) {
            System.out.println(s.getName()+"\t"+s.getChinese()+"\t"+s.getEnglish()+"\t"+s.getMath());
        }
    }
}

class Stu{
    private String name;
    private int English;
    private int chinese;
    private int math;

    public Stu() {
        super();
    }
    public Stu(String name,int English,int chinese,int math){
        super();
        this.name = name;
        this.English =  English;
        this.chinese = chinese;
        this.math = math;
    }

    public void setEnglish(int English) {
        this.English = English;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return English;
    }

    public int getMath() {
        return math;
    }

    public int getChinese() {
        return chinese;
    }

    public String getName() {
        return name;
    }

    public int getSum(){
        return this.getEnglish()+this.getMath()+this.getChinese();
    }

}


