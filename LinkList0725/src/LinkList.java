import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.List;

/**
 * @ClassName LinkList
 * @Description:
 * @Author:
 * @Date: 2019/7/25
 * @Time: 9:46
 * @Version 1.0
 **/
class Node{
    int val;
    Node next = null;
    Node(int val){
        this.val = val;
    }
    public String toString(){
        return String.format("Node(%d)",val);
    }
}
public class LinkList {
    public static void main(String[] args) {//psvm
        Node head = null;
    }
    public static void pushAfter(Node pos,int val){
        Node node = new Node(val);
        /*
        Node next = pos.next;
        pos.next = node;
        node.next = next;*/
        node.next = pos.next;
        pos.next = node;
    }

    public Node removeAll(Node head, int val){
        Node tmpHead = new Node(-1);
        tmpHead.next = head;
        Node prev = tmpHead;
        Node result = head;
        while(result != null){
            if(result.val == val){
                prev.next = result.next;
            }else{
                prev = result;
            }
            result = result.next;
        }
        return tmpHead.next;
    }
    public Node merge(Node h1,Node h2){
        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }
        Node last = null;
        Node result = null;
        while(h1 != null && h2 != null){
            if(h1.val <= h2.val){

                if(result == null){
                    result = h1;
                }else{
                    last.next = h1;
                }
                last = h1;
                h1 = h1.next;
            }else{

                if(result == null){
                    result = h2;
                }else{
                    last.next = h2;
                }
                last = h2;
                h2 = h2.next;
            }

        }
        if(h1 == null){
            last.next = h2;
        }
        if(h2 == null){
            last.next = h1;
        }
        return null;
    }

public Node partition(Node head,int x){
    return null;
}

}
