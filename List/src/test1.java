/**
 * @ClassName test1
 * 第一节复习
 * @Author: K
 * @create: 2019/9/3-18:23
 **/
class Node{
    int value;
    Node next;
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
        Node result = new Node();
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
    public static void main(String[] args) {

    }
}
