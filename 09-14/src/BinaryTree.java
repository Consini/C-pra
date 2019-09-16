import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BinaryTree
 * 二叉树
 * @Author: K
 * @create: 2019/9/14-14:44
 **/
public class BinaryTree {
    // 静态内部类定义二叉树
    private static class Node{
        private char val;
        private Node left;
        private Node right;

        private Node (char val){
            this.val = val;
        }
        @Override
        public String toString(){
            return String.format("{%c}",val);
        }
    }
    // 创建二叉树
    public static Node buildTree(){
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');
        Node h = new Node('H');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.right = h;
        c.left = f;
        c.right = g;
        return a;
    }
    //前序遍历1:遍历思路
    public static void preorderTraversal1(Node root){
        if(root == null){
            return ;
        }
        System.out.println(root);
        preorderTraversal1(root.left);
        preorderTraversal1(root.right);
    }
    // 前序遍历2：汇总
    public static List<Character> preorderTraversal2(Node root){
        if(root == null){
            return new ArrayList<>();
        }
        List<Character> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(preorderTraversal2(root.left));
        list.addAll(preorderTraversal2(root.right));
        return list;
    }
    //中序遍历1:遍历思路
    public static void inorderTraversal1(Node root){
        if(root == null){
            return;
        }
       inorderTraversal1(root.left);
        System.out.println(root);
       inorderTraversal1(root.right);
    }
    // 中序遍历2：汇总
    public static List<Character> inorderTraversal2(Node root){
        if(root == null){
            return new ArrayList<>();
        }
        List<Character> list = new ArrayList<>();
        list.addAll(inorderTraversal2(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal2(root.right));
        return list;
    }
    // 后序遍历1:遍历思路
    public static void postorderTraversal1(Node root){
        if(root == null){
            return;
        }
        postorderTraversal1(root.left);
        postorderTraversal1(root.right);
        System.out.println(root);
    }
    //后序遍历2：汇总
    public static List<Character> postorderTraversal2(Node root){
        if(root == null){
            return new ArrayList<>();
        }
        List<Character> list = new ArrayList<>();
        list.addAll(postorderTraversal2(root.left));
        list.addAll(postorderTraversal2(root.right));
        list.add(root.val);
        return list;
    }
    // 遍历思路-求结点个数
    public static int count = 0;
    public static void getSize1(Node root){
        if(root == null){
            return ;
        }
        count++;
        getSize1(root.left);
        getSize1(root.right);
    }
    // 子问题思路-求结点个数,汇总
    public static int getSize2(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;
    }
    // 遍历思路-求叶子结点个数
    public static int leafSize = 0;
    public static void getLeafSize1(Node root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
     //（汇总）子问题思路-求叶子结点个数
    public static int getLeafSize2(Node root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    // （汇总）子问题思路-求第 k 层结点个数
    public static int getKLevelSize(Node root,int k){
        if(root == null){
            return 0;
        }
        if(k == 1){
            return 1;
        }
        return getKLevelSize(root.left,k - 1) + getKLevelSize(root.right,k - 1);
    }
    // 求树的深度（高度）
    public static int getHeight(Node root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left,right) + 1;
    }
    // 查找 val 所在结点，没有找到返回 null
    public static Node find(Node root, int val){
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
       Node left = find(root.left,val);
        if(left != null){
            return left;
        }
        Node right = find(root.right,val);
        if(right != null){
            return right;
        }
        return null;
    }
    // 判断二叉树中是否含有 值为 val 的结点，若有返回 true
    public static boolean find2(Node root,int val){
        if(root == null){
            return false;
        }
        if(root.val == val){
            return true;
        }
        if(find2(root.left,val)){
            return true;
        }
        if(find2(root.right,val)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = buildTree();
        System.out.println("前序遍历为：");
        preorderTraversal1(root);
        System.out.println("----------");
        System.out.println(preorderTraversal2(root));
        System.out.println("中序遍历为：");
        inorderTraversal1(root);
        System.out.println("----------");
        System.out.println(inorderTraversal2(root));
        System.out.println("后序遍历为：");
        postorderTraversal1(root);
        System.out.println("----------");
        System.out.println(postorderTraversal2(root));
        System.out.println("----------");
        count = 0;//每次清零，否则1下次会从原来结果上继续加
        getSize1(root);
        System.out.println("节点个数为： "+ count);
        System.out.println("节点个数为： "+getSize2(root));
        leafSize = 0;
        getLeafSize1(root);
        System.out.println("叶子节点个数为： "+ leafSize);
        System.out.println("叶子节点个数为： "+getLeafSize2(root));
        System.out.println("第4层结点个数为："+getKLevelSize(root,4));
        System.out.println("树的高度为："+getHeight(root));
        System.out.println(find(root,'F'));
        System.out.println("----------");
        System.out.println(find2(root,'p'));
    }
}
