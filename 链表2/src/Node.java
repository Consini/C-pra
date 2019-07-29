/**
 * @ClassName Node
 * @Description:
 * @Author: 寇明珠
 * @Date: 2019/7/28
 * @Time: 9:34
 * @Version 1.0
 **/
public class Node {
    int val;
    Node next = null;
    Node random = null;

    public Node(int val){
        this.val = val;
    }

    public Node(int val,Node next,Node random){
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
