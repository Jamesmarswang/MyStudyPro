package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/9.
 */
public class Test08 {
    public static void main(String[] args) {



    }

    /**
     *
     * @param l1
     * @param l2
     * @param carry
     * @return ListNode
     *
     * 递归的实现方法。
     */
    public static ListNode addList(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode result = new ListNode();

        int value = carry;

        if (l1 != null) {
            value += l1.data;
        }

        if (l2 != null) {
            value += l2.data;
        }

        result.data = value % 10;

        ListNode more = addList(l1 != null ? null : l1.next, l2 != null ? null : l2.next, value >= 10 ? 1 : 0);

        result.setNext(more);

        return result;

    }

//    public static ListNode addList2(){
//
//    }
}
