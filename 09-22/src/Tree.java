import java.util.*;

/**
 * @ClassName Tree
 * @Author: K
 * @create: 2019/9/22-9:28
 **/
public class Tree {
    private class Node{
        private Node left = null;
        private Node right = null;
        private int val;
    }
    public static void levelOreder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node front = queue.poll();
            System.out.println(front.val + " ");
            if(front.left != null){
                queue.offer(front.left);
            }
            if(front.right != null){
                queue.offer(front.right);
            }
        }
    }
    public static void preOrder(Node root){
        Stack<Node> stack = new Stack<Node>();
        Node cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                System.out.print(cur.val+" ");
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }

    }
    public static void inOrder(Node root){
        Stack<Node> stack = new Stack<Node>();
        Node cur = root;
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.print(top.val+" ");
            cur =top.right;
        }
    }
    public static void postOrder(Node root){
        Stack<Node> stack = new Stack<Node>();
        Node cur = root;
        Node last = null;// 上一次被完全遍历完的结点
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.peek();
            if(top.right == null || top.right == last){
                System.out.print(top.val+" ");
                stack.pop();
                last = top;
            } else{
                cur = top.right;
            }
        }
    }
}
