/**
 * @ClassName test1
 * 第一节复习
 * @Author: K
 * @create: 2019/9/3-18:23
 **/
class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}

public class test1 {
    //逆置链表：遍历头插到新链表
    public static Node reverse1(Node head){
        Node result = null;
        Node p1 = head;
        while(p1 != null){
            Node next = p1.next;
            p1.next = result;
            result = p1;
            p1 = p1.next;
        }
        return result;
    }
    //递归
    public static Node reverse2(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node result = reverse2(head.next);
        head.next.next = head;
        head.next = null;
        return result;
    }
    //合并有序链表
    public static Node merge1(Node h1,Node h2){
        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }
        Node p1 = h1;
        Node p2 = h2;
        Node result = null;
        Node last = null;
        while(p1 !=  null && p2 != null){
            if(p1.value <= p2.value){
                if(result == null){
                    result = p1;
                }else{
                    last.next = p1;
                }
                last = p1;
                p1 = p1.next;
            }else {
                if(result == null){
                    result = p2;
                }else{
                    last.next = p2;
                }
                last = p2;
                p2 = p2.next;
            }
        }
        if(p1 != null){
            last.next = p1;
        }else{
            last.next = p2;
        }
        return result;
    }
    //不用判断新链表是否为空
    public static Node merge2(Node h1, Node h2){
        Node p1 = h1;
        Node p2 = h2;
        Node result = new Node(1);
        Node last = result;
        while(p1 != null && p2 != null){
            if(p1.value <= p2.value){
                last.next = p1;
                p1 = p1.next;
            }else{
                last.next = p2;
                p2 = p2.next;
            }

        }
        return result.next;
    }
    // 删除有序链表中重复的结点,留结点
    public static Node deleteDuplicated1(Node head){
        if(head == null){
            return null;
        }
        Node p1 = head;
        Node p2 = head.next;
        while(p2 != null){
            if(p1.value == p2.value){
                while(p1.value == p2.value && p2 != null){
                    p2 = p2.next;
                }
                p1.next = p2;
            }
            if(p2 != null) {
                p1 = p2;
                p2 = p2.next;
            }
        }
        return head;
    }
    // 删除重复结点2，不留相同的
    public static Node deleteDuplicated2(Node head){
        Node newHead = new Node(1);
        newHead.next = head;

        return newHead.next;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(4);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        deleteDuplicated1(head);

    }
}
