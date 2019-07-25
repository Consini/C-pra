import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

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


}
