package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/9.
 * <p/>
 * 注意：由于访问不到首节点，只能访问被删除的那个节点。所以只能将删除的那个节点
 * 直接赋值给下一个节点，然后将后继节点删除。如删除的是链表的尾节点，则无解。
 */
public class Test06 {
    public static void main(String[] args) {

    }

    public static boolean deleteNode(ListNode n) {

        if (n == null || n.next == null) {
            return false;
        }

        ListNode next = n.next;

        n.data = next.data;
        n.next = n.next.next;

        return true;

    }
}
