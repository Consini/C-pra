import org.omg.PortableServer.LIFESPAN_POLICY_ID;

/**
 * @ClassName Main
 * @Description:
 * @Author:
 * @Date: 2019/7/27
 * @Time: 10:06
 * @Version 1.0
 **/
public class Main {
    /**
     * 测试面试题
     * 1）链表的逆置
     * 2）删除与给定 val 值相同的结点
     * 3）合并两个有序结点
     * 4）按 x 分割链表
     * 5）删除重复结点
     * 6）找到链表的中间结点
     * 7）找到链表的倒数第 k 个结点
     * 8）复杂链表的复制
     * 9）旋转链表
     * @param solution
     */

    public static void main(String[] args) {
        Solution solution = new Solution();
        testReserveList(solution);//测试逆置链表
        testRemoveElements(solution);//测试移除链表
        testMegerTwoLists(solution);//测试合并两个有序结点
        testSeparateX(solution);//测试按 x 分割链表
        testDeleteDuplicated(solution);//测试删除重复结点
        testMiddleNode(solution);//测试找中间结点
        testFindKthToTail(solution);//测试找到链表的倒数第 k 个结点
        testCopyRandom(solution);//测试复制复杂链表
        testRotateRight(solution);//测试旋转链表
    }


    /*1. 构建测试数据
      2. 进行测试
      3. 对测试结果进行打印*/

    //  1）链表的逆置
    public static void testReserveList(Solution solution){
        ListNode head1 = createReserveList1();
        ListNode result1 = solution.reserveList(head1);
        printList(result1);//null

        ListNode head2 = createReserveList2();
        ListNode result2 = solution.reserveList(head2);
        printList(result2);//4 --> 3 --> 2 --> 1 --> null

    }
    //构建测试用例
    private static ListNode createReserveList1(){//链表为 null
        return null;
    }
    private static ListNode createReserveList2(){//链表不为空
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    // 2）删除与给定 val 值相同的结点
    public static void testRemoveElements(Solution solution){
        ListNode head1 = createRemoveElementsList1();
        ListNode result1 = solution.removeElements(head1,2);
        printList(result1);//null

        ListNode head2 = createRemoveElementsList2();
        ListNode result2 = solution.removeElements(head2,3);
        printList(result2);//1 --> 4 --> null
    }
    //构建测试用例
    private static ListNode createRemoveElementsList1(){
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    private static ListNode createRemoveElementsList2(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    // 3）合并两个有序链表
    private static void testMegerTwoLists(Solution solution){
        ListNode head1 = createTestMegerTwoLists1();
        ListNode head2 = createTestMegerTwoLists2();
        ListNode result1 = solution.megerTwoLists(head1,head2);
        printList(result1);//1 --> 1 --> 1 --> 2 --> 3 --> 4 --> null

        ListNode head3 = createTestMegerTwoLists3();
        ListNode head4 = createTestMegerTwoLists4();
        ListNode result2 = solution.megerTwoLists(head3,head4);
        printList(result2);//1 --> 1 --> 2 --> 3 --> 3 --> 3 --> 5 --> null
    }
    //构建测试用例
    private  static ListNode createTestMegerTwoLists1(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }
    private  static ListNode createTestMegerTwoLists2(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }
    private  static ListNode createTestMegerTwoLists3(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }
    private  static ListNode createTestMegerTwoLists4(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        return n1;
    }

    // 4）按 x 分割链表
    private static void testSeparateX(Solution solution){
        ListNode head1 = createTestSeparateXList1();
        ListNode head2 = createTestSeparateXList2();
        ListNode head3 = createTestSeparateXList3();
        ListNode result1 = solution.separateX(head1,0);
        ListNode result2 = solution.separateX(head2,10);
        ListNode result3 = solution.separateX(head3,5);
        printList(result1);//1 --> 7 --> 3 --> 5 --> 8 --> 2 --> 6 --> null
        printList(result2);//1 --> 7 --> 3 --> 5 --> 8 --> 2 --> 6 --> null
        printList(result3);//1 --> 3 --> 2 --> 7 --> 5 --> 8 --> 6 --> null
    }
    //构建测试用例
    private  static ListNode createTestSeparateXList1(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(8);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        return n1;
    }
    private  static ListNode createTestSeparateXList2(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(8);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        return n1;
    }
    private  static ListNode createTestSeparateXList3(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(8);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        return n1;
    }

    // 5）删除重复结点
    public static void testDeleteDuplicated(Solution solution){
        ListNode head1 = createTestDeleteDuplicatedList1();
        ListNode result1 = solution.deleteDuplicated(head1);
        printList(result1);//null

        ListNode head2 = createTestDeleteDuplicatedList2();
        ListNode result2 = solution.deleteDuplicated(head2);
        printList(result2);//2 --> 3 --> 4 --> null
    }
    //构建测试用例
    private static ListNode createTestDeleteDuplicatedList1(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
    private static ListNode createTestDeleteDuplicatedList2(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }

    // 6）找中间结点
    private static void testMiddleNode(Solution solution){
        ListNode head1 = createTestMiddleNodeList1();
        ListNode result1 = solution.middleNode(head1);
        printList(result1);//3 --> 4 --> 5 --> null

        ListNode head2 = createTestMiddleNodeList2();
        ListNode result2 = solution.middleNode(head2);
        printList(result2);//3 --> 4 --> null
    }
    //构建测试用例
    private static ListNode createTestMiddleNodeList1(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
    private static ListNode createTestMiddleNodeList2(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    // 7）测试输出倒数第 k 个结点
    private static void testFindKthToTail(Solution solution){
        ListNode head1 = createTestFindKthToTail1();
        ListNode result1 = solution.findKthToTail(head1,10);
        printList(result1);//k值不在合法范围内！null

        ListNode result2 = solution.findKthToTail(head1,5);
        printList(result2);//1 --> 2 --> 3 --> 4 --> 5 --> null

        ListNode result3 = solution.findKthToTail(head1,3);
        printList(result3);//3 --> 4 --> 5 --> null
    }
    //构建测试用例
    private static ListNode createTestFindKthToTail1(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }

    // 8）测试复杂链表复制
    private static void testCopyRandom(Solution solution){
        Node head = createTestCopyRandom();
        Node result = solution.copyRandom(head);
        //通过调试观察 复制结果，包括 val, next ,random
    }
    //构建测试用例
    private static Node createTestCopyRandom(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n1.random = n3;
        n2.random = n4;
        n3.random = n3;
        return n1;
    }

    // 9) 测试旋转函数
    private static void testRotateRight(Solution solution){
        ListNode head = createTestRotateRight();
        ListNode result = solution.rotateRight(head,10);
        printList(result);//3 --> 4 --> 1 --> 2 --> null
    }
    //构建测试用例
    private static ListNode createTestRotateRight(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    //打印链表
    public static void printList(ListNode head){
        for(ListNode p = head;p != null;p = p.next){
            System.out.print(p.val+" --> ");
        }
        System.out.print("null");
        System.out.println();
    }

}
