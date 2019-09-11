import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * 杨辉三角
 * @Author: K
 * @create: 2019/9/10-20:46
 **/
public class Solution {
    public static List<List<Integer>> generate1(int numRows){
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i <numRows;i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0;i <numRows;i++){
            for(int j = 0;j <= i;j++){
                list.get(i).add(1);
            }
        }
        for(int i = 2;i < numRows;i++){
            for(int j = 1;j < i;j++){
                int a = list.get(i - 1).get(j - 1);
                int b = list.get(i - 1).get(j);
                list.get(i).set(j,a + b);// 不能调用 set（）
            }
        }
        return list;
    }

    // 边循环边计算
    public static List<List<Integer>> generate2(int numRows){
        List<List<Integer>> list = new ArrayList<>();
        // 第一行
        list.add(new ArrayList<>());
        list.get(0).add(1);
        // 第二行
        list.add(new ArrayList<>());
        list.get(1).add(1);
        list.get(1).add(1);
        // 其余行
        for(int i = 2;i < numRows;i++){
            list.add(new ArrayList<>());
            list.get(i).add(1);
            for(int j = 1;j < i ;j++){
                int a = list.get(i - 1).get(j - 1);
                int b = list.get(i - 1).get(j);
                list.get(i).add(j,a + b);
            }
            list.get(i).add(1);
        }
        return list;
    }
    //提前计算的方法
    public static List<List<Integer>> generate3(int numRows){
        List<List<Integer>> list = new ArrayList<>();
        // 第一行
        list.add(new ArrayList<>());
        list.get(0).add(1);
        // 第二行
        list.add(new ArrayList<>());
        list.get(1).add(1);
        list.get(1).add(1);
        // 第三行
        list.add(new ArrayList<>());
        list.get(2).add(1);
        list.get(2).add(2);
        list.get(2).add(1);
        // 第四行
        list.add(new ArrayList<>());
        list.get(3).add(1);
        list.get(3).add(3);
        list.get(3).add(3);
        list.get(3).add(1);
        // 第五行
        list.add(new ArrayList<>());
        list.get(4).add(1);
        list.get(4).add(4);
        list.get(4).add(6);
        list.get(4).add(4);
        list.get(4).add(1);
        // 判断 numRows 是否小于 5
        if(numRows == 5){
            return list;
        }
        if(numRows < 5){
            return list.subList(0,numRows);
        }
        // 其余行
        for(int i = 5;i < numRows;i++){
            list.add(new ArrayList<>());
            list.get(i).add(1);
            for(int j = 1;j < i ;j++){
                int a = list.get(i - 1).get(j - 1);
                int b = list.get(i - 1).get(j);
                list.get(i).add(j,a + b);
            }
            list.get(i).add(1);
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().generate1(6));
        System.out.println(new Solution().generate2(6));
        System.out.println(new Solution().generate3(6));
    }
}
