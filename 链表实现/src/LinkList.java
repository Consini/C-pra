/**
 * @ClassName LinkList
 * @Description:
 * @Author:
 * @Date: 2019/7/28
 * @Time: 10:31
 * @Version 1.0
 **/

class Node{
    int val;
    Node prev = null;
    Node next = null;

    Node(int val){
        this.val = val;
    }

}
public class LinkList {
    private Node head = null;
    private Node last = null;
    private int size = 0;

    //头插
    public void pushFront(int val){
        Node node = new Node(val);
        if(head == null){
            last = node;
        }else{
            node.next = head;
            head.prev = node;
        }
        head = node;
        size++;
    }

    //头删
    public void popFront(){
        if(size <= 0){
            System.out.println("无法对空链表进行删除！");
            return;
        }
        head = head.next;
        if(head != null){
            head.prev = null;
        }else{
            last = null;
        }
        size--;
    }

    //尾插
    public void pushBack(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
        }else{
            last.next = node;
            node.prev = last;
        }
        last = node;
        size++;
    }

    //尾删
    void popBack(){
        if(size <= 0){
            System.out.println("无法对空链表进行删除！");
            return;
        }
        if(size == 1){
            last = null;
            head = null;
        }else{
            last.prev.next = null;
            last = last.prev;
        }
        size--;
    }

    //判断给定的位置从 head 开始找近还是从 last 找近，然后找到给定位置的结点
    private Node getNode(int index){
        Node pos = null;
        int step = size - index - 1;
        if(index <= step){
            pos = head;
            for(int i = 0;i < index;i++){
                pos = pos.next;
            }
        }else{
            pos = last;
            for(int j = 0;j < step;j++){
                pos = pos.prev;
            }
        }
        return pos;
    }

    //给指定位置插入结点
    //默认结点下标从0开始，如 1   2   3，对应位置为 0   1   2
    public void add(int index,int val){
        if(index < 0 || index > size){
            System.out.println("位置错误，不存在该位置！");
            return ;
        }
        if(index == 0){
            pushFront(val);
        } else if(index == size){
            pushBack(val);
        } else{
            Node node = new Node(val);
            Node pos = getNode(index);
            pos.prev.next = node;
            node.prev = pos.prev;
            node.next = pos;
            pos.prev = node;
            size++;
        }
        return;
    }

    //删除给定位置的结点
    public void remove(int index){
        if(size <= 0){
            System.out.println("无法对空链表进行删除！");
            return;
        }
        if(index < 0 || index >= size){
            System.out.println("位置错误，无法删除！");
            return ;
        }
        if(index == 0){
            popFront();
        }else if(index == size - 1){
            popBack();
        } else{
            Node pos = getNode(index);
            pos.prev.next = pos.next;
            pos.next.prev = pos.prev;
            size--;
        }
        return;
    }

    //返回链表节点个数
    public int nodeNum(){
        return size;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //将链表置为空链表
    public void setLinkList(){
        head = null;
        last = null;
        size = 0;
    }

    //打印链表
    public void print(){
        for(Node p = head;p != null;p = p.next){
            System.out.print(p.val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.print();
        //System.out.println("3 2 1");
        list.popFront();
        list.popFront();
        list.popFront();
        list.print();
        //System.out.println("");
        list.pushBack(10);
        list.pushBack(20);
        list.pushBack(30);
        list.print();
        //System.out.println("10 20 30");
        list.popBack();
        list.popBack();
        list.popBack();
        list.print();
        //System.out.println("");
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);
        list.pushBack(5);
        list.print();
        //System.out.println("1 2 3 4 5");
        list.add(1, 10);
        list.print();
        //System.out.println("1 10 2 3 4 5");
        list.add(5, 20);
        list.print();
        //System.out.println("1 10 2 3 4 20 5");
        list.remove(1);
        list.print();
        //System.out.println("1 2 3 4 20 5");
        list.remove(4);
        list.print();
        //System.out.println("1 2 3 4 5");
    }

}
