/**
 * @ClassName BuildTree
 * @Author: K
 * @create: 2019/9/19-19:46
 **/
import sun.reflect.generics.tree.Tree;
import java.util.*;
public class BuildTree{
    private static class TreeNode{
        private TreeNode left = null;
        private TreeNode right = null;
        private int val;
        TreeNode(char val){
            this.val = val;
        }
    }
    private static class BTRV{
        private TreeNode root = null;
        private int used = 0;
        BTRV(TreeNode root,int used){
            this.root = root;
            this.used = used;
        }
    }
    public static BTRV buildTree(char[] preorder){
        if(preorder.length == 0){// 递归出口，后面的 # 没有给出时创建的树是相同的，如 5 3 4 # # 7 # # 1和5 3 4 # # 7 # # 1 # #
            return new BTRV(null,0);
        }
        char rootValue = preorder[0];
        if(rootValue == '#'){// 如果遇到 # ，说明到达叶子结点
            return new BTRV(null,1);
        }
        BTRV left = buildTree(Arrays.copyOfRange(preorder,1,preorder.length));
        BTRV right = buildTree(Arrays.copyOfRange(preorder,left.used + 1,preorder.length));
        TreeNode tmpRoot = new TreeNode(rootValue);
        tmpRoot.left = left.root;
        tmpRoot.right = right.root;
        return new BTRV(tmpRoot,1 + left.used + right.used);
    }

//    public static BTRV buildTree(List<Character> preorder){
//        if(preorder.size() == 0){// 递归出口，后面的 # 没有给出时创建的树是相同的，如 5 3 4 # # 7 # # 1和5 3 4 # # 7 # # 1 # #
//            return new BTRV(null,0);
//        }
//        char rootValue = preorder.get(0);
//        if(rootValue == '#'){// 如果遇到 # ，说明到达叶子结点
//            return new BTRV(null,1);
//        }
//        BTRV left = buildTree(preorder.subList(1,preorder.size()));
//        BTRV right = buildTree(preorder.subList(left.used + 1,preorder.size()));
//        TreeNode tmpRoot = new TreeNode(rootValue);
//        tmpRoot.left = left.root;
//        tmpRoot.right = right.root;
//        BTRV root = new BTRV(tmpRoot,1 + left.used + right.used);
//        return root;
//    }

    public static boolean isCompleteTree(Node root) {
        if (root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (true) {
            Node front = queue.poll();
            // 判断 front 是不是空结点
            if (front == null) {
                break;
            }
            queue.offer(front.left);
            queue.offer(front.right);
        }
        // 去检查队列中是否全为 null 了
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            if (n != null) {
                return false;
            }
        }

        return true;
    }
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char[] array = line.toCharArray();
        BTRV b = buildTree(array);
        //inorderTraversal(b.root);
}
}