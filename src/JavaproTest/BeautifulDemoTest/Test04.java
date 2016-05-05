package JavaproTest.BeautifulDemoTest;

import java.util.Hashtable;

/**
 * Created by Hyman on 2015/9/9.
 * <p/>
 * //链表:删除单链表中的重复节点（注意链表是未排序的链表）
 */
public class Test04 {
    public static void main(String[] args) {

    }

    //方法一：采用额外的数据结构
    public static void deleteDumpUnsortedList(LinkendListNode node) {
        Hashtable table = new Hashtable();

        LinkendListNode privious = null;

        while (node != null) {
            if (table.contains(node.data)) {
                privious.next = node.next;
            } else {
                table.put(node.data, true);
                privious = node;
            }

            node = node.next;
        }
    }


    //方法二：不适用额外的缓冲数据结构，可考虑两个指针的操作，
    //一个指针用来循环链表，另一个用来对比数据进行操作

    public static void deletDumpUnsortedList(LinkendListNode head) {

        if (head == null) {
            return;
        }

        LinkendListNode current = head;
        while (current != null) {
            LinkendListNode runner = current;

            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }


}


class LinkendListNode {
    public int data;
    protected LinkendListNode next;

    public LinkendListNode(int data) {
        this.data = data;
    }
}
