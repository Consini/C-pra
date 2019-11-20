/**
 * @Description TODO
 * @Author K
 * @Date 2019/11/14 17:18
 **/
public class 杨氏矩阵 {
    public static  boolean Find(int target, int [][] array) {
        int i = 0,j = array.length - 1;
        while(i < array.length && j >= 0){
            if(array[i][j] == target){
                return true;
            }else if(array[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = new int[0][0];
        System.out.println(a.length);
        System.out.println(Find(1,a));
    }
}
