package JavaproTest.BeautifulDemoTest;

/**
 * Created by Hyman on 2015/9/9.
 */
public class Test05 {
    public static void main(String[] args) {

    }

    public static ListNode FindKnodeInList(ListNode head, int k) {
        if (k < 0) {
            return null;
        }

        ListNode p1 = head;
        ListNode p2 = head;

        for (int i = 0; i < k - 1; i++) {
            if (p2 == null) {
                return null;
            }

            p2 = p2.next;
        }

        if (p2 == null) return null;

        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}


class ListNode {
    int data;
    ListNode next;

    public ListNode(){

    }

    public ListNode(int data) {
        this.data = data;
    }


    public void setData(int value){
        this.data = value;
    }

    public void setNext(ListNode next1){
        this.next = next1;
    }

    public int getData(){
        return this.data;
    }

    public ListNode getNext(){
        return this.next;
    }
}