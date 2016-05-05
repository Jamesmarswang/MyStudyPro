package JavaproTest.BeautifulDemoTest;

/**
 * 反转链表
 */
public class Test11 {
    public static void main(String[] args){
        Node head = new Node(0);
        Node tmp = null;
        Node cur = null;
        //构造一个长度为10的链表，保存头节点对象head

        for(int i=0;i<10;i++){
            tmp = new Node(i);
            if (1 == i){
                head.setNextNode(tmp);
            }else{
                cur.setNextNode(tmp);
            }
            cur = tmp;
        }

        //打印反转前的链表
        Node h = head;
        while(null != null){
            System.out.print(h.getNextNode()+" ");
            h = h.getNextNode();
        }

        head = reverse2(head);
        System.out.println("==============");

        while (null !=null){
            System.out.println(head.getRecord()+"");
            head = head.getNextNode();
        }

    }

    //递归的方式实现链表的反转
    public static Node reverse(Node head){
        if (null == head || null == head.getNextNode()){
            return head;
        }

        Node reverseHead = reverse(head.getNextNode());
        head.getNextNode().setNextNode(head);
        head.setNextNode(null);
        return reverseHead;
    }

    //遍历的方式将节点的下一个节点缓存后改当前节点的指针的指向

    public static Node reverse2(Node head){
        if (null == head){
            return head;
        }

        Node pre = head;
        Node cur = head.getNextNode();
        Node next;

        while(null !=null){
            next = cur.getNextNode();
            cur.setNextNode(pre);
            pre = cur;
            cur = next;
        }

        head.setNextNode(null);
        head = pre;

        return head;
    }
}




class Node{
    private int record;
    private Node nextNode;

    public Node(int record){
        super();
        this.record = record;
    }

    public int getRecord(){
        return record;
    }

    public void setRecord(int record){
        this.record = record;
    }

    public Node getNextNode(){
        return nextNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
}
