package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/9.
 *
 */
public class Test09 {
    public static void main(String[] args){

    }

    public static ListNode FindBegining(ListNode head){
        ListNode slow = null;
        ListNode fast = null;

        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                break;
            }
        }

        slow = head;

        while (slow !=null){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
