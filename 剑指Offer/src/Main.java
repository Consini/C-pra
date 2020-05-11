import java.util.*;
/**
 * @Description TODO
 * @Author K
 * @Date 2019/12/23 17:56
 **/
public class Main {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];// 标记数组，判断当前位置是否走过
        // 遍历二维数组，找到第一个相同字符的位置，进行后面的判断
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                if(str[0]==matrix[i*cols+j]) {
                    if (judge(matrix,rows,cols,str,i,j,0,flag)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    // 判断从i位置开始直到结束，上下左右是否有匹配的字符
    // 初始数组，行数，列数，匹配字符数组，匹配的行，匹配的列，str第几个字符串，标记数组
    private static boolean judge(char[] matrix,int rows,int cols,char[] str,int i,int j,int k,boolean[] flag){
        int index = i*cols+j;
        // 递归结束条件
        if(i < 0 || j < 0 || i > rows || j > cols || flag[index] == true || matrix[index] != str[k]){
            return false;
        }
        // 走到str末尾，表示全部匹配成功
        if(k == str.length-1){
            return true;
        }
        // 当前位置已经走过，标记为 true
        flag[index] = true;
        //
        if(judge(matrix,i-1,j,rows,cols,flag,str,k+1) ||
                judge(matrix,i+1,j,rows,cols,flag,str,k+1) ||
                judge(matrix,i,j-1,rows,cols,flag,str,k+1) ||
                judge(matrix,i,j+1,rows,cols,flag,str,k+1))

        if((c==matrix[i-cols])) {//top
            i = i-cols;
        }else if(i+cols<matrix.length&&c==matrix[i+cols]) {//down
            i=i+cols;
        }else if(i%cols!=0&&i>=1&&c==matrix[i-1]){//left
            i-=1;
        }else if((i+1)%cols!=0&&i+1<matrix.length&&c==matrix[i+1]){//right
            i+=1;
        }
        return false;
    }
    public static void main(String[] args) {
        char[] a = "ABCESFCSADEE".toCharArray();
        char[] c1 ="ABCB".toCharArray();
        System.out.println(hasPath(a,3,4,c1));

    }
}
