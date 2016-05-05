package JavaproTest.BeautifulDemoTest;

import java.util.Scanner;

/**
 * Created by Hyman on 2015/9/14.
 */
public class Test12 {
    public static void main(String[] args){
        LinkedNode head = null;
        LinkedNode cur = head;
        Scanner scanner = new Scanner(System.in);
        int data;
        System.out.println("输入单链表节点的值，输入0结束：");

        while (true){
            data = scanner.nextInt();
            if (data==0){
                cur.next = null;
                break;
            }

            LinkedNode node = new LinkedNode();
            cur.next = node;
            cur = cur.next;
        }


        //打印链表
        printList(cur);
    }

    //打印链表
    public static void printList(LinkedNode head){
        if (head == null || head.next == null){
            return;
        }

        head = head.next;

        while (head!=null){
            System.out.println(head.data+" ");
            head = head.next;
        }

        System.out.println();
    }

    public static LinkedNode union(LinkedNode a,LinkedNode b,LinkedNode union){
        LinkedNode pc = union = a;
        LinkedNode pa = a.next;
        LinkedNode pb = b.next;

        while (pa != null && pb.data != 0){
            if (pa.data < pb.data){
                pc.next = pa;
                pc = pa;
                pa = pa.next;
            }else {
                pc.next = pb;
                pc = pb;
                pb = pb.next;
            }

            if (pa !=null){
                pc.next = pa;
            }

            if (pb != null){
                pc.next = pb;
            }
        }

        return union;
    }
}



class LinkedNode{
    int data;
    LinkedNode next;
}


