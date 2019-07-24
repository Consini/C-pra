/**
 * @ClassName LinkedList
 * @Description:
 * @Author:
 * @Date: 2019/7/24
 * @Time: 15:44
 * @Version 1.0
 **/
class Node{//定义结点
    int val;
    Node next ;

    public Node(int val){
        this.val = val;
        this.next = null;
    }

    public String toString(){
        return String.format("Node(%d)",val);
    }
}
public class LinkedList {//链表
    //增
    public static Node headInsert(Node head,int val){//头插
        // 1. 结点
        Node node = new Node(val);
        // 2. 让 head 成为 node 的下一个结点
        node.next = head;
        // 3. 更新第一个结点的引用
        return node;
    }

    public static Node tailInsert(Node head,int val){//尾插
        Node node = new Node(val);
        if(head == null){
            //为空，则让 node 成为 head 的下一个结点
            head.next = node;
            //return node;
        }else{
            Node last= head;
            //last 指向链表的最后一个元素
            while(last.next != null){
                last = last.next;
            }
            //让 node 成为 last 的下一个结点
            last.next = node;
        }
        return head;
    }

    //删除
    public static Node headDelect(Node head){//头删
        if(head == null){
            System.out.println("链表为空！无法删除！");
            return null;
        }
        return head.next;
    }

    public static Node tileDelect(Node head){//尾删
        if(head == null){
            System.out.println("链表为空！无法删除！");
            return null;
        }
        if(head.next == null){
            return null;
        }else{
            //找出倒数第二个结点
            Node second = head;
            while(second.next.next != null){
                second = second.next;
            }
            //让倒数第二个结点指向 null，就是删除了最后一个结点
            second.next = null;
            return head;
        }
    }

    public static void print(Node head){//打印链表
        System.out.print("打印链表： ");
        Node cur = head;
        while(cur != null){
            System.out.print(cur+"-->");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        Node head = null;

        head = headInsert(head, 0);
        head = headInsert(head, 1);
        head = headInsert(head, 2);

        // 打印
        print(head);	// 2 1 0

        // 尾插
        head = headDelect(head);
        print(head);	// 1 0

        head = tailInsert(head, 10);
        head = tailInsert(head, 20);
        head = tailInsert(head, 30);
        print(head);	// 1 0 10 20 30
        head = (head);
        head = tileDelect(head);
        head = tileDelect(head);
        head = tileDelect(head);
        head = tileDelect(head);
        head = tileDelect(head);
        head = headDelect(head);	// 报错

        print(head);		// 空

        head = headInsert(head, 100);
        print(head);		// 100
    }
}
