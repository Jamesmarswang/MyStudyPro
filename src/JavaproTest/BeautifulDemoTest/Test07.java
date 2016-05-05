package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/9.
 */
public class Test07 {
    public static void main(String[] args) {

    }

    public ListNode partationOrignList(ListNode node, int x) {
        ListNode beforestart = null;
        ListNode beforeend = null;
        ListNode afterstart = null;
        ListNode afterend = null;

        while (node != null) {
            ListNode next = node.next;
            node.next = null;

            if (node.data < x) {
                if (beforestart == null) {
                    beforestart = node;
                    beforeend = beforestart;
                } else {
                    beforeend.next = node;
                    beforeend = node;
                }
            } else {
                if (afterstart == null) {
                    afterstart = node;
                    afterend = afterstart;
                } else {
                    afterend.next = node;
                    afterend = node;
                }
            }

            node = next;
        }

        if (beforestart == null) {
            return afterstart;
        }

        beforeend.next = afterstart;
        return beforestart;

    }

    /**
     * 方法2:只需用两个变量来实现链表的分割操作
     */

    public static ListNode partationOrignList2(ListNode node, int x) {
        ListNode beforestart = null;
        ListNode afterstart = null;

        while (node != null) {
            ListNode next = node.next;
            if (node.data < x) {
                node.next = beforestart;
                beforestart = node;
            } else {
                node.next = afterstart;
                afterstart = node;
            }

            node = next;
        }

        if (beforestart == null)
            return afterstart;

        ListNode head = beforestart;

        while (beforestart.next != null) {
            beforestart = beforestart.next;
        }

        beforestart.next = afterstart;


        return head;

    }

}
