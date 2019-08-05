/**
 * @ClassName YangMatrix
 * @Description:
 * @Author:
 * @Date: 2019/8/5
 * @Time: 13:17
 * @Version 1.0
 **/
public class YangMatrix {
    public static int findNum(int[][] a,int row,int col,int num){
        int i = 0;
        int j = col - 1;
        if(num < a[0][0] || num > a[row - 1][col - 1]){
            return -1;
        }
        while(i >= 0 && j <= col - 1){
            if(num == a[i][j]){
                return num;
            }else if(num < a[i][j]){
                j--;
            }else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 8, 9},{ 2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15} };
        if(findNum(arr,4,4,90) == -1){
            System.out.println("很抱歉，没有找到该数字!");
        }else{
            System.out.println("恭喜你，找到了!");
        }
    }
}
