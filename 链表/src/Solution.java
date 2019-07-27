/**
 * @ClassName Solution
 * @Description:
 * @Author:
 * @Date: 2019/7/25
 * @Time: 10:42
 * @Version 1.0
 **/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        for(p1 = headA;p1 != null;p1 = p1.next){
            for(p2 = headB;p2 != null;p2 = p2.next){
                if(p1.val == p2.val){
                    return p2;
                }
            }
        }
        return null;
    }


    public static void test(){

    }
    public static void main(String[] args) {
        test();
    }
}
