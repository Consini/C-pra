/**
 * @ClassName Solution
 * @Author: K
 * @create: 2019/9/19-20:38
 **/
import java.util.Arrays;
import java.util.TreeSet;
import java.util.*;
public class Solution {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
        public String toString(){
            return String.format("%d",val);
        }
    }
    public static TreeNode buildTree3 (int[] preorder,int preFrom,int preTo,int[] inorder,int inFrom,int inTo){
        if(preorder.length == 0){
            return null;
        }
        int rootValue = preorder[preFrom];
        int leftCount = 0;//左子树的结点个数
        for(leftCount = 0;leftCount < inorder.length;leftCount++){
            if(inorder[leftCount] == rootValue){
                break;
            }
        }
        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree3(preorder,1,1+leftCount,inorder,0,leftCount);
        root.right = buildTree3(preorder,1+leftCount,preorder.length,inorder,1+leftCount,inorder.length);
        return root;
    }

    public static boolean levelOrder2(TreeNode root){
        if(root == null){
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(true){
            TreeNode front = queue.poll();
            if(front == null){// 当遇到的结点不为空直接退出循环
                break;
            }
            queue.offer(front.left);
            queue.offer(front.right);
        }
        // 检查队列是否全为空
        while(!queue.isEmpty()){
            TreeNode n = queue.poll();
            if(n != null){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        System.out.println(buildTree3(pre,0,pre.length,in,0,in.length));
    }
}
