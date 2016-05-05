package JavaproTest.BeautifulDemoTest;

import java.util.Stack;

/**
 * Created by Hyman on 2015/9/9.
 * 检查链表的回文数
 */
public class Test10 {
    public static void main(String[] args){

    }

    public static boolean isPalindrom(ListNode head){
        ListNode  fast = null;
        ListNode  slow = null;

        Stack<Integer> stack = new Stack<Integer>();

        while (fast !=null && fast.next !=null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast !=null){
            slow = slow.next;
        }

        while (slow!=null){
            int top = stack.pop().intValue();

            if (top !=slow.data){
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}
